--Ŀ�� �޴��� ���� ���̺���
--Ŀ���� �̸�, ����, Į�θ� , �ǸŰԽ��� ��¥ ���� ��� �� �� �ְ� ������ּ���.
create table menu(
    c_name varchar2(10 char) primary key,
    c_price number(5) not null,
    c_kcal number(4,1)not null,
    c_start date null
);
insert into menu values('ī���', 4000, 128, null);

drop table menu cascade constraint purge;
-- ALTER / DROP /TRUNCATE

--  ������ Ÿ���� ���� / �ķ��� ũ��(�뷮) ����
-- ALTER TABLE [���̺��] MODIFY [�÷���] [������Ÿ��(�뷮)];
alter table aug18_coffee modify c_name number(3);
alter table aug18_coffee modify c_name varchar2(2 char);
-- ����: �ڷ����� ������ ���� �ش� �÷��� ���� ��� ������ ������ ����!!
--      �׷��� ������ ������ �߻�!!
--      �÷��� �뷮�� ���� ��� �ش� �÷��� �뷮�� ��ȸ�ؼ� ������ �뷮 ����
--      ū ���� �ִ��� Ȯ���ϰ� ���� ����
-- �뷮 ��ȸ: DESC ���̺��;

desc menu;

-- �÷��� ���� (���̺��)           (�÷���)    (������ �÷���)
--alter table [���̺��] rename colum[�����÷���] to [���ο� �÷���];
alter table aug18_coffee rename colum c_name to c_name2;

--�÷��߰�
--alter table[���̺��]add[�÷���][������Ÿ��][��������(��������)];
alter table aug18_coffee and c+taste varcjar2(20 char) not null;

--�÷�����
--alter table [���̺��] drop colum[�÷���];
alter table aug18_coffee drop colum c_taste;
-------------------------------------------------------------------------
--2. TRUNCATE ���̺� ���� ���� �����
--truncate table[���̺��];
truncate table aug18_coffee;
-- ���̺� �ִ� �����͸� ����������, ���̺��� ������ü�� ������� ����
DESC COFFEE;


-- 3. DROP ���̺� ����
DROP TABLE [���̺��]; -- �����뿡 �־�� ����(��������)
                    -- EX) FLASHBACK TABLE [���̺��] TO BEFORE DROP;
DROP TABLE [���̺��] CASCADE CONSTRAINT; -- ���� �����ع����� ������

drop table [���̺��];-- �����뿡 �־�� ����(��������)
                    -- EX) FLASHBACK TABLE [���̺��] TO BEFORE DROP;
drop table [���̺��] cascade constraint;--���� �����ع����� ������
drop table aug18_coffee;

--�����뿡 �ִ� ���̺� ����
flashback table[���̺���] to before drop;
select*from aug18_coffee;
flashback table aug18_coffee to before drop;

--�����������
purge recyclebin;

--���̺� ��������
drop table [���̺��] cascade constraint purge;
drop table aug18_coffee cascade constraint purge;
-------------------------------------------------------------------