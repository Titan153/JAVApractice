create table snack(
    s_no number(4)primary key,
    s_name varchar2(10 char) not null,
    s_maker varchar2(10 char) not null,
    s_price number(4) not null
);
insert into snack(s_no,s_name,s_maker,s_price)values(1,'�����', '���', 3000);
insert into snack(s_no,s_name,s_maker,s_price)values(2,'���±�', '���', 3500);
insert into snack(s_no,s_name,s_maker,s_price)values(3,'����', '���', 3000);
insert into snack(s_no,s_name,s_maker,s_price)values(4,'�̿���', '���', 2000);
insert into snack(s_no,s_name,s_maker,s_price)values(5,'�췰��', '���', 4000);
insert into snack(s_no,s_name,s_maker,s_price)values(6,'�����', '���', 4000);
--�����̾� ���������� ������ ������ ������ ���� ��õ �������� �Ǹ�
--������ ���ڸ� �ο��ϱ� �����
--�����͸� ���鶧 ���ڹ�ȣ�� �ڵ����� ����� �Ǹ� ���ڴ�.

--factory pattern ����ȭ ����
--MYSQL : AUTOincreament �ɼǵ� �ִ�.
--���� �츮�� ����ϰ� �ִ� OracleDB : Sequence��� ���� ����
-- ������ �ߴٽ��� PKŰ ���� ��Ե� �ֱ�����
-- ��ȣ�� ������ �°� �ڵ����� ��������
-- ���̺���� �����ϰ�, �������δ� insert�� �����ص� sequence ���� ������ �ö�
-- ����, ������ ���� �ٽ� �������� ����.

--sequence(table���� ������)����
create sequence ��������;
create sequence snack_seq;

--��ü���� ������
create sequence ��������
    increment by 1 -- ������(1������)
    start with 1 -- ���۰�
    minvalue --�ּҰ�
    maxvalue --�ִ밪
    nocycle / cycle --�ִ밪 ���޽� ���۰����� �ٽ� �ݺ����� ����
    nocache / cache -- �޸𸮿� �������� �̸� ����� ���� ������ ���� ����






