create table temper(
    STD_DE varchar2(11 char),--��¥ ���� �÷�
    area_cd varchar2(5 char),--���� �ڵ��ȣ�� ���� �÷�
    avg_temper number(5, 2), --��ձ���� ���� �÷�
    min_temper number(5, 2), --��������� ���� �÷�
    max_temper number(5, 2)  --�ְ����� ���� �÷�

);

select * from temper;
--drop table temper cascade constraint purge;

create table temper_data(
    std_de varchar2(11 char) primary key,--��¥ ���� �÷�
    area_cd varchar2(5 char),--���� �ڵ��ȣ�� ���� �÷�
    avg_temper number(5, 2), --��ձ���� ���� �÷�
    min_temper number(5, 2), --��������� ���� �÷�
    max_temper number(5, 2)  --�ְ����� ���� �÷�

);
--drop table temper_data cascade constraint purge;
--temper_data ���̺� temper ���̺� �ִ� ������ ����
insert into temper_data
    select
        replace(std_de , '-', '')std_de,
        area_cd,
        avg_temper,
        min_temper,
        max_temper
    from temper;
        
select * from temper_data;

--����� ����� �����µ�, �ְ�µ� ��ȸ
select min(min_temper)�����µ�, max(max_temper)�ְ�µ� from temper_data;
-------------------------------------------------------------------------------
--������� ����� �����µ�, �ְ�µ��� �ش�����
select B.STD_DE, B.min_temper, B.max_temper
    from(
        select min(A.min_temper) min_temper, max(A.max_temper) max_temper
        from temper_data A)A, temper_data B
        where B.min_temper = A.min_temper
        or B.max_temper = A.max_temper
        order by b.max_temper;
        

select B.STD_DE, B.min_temper, B.max_temper
    from(select min(min_temper) �����µ�, max(max_temper) �ְ�µ�
        from temper_data )A, temper_data B
        where B.min_temper = A.�����µ�
        or B.max_temper = A.�ְ�µ�
        order by b.max_temper;
        

create table STUDENT(
    S_NO number(3) primary key,
    S_NAME varchar2(10 char)not null,
    S_HEIGHT number(4,1)not null,
    S_CLASS varchar2(10 char)not null
);
create sequence STUDENT_SEQ;
insert into STUDENT values(STUDENT_SEQ.nextval, 'ASDF', 172.1, '1������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'ZXQV', 168.3, '2������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'QWER', 175.1, '2������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'TYUI', 153.1, '3������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'GHJK', 190.8, '1������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'VBNM', 176.2, '3������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'POIU', 185.3, '3������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'LKJH', 175.1, '2������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'MNBV', 153.1, '3������');
insert into STUDENT values(STUDENT_SEQ.nextval, 'ERTY', 183.1, '1������');

select *from STUDENT;

--window�Լ�
--��� �� ���̿� ���踦 ���� �����ϱ� ���� ���� �Լ�
--������ ���α׷��� �ϳ��� �������� ���� �ذ��� �� �ִ�
--��ǥ������ ���� ��� �����Լ��� �����Լ��� �ִµ� 
--����, �հ� ��� ���� ������ �� ����

--����
select �÷���, �÷���, �����Լ�, ...,
    over([partition by �÷���] [order by �÷���][windowing��])
    from ���̺��; 

--over(): oreder by, group by ������ ��ü�Ҽ� �ִ� �Լ�
--partition by : �÷��� �������� �׷�(��Ƽ��)�� ������
--order by : over�Լ� ������ ����
--windowing�� : �� ������ ������ ����
--  �ɼ�...
--  rows : ������ ����(���� ��������)
--  range: ������ ����(���� ������ �ִ� ���� ��������)
--  between ~ and : ���۰� �� ��ġ�� ����
--  unbounded preceding : ������ġ�� ù��° ��
--  unbounded following : ������ ��ġ�� ������ ��

--  rank : �ߺ����� ��ŭ ���� �������� ������Ŵ
select S_NAME, S_CLASS, S_HEIGHT,
    rank()over(order by S_HEIGHT desc)HEIGHT_RANK,
    rank()over(PARTITION by S_CLASS order by S_HEIGHT desc)IN_CLASS_RANK
    from STUDENT;
    
--dense_rank : �ߺ� ������ �����ص� ���������� ���� �������� ��Ÿ��
select S_NAME, S_CLASS, S_HEIGHT,
    rank()over(order by S_HEIGHT desc)RANK,
    dense_rank()over(order by S_HEIGHT desc)dense_RANK
    from STUDENT;

--first_value : �׷�(��Ƽ��)���� ���� ó���� ������ ��
select S_CLASS , S_NAME, S_HEIGHT,
    FIRST_VALUE(S_NAME)OVER(PARTITION by S_CLASS order by S_HEIGHT desc
    --������ ���� �׷� ������, �� �ȿ��� �л��� Ű �������� ����
    --�� �׷� ���� ó������ �������࿡�� ó�� ������ �л��� �̸����� �ҷ����ڴ�
    rows between UNBOUNDED PRECEDING and UNBOUNDED FOLLOWING)
from STUDENT;

--last_value : ��Ƽ�ǿ��� ���� �������� ������ ��
select S_CLASS , S_NAME, S_HEIGHT,
    --������ ���� �׷� ������, �� �ȿ��� �л��� Ű �������� ����
    last_VALUE(S_NAME)OVER(PARTITION by S_CLASS order by S_HEIGHT desc
    --�� �׷� ���� ó������ �������࿡�� �������� ������ �л��� �̸����� �ҷ����ڴ�
    rows between UNBOUNDED PRECEDING and UNBOUNDED FOLLOWING)
from STUDENT;

--lag : ���� ���� ���� ������
select S_CLASS, S_NAME, S_HEIGHT,
        --�������� S_HEIGHT ���� �����ðǵ� ������ ���� �׷��� ������, Ű ������������ ����,
        --���� ���� �࿡ ���� ���� ��� null���̸�'-'���� �ٲٰ�
    decode(lag(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT),null, '-',
    --���� ���� ���� ������ �� ���� �ҷ����ڴ�
    lag(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT))lag_HEIGHT
    from STUDENT;

--lead : ���� ���� ���� ������
select S_CLASS, S_NAME, S_HEIGHT,
        --�������� S_HEIGHT ���� �����ðǵ� ������ ���� �׷��� ������, Ű ������������ ����,
        --���� ���� �࿡ ���� ���� ��� null���̸�'-'���� �ٲٰ�
    decode(lead(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT),null, '-',
    --�������� ���� ������ �� ���� �ҷ����ڴ�
    lead(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT))lag_HEIGHT
    from STUDENT;
--ntile : ����� ����ڰ� ������ �׷� ���� ������ ���
--Ű �������� �������� 5���� �׷����� ������
select S_CLASS, S_NAME, S_HEIGHT,
    NTILE(5) over(order by S_HEIGHT desc)N_TILE
    from STUDENT;
