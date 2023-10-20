--�����ֿ� DB��ġ cmd����� SQLplus �� �ٷﺸ�鼭 DBA���� �ϴ� ������ ��¦ ������(���Ѻο�, tablespace)
--�����ϰ� �������(���̺�/��/�÷�/��Ű��/�ν��Ͻ�/������)
--SQL�� ��ɹ� �߿� ���Ǿ�(DDL)�� ���鼭 ���̺��� ����� �ð�
--���̺��� ����鼭 �ʿ��� �ڷ���(�ַ����� ����� �͸�)
--������ : VARCHAR2 / ������ : NUMBER / ��¥�� : DATE
--�������� ! / �켱 NOT NULL�� PRIMARY KEY�� �������!!
--          /FOREIGN KEY�� ������ ����...!
--���̺��� ������ �����ϰų�, �����غ��鼭 DDL�Ϸ� ����!!!
--------------------------------------------------------------------------------------------
--���� ���̺��� ������
--������ �̸�, ȸ��, ���� ���� �ְ�ʹ�
--���̺� �ϳ��� PK�ϳ� �־����� ���ڴ� => ��� PK�� ������ ������ ���鼭!

--���ٰ� PK?
--��ȣ���� ���� ���⿡ PK�� ���̴� ���� �� ���
--create table snack(
--    s_no number(4) primary key,
--    s_name varchar2(10 char) not null,
--    s_maker varchar2(10 char) not null,
--    s_price number(4) not null
--    );
--------------------------------------------------------------------------------------------
--������ DML�� �ٷﺼ��
--������ ���۾�(Data Manipulation Language)
--SELECT, INSERT, UPDATE, DELETE,...
--�ٿ��� CRUD(create read update delete)
--���⼭�� C�� (create table - X(DBA�� �۾�))
--  �����͸� ����ٴ� �ǹ��� C(insert - o)
-- ���´�
insert into ���̺��(�÷���, �÷���, �÷���,....)values(��, ��, ...);
--���� �־� ���ڸ�
insert into SNACK(s_no, s_name, s_maker, s_price)values(1, '��������', '������', 5000);

--�÷� ���� �ٲٱ� - ��!
insert into SNACK(s_name, s_price, s_no, s_maker)values('���޴���', 500,2,'�Ե�');

--�÷��� ���� �ȳְԵǸ� - ?! -����
--NOT NULL�� �����ٸ� ������� null�̶� ǥ����
--�������̸� ������ ��������� ������!
insert into SNACK(s_name, s_no)values('������',3);

--(�÷���, �÷���, ....)�ȳְ� �÷� ������� ���� �ִ� ����� ����!
insert into ���̺�� values (��, ��, ...);
insert into SNACK values (4, '����������', '�Ե�', 4000);
----------------------------------------------------------------------------------------------
--���̺� ����� �ٽ� ����
--4~5�� ������ ���� �־��!
drop table snack cascade constraint purge;

create table snack(
    s_no number(4) primary key,
    s_name varchar2(10 char) not null,
    s_maker varchar2(10 char) not null,
    s_price number(4) not null
    );
    
    insert into snack(s_no,s_name,s_maker,s_price)values(1,'�����','���',2000);
    insert into snack(s_no,s_name,s_maker,s_price)values(2,'���±�','���',2000);
    insert into snack(s_no,s_name,s_maker,s_price)values(3,'�Ŷ��','���',2000);
    insert into snack(s_no,s_name,s_maker,s_price)values(4,'���ڼ���','������',1500);
--�׷���...�����̾� 5�� �־ ��ȣ�� ������ �����ϸ������
--������ ������ ���� ��õ���� �Ǹ� ������ �־��ֱ� �����
--�����͸� ���鶧 ���� ��ȣ�� �ڵ����� ����� �Ǿ����� ���ڴ�

--factory pattern �̶�� �ؼ� �� �״�� ����ȭ �ý���
--MYSQL : Autoincreament �ɼ� �̶�� �͵� �ְ�,
--���� �츮�� ����ϰ� �ִ� OracleDB : Sequence ��� ���� ����
--      ������ �ߴٽ��� PKŰ ���� ��Ե� �ֱ�����
--      ��ȣ�� ������ �°� �ڵ����� ������ �ִ°ǵ�
--      ���̺���� �����ϰ�, �������δ� insert �� �����ص� sequence ���� ������ �ö�
--      ����, ������ ���� �ٽ� �������� ����.

--sequence(table���� ������)����
create sequence ��������; --������ ������
create sequence snack_seq;--���̺� ��  _seq�� �ٿ��ִ� ��ȭ�� ����

--��ü���� ������
create sequence ��������
    increament by 1 -- ������(1�� ����)
    start with 1 -- ���۰�
    minvalue -- �ּҰ�
    maxvalue -- �ִ밪
    nocycle / cycle --�ִ밪 ���޽� ���۰����� �ٽ� �ݺ����� ����
    nocache / cache -- �޸𸮿� �������� �̸� ����� ���� ������ ���� ����
    
--������ �������� �ᵵ �⺻���� �־ ������ �������� ���°ɷ�!

--sequence ����
drop sequence ��������;

--seuqence ��� : ��������.nextval
--���� ���̺� ���� �ߴٰ� �ٽ� ����� ���� �־�ô�!
drop table snack cascade constraint purge;
drop sequence snack_seq;

create table snack(
    s_no number(4) primary key,
    s_name varchar2(10 char) not null,
    s_maker varchar2(10 char) not null,
    s_price number(4) not null,
    s_exp date not null
    );
    create sequence snack_seq;
    
-- �ð� / ��¥
-- sysdate : ���� �ð� / ���� ��¥
select sysdate from dual;

insert into snack values(snack_seq.nextval,'���޴��� �����', 'ũ���', 500, sysdate);
--Ư���ð� / ��¥
-- �����Լ� - to_date('��','����')
-- ����(�빮��)- YYYY(���� 4�ڸ�),MM(��),DD(��),AM/PM(����/����),
--              HH, HH24(��õ),MI(��), SS(��)

-- ������ �� �־��ּ���!!
insert into snack values (snack_seq.nextval, '���޴��� ������', 'ũ���',500,to_date('2023-08-22 12','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���޴��� �����', 'ũ���',500,to_date('2023-08-25 03','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���޴��� �����Ƹ�', 'ũ���',500,to_date('2023-08-09 11','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '��������', '������',4500,to_date('2023-08-06 11','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '�����', '���',1500,to_date('2023-08-11 11','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '��Ŭ', 'ũ���',1100,to_date('2023-08-23 07','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '¥�İ�Ƽ', '���',1300,to_date('2023-08-01 08','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���̿�', '�Ե�',1000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));

select * from snack;

























