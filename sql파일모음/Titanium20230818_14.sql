-- [�ɼ�]
-- �������� (Constraint)�̶�� �θ�
-- ������ ���Ἲ�� �����ϱ� ���ؼ� ����ϴµ�
-- ������ ���Ἲ : �����ͺ��̽��� ����� �������� �ϰ����� ��Ȯ���� ��Ű�� ��

--  1.������ ���Ἲ ��������
--      ������ ����(Domain Constraint)�̶�� �ϸ�,
--      ���̺� ���� Ʃ�õ��� �� �����ο� ������ ���� ������ �Ѵٴ� ����
--      ������Ÿ��(type), (null, not null) , �⺻��(default), üũ(check)����
--      ����Ͽ� ������ �� ����
--  2.��ü ���Ἲ ��������
--      �⺻Ű ����(Primary Key Costraint)�̶�� ��
--      ��ü(Entity) : ���, ���, �繰, ��� ��� ���� ���������� �����ϸ鼭
--                      �����ϰ� �ĺ��� ������ ����
--      �ƹ��� ���� ��ü�� �־ ���� ���ϴ� ������ ��ü�� �߰��� �� �־����!
--      ���̺��� �⺻ Ű �� �����ϰ� , null���� �������� �ȵǸ�,
--      ���� �ϳ��� ���� �����ؾ� �Ѵٴ� ����!!
--  3.���� ���Ἲ ��������
--      �ܷ�Ű ����(Foreign Key Costraint)��� �ϸ�,
--      ���̺� ����  ���� ���踦 �����ϴ� ��������
--      ���� �޴� ���̺��� �ܷ�Ű�� �����ϴ� ���̺��� �⺻Ű�� �������� �����ؾ��ϸ�,
--      ���� �޴� ���̺��� ���� ����� �� �����ϴ� ���̺��� ������ �޴´ٴ� ��!
-----------------------------------------------------------------------
--  1. NOT NULL : NULL�� ���� ����ִٶ�� ��
--                 0�̳� ���⵵ �ƴ� ������ ���� ���� ���� ����
--                NULL�� ������� �ʰڴ� => �ʼ������� �Է��ؾ� �� �÷��� ����
create table example1(
    col1 varchar2(10 char),
    col2 VARCHAR2(10 char)not null
);

/*Costraint Ű���带 ����ؼ� �������� ���� ���� �ο���*/
create table example2(
    col1 varchar2(10 char),
    col2 varchar2(10 char)
    CONSTRAINT col2_notnull not null
);
--���̺��� ���鋚 �������̸� ���� ���� �������� ���ڴ�!

--2. UNIQUE : �ܾ� �� �״�� �ش� �÷��� ���� ���� ���̺� ��ü���� �����ؾ� �Ѵ�.
--      NOT NULL�� �Բ� ����� ����������, UNIQUE�� ���� �������� ����
create table example3(
    col1 varchar2(10 char) unique,
    col2 varchar2(10 char) unique not null,
    col3 VARCHAR2(10 char),
    CONSTRAINT col3_unique unique(col3)
    );

-- 3.Primary Key(�⺻Ű) : NULL�� ������� �ʰ�, �ߺ��� �����͸� ������� �ʴ´�
--  (NOT NULL + UNIQUE = PRIMARY KEY)
-- ���� �������� Ư�� ������ �˻��ϰų� �������� �۾��� �� �� �⺻Ű�� ����
--  (ID, �ֹε�Ϲ�ȣ ,ȸ����ȣ, �� ��ȣ ���� �⺻Ű�� ����)
-- ���̺� 1���� �⺻Ű�� ���´�
create table example4(
    col1 varchar2(10 char)primary key,
    col2 varchar2(10 char)
);

create table example5(
    col1 varchar2(10 char),
    col2 varchar2(10 char),
    col3 varchar2(10 char),
    constraint PK_example5 primary key(co1, col2)
    
);

-- ****��¥ �����!!!=>��� ������ ���� �ѱ�ô�//PK�� NN�� ����!
-- 4. FOREIGN KEY(�ܷ�Ű) : �ٸ� ���̺��� Ư�� �÷��� ��ȸ�ؼ�
--                          ������ �����Ͱ� �ִ°�쿡�� �Է��� ����
--      �����ϴ� ���̺��� PK�� UNIQUE�� ������ �÷����� FK�� ������ �� ����
--      �ܷ�Ű ������ ���ؼ��� �����޴� �÷��� ���� �����̵Ǿ�� �ϰ�,
--      �ܷ�Ű�� ���� ���̺��� ���Ŀ� ������ �Ǿ�� ��
--  �ܷ�Ű�� ���� ���̺��� ���´�...
create table ���̺��(
    �÷��� �ڷ���,
    constraint fk�� foreign key(�÷���)
        references ������̺��(������̺��� �⺻Ű(OR����Ű) �÷���)
        on delete set null || on delete cascade
        --�����޴� ���̺��� �� �κ��� ��������
        --�� ���̺��� ����Ǿ��ִ� �࿡ ���ؼ�
        --NUll������ �ٲ��� || ���� ������������ ���� �ɼ�
);
create table example6(
    ex6_id varchar2(10 char)primary key
);
insert into example6 values('10');
insert into example6 values('20');
insert into example6 values('30');
select * from example6;

create table example7(
    ex7_id varchar2(10 char),
    constraint fk_ex7 foreign key(ex7_id)
    references example6(ex6_id)
    on delete cascade
);
insert into example7 values('10');
insert into example7 values('20');
insert into example7 values('30');
insert into example7 values('40');--����(������ ex6���� ����'10', '20', '30' �� �־)

select*from example6;
select*from example7;
--ex6_id�� '10'�� ���� ����� ��� �ɱ�?
delete from example6 where ex6_id = '10';
select*from example6;
select*from example7;

drop table example6 cascade constraint purge;
drop table example7 cascade constraint purge;
---------------------------------------------------------------------------------
--�а� ���̺�� �̰��� �����ϴ� �л� ���̺��� ����� ����.
--�а� ���̺� + �� �ֱ�
--�а� �ڵ� : 4�ڸ� ����
--�а� �̸� : 10���� �̳��� ����

create table major(
    m_code number(4) primary key,
    m_name varchar2(10 char) not null
);
insert into major values(1001, '��ǻ�Ͱ��а�');
insert into major values(2001, 'ü���а�');
--�л����̺� + �� �ֱ�
--�л���ȣ : 3�ڸ� ����(101������ ����), 
--�л��̸� : 17�ڸ� , 
--�л��� �ҼӵǾ��ִ� �а��� �ڵ�
create table student(
    s_num number(3)primary key,
    s_name varchar2(17 char)not null,
    s_code number(4)not null,
    constraint fk_student foreign key(s_code)
        references major(m_code)
        on delete cascade
);
insert into student values (101, '������', 1001);
insert into student values (102, '�����', 2001);
insert into student values (103, '�����', 1001);
insert into student values (104, '�ں��', 2001);
insert into student values (105, '�պ��', 3001);
--major���̺��� 101 �ڵ带 �����, student���̺��� 1001�ڸ��� �������ִ� �л����� �����
select*from major;
select*from student;
--drop table major;
drop table major cascade constraint purge;
drop table student cascade constraint purge;

-- 5.check : �������� ���� ������ ������ �����ؼ� ���ǿ� �ش��ϴ� �����͸� ���!
create table example8(
    col1 number(10)
    constraint ex8_check check (col1 between 1 and 9)
);

insert into example8 values(10);
drop table example8 cascade constraint purge;

-- 6.DEFAULT : �ƹ��� �����͵� �Է����� �ʾ��� ��� ������ �����Ͱ� �ڵ����� �Է�!
create table example9(
    col1 number default 999
);
insert into example9 values(default);
insert into example9 values(null);
insert into example9 values(0);
insert into example9 values(11);

select*from example9;
