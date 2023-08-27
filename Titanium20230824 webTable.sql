--join
--�ϳ��� ��ɹ��� ���� ���� ���̺� ����� �����͸� �ѹ��� ��ȸ�Ҽ� �ִ� ���
--��ġ �ϳ��� ���̺� �ΰ� ó�� �����ִ� ��!

create table tb1(name varchar(20), age number(3));
create table tb2(name varchar(20), age number(3));

insert into tb1 values ('����', 30);
insert into tb1 values ('�ں��', 35);
insert into tb1 values ('�ֺ��', 40);
insert into tb1 values ('�����', 40);

insert into tb2 values('����', 30);
insert into tb2 values('�̺��', 50);
insert into tb2 values('�����', 55);

--cross join : ������ ���� ���� �� ���̺��� ������ ��� ����� ��ȸ(��� ����� ��)
--��ǻ� �Ⱦ��� ����
select * from tb1, tb2;
select * from cross join tb2;

--inner join : ���ǿ� �ش��ϴ� ���� ����
select * from tb1 inner join tb2 on tb1.name = tb2.name;
select * from tb1 A, tb2 B where a.name = b.name;--EQUI����(��������)
select * from tb1 join tb2 using (name);--join~uning(���δ���÷���)
select * from tb1 natural join tb2;--�ڿ�����, ������ ���� ���ʿ� ���� �̸��� ����
                                    --������ �÷��� ��ȸ

--outer join : ���� ���̺��� �����Ͱ� ��� ��ȸ(��������)�ǰ�, 
-- ������̺� �����Ͱ� ���� ��� �ش� �÷��� ���� �������� ���ؼ� ���
-- (+)�� �̿��� outer join : null�� ��µǴ� ���̺��� �÷��� (+)��ȣ �߰�
--left outer join : ���� ���̺� ���� ������ ������ ���̺��� ���ǿ� ���� �ʾƵ� ����
--(���ǿ� ���� ������ null�� �޲�) + right���� �� ���ֻ�� (���� ���ʿ��� ���������� �д°���)
select*from tb1 left outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name = tb2.name(+);

--right outer join : ������ ���̺� ���� ������ ���� ���̺��� ���ǿ� ���� �ʾƵ� ����
--(���ǿ� ���� ������ null�� �޲�)
select*from tb1 right outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name(+) = tb2.name;

--full outter joun : ���� ���̺� ���� ������ �ٸ��� ���̺��� ���ǿ� ���� �ʾƵ� ����
select * from tb1 full outer join tb2 on tb1.name = tb2.name;

--self join***�򰥸�

--�ϳ��� ���̺� ���� �ִ� �÷����� �����ϴ� ������ �ʿ��� ���
--�ϳ��� ������Ʈ�� ȸ���� 5�� �ְ� �����ڰ� 2���� ����
create table web(
    w_id varchar2(10 char)primary key,
    w_name varchar2(10 char)not null,
    w_manager varchar2(10 char)
);
drop table web cascade constraint purge;
--ȸ���� �̸��� ���� ȸ��1~5/�������� �̸� ������ 1,2
insert into web values('meber1', 'ȸ��1', 'manager1');
insert into web values('meber2','ȸ��2', 'manager1');
insert into web values('meber3','ȸ��3', 'manager1');
insert into web values('meber4','ȸ��4', 'manager2');
insert into web values('meber5','ȸ��5', 'manager2');
--ȸ���� ���̵�� ���� member1~5/�������� ���̵�� ���� manager 1,2
insert into web values('manager1','������1', null);
insert into web values('manager2','������2', null);
--ȸ�� 1~3���� ������ 1�� ����/������ ȸ���� ������ 2�� ����

select  * from web;
--�� ���̺� ������ �� �����ڰ� � ȸ���� �����ϴ��� �˰����
select w_id, w_name, w_manager from web 
        where w_manager in (select w_id from web);

select * from web A join web B
    on A.w_id = B.w_id;
    
--�׷��� A���̺� w_id�� B���̺��� w_name�� �����ؼ�
select * from web A join web B
    on A.w_id = B.w_manager; --���� id�� �������� ������ ����
                            -- ������ �����ؼ�
                            --�����ϴ� ȸ��id���� �����ü��ְ�
--------------------------------------------------------------------------------


















