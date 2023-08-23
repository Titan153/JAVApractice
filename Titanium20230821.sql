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
--������ DML�� �ٷ��.
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
    increment by 1 -- ������(1�� ����)
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
insert into snack values (snack_seq.nextval, '���̿�', '�Ե�',2000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '��Ÿ500', '����',1600,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '��ټ�', '����',1700,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���ڼ���', '������',2000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '����', 'ũ���',2000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '����ſ��', 'ũ���',3000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '����', '������',3000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, 'ũ���굵', '����',3000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));

select * from snack;
--------------------------------------------------------------------------------------------------------------------------
--���� �����͵��� ��ȸ�غ��ô�!
--R(Read) *********
--select [distinct][�÷���],[�÷Ÿ� as ��Ī || �÷��� as ��Ī], [������ ���], [����Լ�],....
--from[���̺��]
--where[���ǽ�]
--group by[�׷���]
--having[�Լ� ���� ����]
--order by[���Ĵ�� ASC/DESC(��������/��������)];--�⺻���� ��������
--�� ����...

--�������̺� ��ü ��ȸ
--'*':���̺� ���� ��� �÷��� �����´�
--select * from snack;

--select s_maker from snack;
--distinct : �ߺ� ����
--select distinct s_maker from snack;

--��Ī ���� ��쿡�� select�� �ȿ��� ���� ����� �����ѵ�(+,-,*,/)
select s_price / 100 from snack;
--�÷��� ��ü�� s_price/100���� ����
--���� ���α׷��� ���� �����ϴ� ���� �÷����� �̿��ؼ� ���� �ҷ����� ��찡 �ִµ�,
--��Ī�� �Ἥ �򰥸��� �����ϴ� �뵵�� ���
--select s_price / 100 as s_price, 
sprice/100 s_price2 from snack;

--������ ���(���������))
--Dual ���̺��� ����
--1.����Ŭ ��ü���� �����ϴ� �������̺�
--2.�����ϰ� �Լ��� �̿��ؼ� ��� ������� Ȯ���� �� ����ϴ� ���̺�
select 1+'3' from dual; 
-- � ������� ���ñ�?=> 4�� ����
-- ��κ� �ٸ� ���� ���� ��쿡�� ���� �켱���� 13�̶�� ����� �����µ�
-- ����Ŭ������ �ݴ�� ���ڰ� �켱�õ�
-- ����Ŭ �������� �����ڰ� ���ڸ� ��������
select 1+'a' from dual;--����! invalid number

--���ڸ� �����ֱ� ���� �����ڰ� ���� �ִµ�
--'||'(shift + \)
select '3' || 10 from dual; --��� 310
------------------------------------------------------------------------------
--<������ ���� �Լ�>
--1.���� �Լ� 
--      -ABS(����) : ���밪 ���                              ex)ABS(-4.5)
--      -ROUND(����, M) : ���� �ݿø�, M�� �ݿø� ���� �ڸ���    ex)ROUND(5.36,1)
--      -POWER(����, N) : ���ڸ� N���� ���� ���               ex)POWER(2,3)
--      -TRUNC(N, M) : ���� ���� M��° �ڸ����� ����� ���� ���� ex)TRUNC(123.456,2)
--                                                          ex)TRUNC(123.456,-1) 
--                                                          ex)TRUNC(123.456,0) 
--      -MOD(M,N) : ���� M�� N���� ���� ������                 ex)MOD(12,10)
--      -SQRT(����) : ������ ������ ���� ���(���ڴ� ���)        ex)SQRT(9.0)

--2.���� �Լ�
--      -CONCAT(S1,S2) : �� ���ڿ��� ����              ex)CONCAT('ABCD','EFG')
--select CONCAT('ABCD','EFG') from dual;
--      -SUBSTR(S1, N, K) : ���ڿ��� N��° ���� K��° ��ŭ�� ���̸� ��ȯ
--                                                  ex)SUBSTR('ABCDEFG',3,4)
--      -INSTR(S1,S2,N,K) : S1�� N��° ���� �����Ͽ� ã���� �ϴ�
--       ���ڿ� S2�� K��° ��Ÿ���� ���ڿ��� ��ġ�� ��ȯ
--                                                  ex)INSTR('HELLO','L',1,2)
--      -LPAD(S,N,C):���ڿ� S�� �������κ��� ������ �ڸ� �� N����
--          ������ ���� C�� ä��                        ex)LPAD('ABC',5,'*')
--      -RPAD(S,N,C):���ڿ� S�� ���������κ��� ������ �ڸ� �� N����
--          ������ ���� C�� ä��                        ex)RPAD('ABC',5,'*')
--      -LTRIM(S1,S2) : ���ڿ� S1�� �������� ���ʿ� �ִ� ������ ���� S2����
--                                                  ex)LTRIM('*ABC','*')
--      -RTRIM(S1,S2) : ���ڿ� S1�� �������� �����ʿ� �ִ� ������ ���� S2����
--                                                  ex)RTRIM('*ABC','*')
--      -REPLACE(S1,S2,S3):S1�� ������ ���� S2�� ���ϴ� ���� S3�� ����
--                                                  ex)REPLACE('JACK and JUE', 'j','BL')
--      -LENGTH : ���� ���� �����ִ� �Լ� 
--      -LENGTH : ������ �뷮(����Ʈ)�� �����ִ� �Լ�
--select length('zzz')"���ڼ�",length('zzz')"����Ʈ��"FROM dual;

--3.��¥/�ð� ���� �Լ�
--[��¥ ����]
--YYYY:4�ڸ����� //YYY, YY, Y : ���� 4�ڸ� ������ ������ 3,2,1 �ڸ�
--MM:�� / DD:1�� �� ��¥(����) /DAY :����(������ ~�Ͽ���)/DY :����(��~��)
--HH,HH12: 12�ð� ���� / HH24 :24�ð� ���� / MI :�� / SS:��/ AM/PM :����/����

--      -SYSDATE : ���� ��¥/�ð��� ��ȯ
--      -TO_DATE(S1, DATETIME����) : ������ �����͸� ��¥������ ��ȯ
select to_date('2023-08-21 ���� 03:10', 'YYYY-MM-DD AM HH:MI')from dual;
--      -TO_CHAR(DATE, DATETIME����):��¥�� �����͸� ���������� ��ȯ
select to_char(SYSDATE, 'YYYY-MM-DD')from dual;
-- Ư�� ��¥ ���� �޾ƿ��� �ʹٸ� SYSDATE �ڸ��� TO_DATE�Լ��� �־ ������!
--      =>��ȯ �Ǵ� ������ Ÿ���� �ٸ��ٴ°� ���!!
--  to_date �� ��¥��/ to_char �� ������!

--      -ADD_MONTHS(DATE, ����):��¥���� ������ �޸�ŭ ����(1:������, -1:������)
select add_months(sysdate, -3)from dual;

--      - LAST_DAY(DATE) : ���� ������ ���� ��ȯ
select last_day(sysdate)from dual;

--���� ��¥ ���� ���� ��ȸ(���̺� ���'����'/�÷��� 2023�� �̶�� ������)
select to_char(sysdate, 'YYYY')||'��'from dual;
--���� ��¥ ���� �� ��ȸ(���̺� ���'��'/�÷��� 8�� �̶�� ������)
select to_char(sysdate, 'MM')||'��'from dual;
--���� ��¥ ���� �� ��ȸ(���̺� ���'��'/�÷��� 21�� �̶�� ������)
select to_char(sysdate, 'DD')||'��'from dual;
--���� ��¥ ���� ��/�� ��ȸ(���̺� ����� ���� �ö� ��/�÷��� 21�� �̶�� ������)
select to_char(sysdate, 'HH24')||'��' ��, to_char(sysdate, 'MI')||'��'�� from dual;
--���� ��¥ ���� �� ��ȸ(���̺� ����� '��'/�÷��� ?�� ��� ������)
select to_char(sysdate, 'MI')||'��'from dual;
--���� ��¥ ���� ���� ��ȸ
select to_char(sysdate, 'DY')���� from dual;
--���� �������� �������� ��ȸ
select to_char(sysdate, 'AM')"����/����"from dual;
--���ڿ� '2023-08-23 ���� 06:00' �� ��¥�� 2023.08.23���� ��ȸ
select to_char(to_date('2023-08-23 ���� 06:00','YYYY-MM-DD AM HH:MI'),'YYYY.MM.DD')from dual; 
--���� ��¥ ���� 3���� ���������� ��� ��ĥ���� ��ȸ
select to_char(last_day(add_month(sysdate,-3)),'mm-dd' from dual;

-- 4.����/�м� �Լ� - Select �ʵ�� ���̳� having������ ���!
--      -AVG(�ʵ��):���
--      -Count(�ʵ��):�˻��Ǵ� ������ ��
--      -Max(�ʵ��):�ִ밪
--      -MIn(�ʵ��):�ּҰ�
--      -Sum(�ʵ��):����
--      -Rank:�ߺ� ������ŭ ���� �������� ���� ��Ŵ
--      -DENSE_RANK: �ߺ������� �����ص� ���������� ���� ���������� ǥ����

-- 5.NULL ���� �Լ�
-- ���� ���� ���ǿ� NOT NULL�� ������ �����͸� �Է��ϰ� �س��µ�
-- NULL : ��Ȯ�� ���̳� ���� ������� ���� ��/ 0�̳� ������ �ƴ�!
--        ���״�� ���� ���� ����!!

--  NVL�Լ� : NULL�� ��츸 ������ ������ ��ġ�ϴ� �Լ�
--      NVL(��, NULL�� �� ��ü��)
select NVL(NUll, 'B'),NVL('C','B')From dual;

--  NVL2�Լ� : NULL�� ���ο� ���� ������ ������ ��ġ�ϴ� �Լ�
--  NVL2(��, ���� ������ ��ü��, NULL�� �� ��ü��)
select NVL2(NULL,'A', 'B'), NVL2('C','A','B')from dual;
---------------------------------------------------------------------------
--where ��(���ǽ�)
--��ü ������ �� ������ ���ǿ� �´� �����͸� ã���ִ� ����
--���ǽĿ��� ����� ������ => �� ������
-- =, !=, ^=, <>, >, <, >=, <=
-- 2,3,4��°�� '���� �ʴ�'�� ���̴� �������ε� �� 3���� �ɱ�...?
-- ������ 3000���� ������ ��� ������ ��ȸ
--select * from snack where s_price = 4500;
----------------------------------------------------------------------------
--��� ������ �̸�, ���� ��ȸ
select s_name, s_price from snack;
--��� ���� �̸�(����)���� ��ȸ ex)�÷��� : �̸�(����) / �� : ��Ĩ(2000��)
select s_name||'('||s_price||'��)'"�̸�(����)"from snack;
--2000�� ������ ���� �� �ּҰ���
select min(s_price)from snack where s_price <=2000;
--��� ������ ��հ�
select round(avg(s_price),1) from snack;
--������ �̸��� ������ 30%���� �ݾ�
select s_name, s_price * 0.7 from snack;
--4500���� ������ ����
select count(*)from snack where s_price = 500;
--4000�� ������ �����̸�, ȸ�� �̸�
select s_name, s_maker from snack where s_price <= 4000;

--��� ���� �̸�, ����, ������� ��ȸ
select s_name, s_price, s_exp from snack;
--��� ���� �̸�, ����, �ΰ��� ��ȸ(������ 10%)
select s_name, s_price, s_price * 0.1 vat from snack;
--��� ���� �̸�, ����, �ǸŰ�(20% ����)
select s_name, s_price, s_price *0.8 from snack;
--3000������ ū �ݾ��� ��հ�
select round(avg(s_price),1) from snack where s_price > 3000;--�Ҽ��� ���ڸ�����
--�ְ�, ������, �� �������� ���?
select max(s_price), min(s_price), count(*)from snack;
--3000�� �̻��� ������ ��ü����
select * from snack where s_price>=3000;--
--3000�� �̸��� ������ �̸�, ����, �ǸŰ�(20% ����)
select s_name, s_price, s_price * 0.8 selling_price from snack where s_price <3000;
--2000�� ¥�� ���� �?
select count (*) from snack where s_price = 1000;
--��Ϲ���Ĩ�� ����?
select s_price from snack where s_name = '�����';
--ũ��� ȸ���� ���� ���� ����
SELECT sum(s_price)from snack where s_maker = '���';
--�̹��� �ȿ� �Ծ�� �ϴ� �����̸�, ����, �������
select s_name, s_price, s_exp from snack where s_exp < to_date('2023-09-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS')
and s_exp>=sysdate;
----------------------------------------------------------------------------------------------------------------
--���� ������
--NOT, AND, OR, BETWEEN, IN
--���� AND�� BETWEEN
--������ 1000�� �̻� 3000�� ������ ������ ��ü ������ ��ȸ
--and �� �Ἥ �ϴ� ���
--select *from snack where 1000<=s_price
select*from snack where s_price>=1000 and s_price <=3000;
--between�� �Ἥ �ϴ� ���
select*from snack where s_price between 1000 and 3000;
--between�� �̻�/���Ϸ� ������ ���ϱ� ������
--1000�� �ʰ� 3000�� �̸������� between��� ����..

--������ 1000��, 2000��, 3000���� ������ ��ü ������ ��ȸ
--or ������!
select * from snack where s_price = 1000 or s_price = 2000 or s_price = 3000;
--��ȿ������ ������� ��� ���ϰ� �����ִ� ���?
--in ������ 
select * from snack where s_price in(1000, 2000, 3000);
--���ӵ��� ���� ������ �޾ƿ��� �������� in�� ���!
--�� ����� �ݴ�Ǵ� ������� �޾ƿ��� ������ => not������!
--�� not�� ��� ���� ������? not in
select * from snack where s_price not in(1000, 2000, 3000);
--in ������ �տ��ٰ� not�� �ٿ��� ����ϸ��!
--------------------------------------------------------------------------------------
-- ���� ������
--���ڿ��� �����ϴ� �˻� : like '����'�� ����
--�̶� ���Ͽ��� '%'�� �ִµ� ���� ���� �𸣰ڴٴ� ��!
--like'%��' : ���� �����°�
--like '��%': ���� �����ϴ°�
--like '%��%' : ���� ����
-- �� like ��� (='��%')�� �ȵǴ°�?
-- ��ȣ�� �Ἥ ���� ǥ���ϸ� �������� �ν��ϴ°� �ƴ�'��%'���� �״�� �ν��ع���
-- '��'�� ���� ȸ�翡�� ���� ���� �̸� ��ȸ
select * from snack where s_name like '%��%';
--  '��'�� ���� ���ڵ� ��հ�
select avg(s_price)from snack where s_name like '%��%';
-- ũ��� ���ڰų� , ��Ŭ �̸� ,������,���� ��ȸ
select s_name, s_maker, s_price from snack where s_maker = 'ũ���' or s_name like '����%';
-- ������ �̸��� ���޴����� �����ϰų�, ��Ŭ�� �����ϴ� ������ �̸�,������,���� ��ȸ
select s_name, s_maker, s_price from snack where s_name like '%���޴���%' or s_name like '%��Ŭ%';

--select s_name, s_maker, s_price from snack where s_name like in('%���޴���%','%����%');
--like~in ������ �ƾ� ����...

--regexp_like(�÷���, ����1|����2|...)
select s_name, s_maker, s_price from snack where like(s_name, '^���޴���|��$');

--���Խ�(regex)�� �̿��ؼ� ���ڸ� ã�� ���
--���� �տ� ^�� ������ : ���ϰ����� �����ϴ� ���ڿ� ã��
--���� �ڿ� $�� ������ : ���ϰ����� ������ ���ڿ��� ã��
--�������� ������ �̿��ؼ� ã�� �ʹٸ� | (������)�� �־ ������ �߰��ϸ� ��
----------------------------------------------------------------------------------
-- ���� ������
-- ������
-- union : �ߺ��Ǵ� �� �����ϰ� ���
select 1 id, '����' subject, 90 score from dual
union
select 1 id, '����' subject, 90 score from dual
union
select 1 id, '����' subject, 90 score from dual;
-- union all : �ߺ��Ǵ��� ��� ���
select 1 id, '����' subject, 90 score from dual
union all
select 1 id, '����' subject, 90 score from dual
union all
select 1 id, '����' subject, 90 score from dual;

--������
--intersect : �� ���̺��� ���� �� ����Ǵ� �� ���
select 1 id, '����' subject, 90 score from dual
union
select 2 id, '����' subject, 90 score from dual--���������� ����,���� �Ѵ� ����
intersect
select 1 id, '����' subject, 90 score from dual;--���������� ����� �� ���и� ���

--������
--minus : ù��° select�� �߿��� �ι�° select������ ���� �� ���
select 1 id, '����' subject, 90 score from dual
minus
select 1 id, '����' subject, 80 score from dual--��������� ù��° select�� ���
minus
select 1 id, '����' subject, 90 score from dual;--����� ���� �����Ƿ� ��ȯ���� ����
---------------------------------------------------------------------------------------
--������ �켱����(�������� �ֿ켱����)
-- or > and > not > �񱳿����� > ��ȣ
-- ���� ������ �߿��� ȸ�簡 ũ����̰� ������ 1000�� ���� �̰ų� 3000�� �̻��� ������
-- �̸�, ����, ������� ��ȸ
select s_name, s_price, s_exp, s_maker from snack where s_maker = 'ũ���' and (s_price<=1000 or s_price >=3000);
--------------------------------------------------------------------------------------------
--group by : �׷����� ��� �����Ͽ� �ϳ��� ����� ��Ÿ���� ��
--ȸ�纰 ���� ��հ���, �ּҰ���, �ִ밡��, 
select s_maker, avg(s_price),min(s_price),max(s_price) from snack group by s_maker;--ȸ�纰�� �׷��� ������

--rollup ������ 
group by rollup[�׷���]
--�÷��� ���� �Ұ�(subtotal)�� ����� ��
--group by ���� �÷������� n�� ��� �ϸ�, rollup�� ������ n+1��

--ȸ���̸�, ȸ�纰 ���� ���� �� ���� �հ�� ��� ���ڵ��� ���� �հ�
select s_maker, sum(s_price) from snack group by rollup(s_maker);

select nvl2(s_maker,s_maker,'��ü')s_maker, sum(s_price) from snack group by rollup(s_maker);
--decode(�÷�, ����, ���ǿ� �´� �����, ���ǿ� �����ʴ� �����)
select decode(s_maker, null, '��ü',s_maker) s_maker, sum(s_price) from snack group by rollup(s_market);
--having : group by���� ���� ������ ��� �� ���ϴ� ���ǿ� �����ϴ� �ڷḸ ã���� �Ҷ� ���
--having �� where ��� ������ �̿��ؼ� ���ϴ� ���ǿ� �´� �ڷḸ �̾ƿ´ٴ� ������
--having : �׷쿡 ���� ����� ����
-- vs
--where : ������ ����ؼ� �� ����� ����

--ȸ�纰 ���� ��� ������ 2000�� �̻��� ȸ���� �̸��� ���� ��հ����� ��ȸ
select s_maker, avg(s_price) from snack group by s_maker having avg(s_price) >= 2000; 
-------------------------------------------------------------------------------------------------------
--order by : ����! �⺻���� �������� ASC, �������� ������ DESC
--order by : [���Ĵ�� asc/desc]
--�Ե� �Ǵ� ���� ȸ���� ���� ��� ������ 1800�� �̻��϶� �� ȸ���� ��� ���� �������� ����
select s_maker,avg(s_price)from snack where s_maker in ('����','�Ե�')group by s_maker having avg(s_price) >= 1800 order by avg(s_price)desc;

--***��������(SUBQUERY)
--��ǻ� �̰� ������ ���ݱ��� �����Ѱ�!
--select �� �ȿ� �ٽ� select���� ����ϴ� ���
--�ϳ��� SQL�� �ȿ� �ٸ� SQL���� ��ø�Ǿ��ִ� ����(����)�� ����
--�ٸ� ���̺��� ������ �����ͷ� ���� ���̺� �ִ� ������ ã�ų� ������ �� �����
--���߿� ��� JOIN

--�� ����(main query,�ܺ�����)�� �μ�����(sub query,��������)�� ������

select s_name, s_price from snack where s_price <(select avg(s_price)from snack);
--��հ� ���� ������ ���� ������ �̸��� ���� ������ ��ȸ�� ����
--�Ѱ��� ���̶��....�κ����� ������ �����غ��� �������� ���� �� ��������,
--���ǿ� �°� �� ã���� ����!

--���������� where������ ���������� ����� ���Ҷ����� �ݵ��!!!�񱳿����ڸ� ���!!!

--�ְ� ������ 
select max(s_price) from snack; 
--���� ��� ������ �̸�, ������, ����
select s_name, s_maker, s_price from snack where s_price = (select max(s_price) from snack);
--���� �� ���ڴ� ��𿡼� �������?
select distinct s_maker from snack where s_price = (select min(s_price)from snack);
--��հ����� ��� ���ڴ� ������?
select count (*) s_name from snack where s_price >(select avg(s_price)from snack);
--��������� ���� �������� ������ ��ü ����
select * from snack where s_exp = (select max(s_exp)from snack);
---------------------------------------------------------------------------------------------
--����ȸ�� ���̺��� ����ǵ� =>ȸ�� �̸�, �ּ�(����), ���� �� ���� ���� �Ӽ�!
--���� ���̺� ���缭 �����͸� �־��ּ���
create table company(
    co_name varchar2(20 char)primary key,
    co_address varchar2(20 char)not null,
    co_employee number(4)not null
    
);

drop table company cascade constraint purge;

insert into company values ('������', '����', 1200);
insert into company values('ũ���', '����', 1300);
insert into company values('���', '����', 1500);
insert into company values('�Ե�', '����', 1600);
insert into company values('����', '����', 900);

--���� ���� ���� ���� ȸ�翡�� ����� �����̸�, ���� ��ȸ
select s_name, s_price 
    from snack 
    where s_maker = (
        select co_name 
        from company 
        where co_employee = (
            select min(co_employee)
            from company
        )
    );
--���� ��� ���ڸ� ����� ȸ��� ���?
select co_address 
    from company
    where co_name =(
        select s_maker
        from snack
        where s_price = (
            select max(s_price)
            from snack
        )
    );
--���￡ �ִ� ȸ�翡�� ����� ������ ��հ�?
select avg(s_price)
    from snack
    where s_maker = (
        select co_name
        from company
        where co_address = '����'
    );
--��հ� �̻��� ���ڸ� ����� ȸ�� �̸�, ��ġ ��ȸ
select co_name, co_address
    from company
    where co_name in ( --'='�� ���� ���ϰ� �̻��� ����� �������� ��� ���迬����<IN>���! single-row subquery returns more than one row
        select s_maker
        from snack
        where s_price >= (
            select avg(s_price)
            from snack
        )
    );









