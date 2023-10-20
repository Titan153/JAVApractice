--1.�������̺�� ī�����̺��� �������� �մϴ�.
--�������̺��� �����̸�/����/�Ǹ��ϴ� ī���� �̸�
create table drink(
    d_name varchar2(10 char)primary key,
    d_price number(5),
    d_cafeName varchar2(10 char)
);
insert into drink values('�Ƹ޸�ī��', 2000, 'acafera');
insert into drink values('��', 3000, 'acafera');
insert into drink values('����', 2500, 'acafera');
insert into drink values('ȫ��', 2500, 'beaver');
insert into drink values('������', 3000, 'beaver');
insert into drink values('����������', 4000,'beaver');

--ī�����̺��� ī���̸� /����/�¼���
--����)�� ���̺��� �����̸���/ ī���̸��� ������ ���� ���´�.
--����)�� ���̺��� ���踦 ���

--2.���ǿ� �´� ���̺��� ����� ���� �־��ּ���
--Aī��� ���￡ ��ġ�ϰ� �¼��� 100���̸�,(�Ƹ޸�ī��, 2000��),(��, 3000��),(����,2500��)�� �Ǹ�
--Bī��� ��õ�� ��ġ�ϰ� �¼��� 80���̸�,(ȫ��, 2500��),(������, 3000��),(����������,4000��)�� �Ǹ�
create table cafe(
    c_name varchar2(10)primary key,
    c_loca varchar2(10),
    c_seat number(3)
);
--drop table cafe cascade constraint purge;
insert into cafe values ('acafera', '����', 100);
insert into cafe values ('beaver', '��õ', 80);

--3.��û�ϴ� �������� �ۼ����ּ���

--��� ������ ��հ����� ��� ����� �� ��������
select count (*) d_price 
    from drink 
    where d_price > (
        select avg(d_price)
        from drink
    );
--���� �� ���Ḧ �Ĵ� ī���� �̸�?
select c_name 
    from cafe 
    where c_name = (
        select d_cafeName 
        from drink 
        where d_price =(
            select min(d_price) 
            from drink
        )
    );
--���￡ �ִ� ī�信�� ����� ���� ��հ�?
select avg(d_price)
    from drink
    where d_cafeName = (
        select c_name
        from cafe
        where c_loca = '����'
        );
--�¼��� 90�� �̻��� ī�信�� �Ĵ� ������ �̸�?
select d_name
    from drink
    where d_cafeName = (
        select c_name from cafe where c_seat >= 90);
--��հ� ������ ������ �̸�?
select d_name 
    from drink 
    where d_price <=(
        select avg(d_price)
        from drink);

--���� ��� ���Ḧ �Ĵ� ī��� ��� �ִ���?
select c_loca
    from cafe
    where c_name in (
        select d_cafeName
        from drink
        where d_price = (
            select max(d_price)
            from drink
    )
);

