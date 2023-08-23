-- select ���� �ٷﺸ����...
-- select ������ ����� �����ص� ����!!!�߿��ϱ� ������

select [distinct][�÷���],[�÷��� as ��Ī || �÷��� ��Ī],[������],[����Լ�],.......
from [���̺��]
where [���ǽ�]
group by[�׷���]
having[�Լ� ���� ����]
order by[���Ĵ�� asc/desc (��������/��������)];
-------------------------------------------------------------------------------
--��ľ� ����������
--ȫ����� �������� ȫ�浿�� ��ϰ� 100��
--ȫ����� �������� ��浿�� ��ϰ� 80��
--�ѽ����� �������� ȫ�浿�� ��ϰ� 150��
--�������� �������� �ֱ浿�� ��ϰ� 130��
--------------------------------------------------------------------------------
create table franchise(
    f_no number(3) primary key,
    f_name varchar2 (10 char)not null,
    f_loca varchar2(10 char)not null,
    f_ceo number(3)not null,--����� ��ȣ --�̸������� �ϰԵǸ� 'ȫ�浿'��ħ
    f_seat number(3)not null
);
--drop table frenchise cascade constraint purge;
create sequence frenchise_seq;
--drop sequence frenchise_seq;

insert into frenchise values(frenchise_seq.nextval,'ȫ�����', '������', 1, 100);
insert into frenchise values(frenchise_seq.nextval,'ȫ�����', '������', 2, 80);
insert into frenchise values(frenchise_seq.nextval,'�ѽ�����', '������', 3, 150);
insert into frenchise values(frenchise_seq.nextval,'��������', '������', 4, 130);

select * from frenchise;
-------------------------------------------------------------------------------
--ȫ�浿, 1990-03-01�ϻ�, ����
--��浿, 1992-02-01�ϻ�, ����
--ȫ�浿, 1992-12-12�ϻ�, ����
--�ֱ浿, 1989-07-14�ϻ�, ����
-------------------------------------------------------------------------------
create table ceo(
    c_num number(3)primary key,
    c_name varchar2(4 char)not null,
    c_birth varchar2(20 char)not null,
    c_gender varchar2(2 char)not null
);
--drop table ceo cascade constraint purge;

create sequence ceo_seq;
--drop sequence ceo_seq;

insert into ceo values(ceo_seq.nextval, 'ȫ�浿', to_date('1990-03-01', 'YYYY-MM-DD'), '����');
insert into ceo values(ceo_seq.nextval, '��浿', to_date('1992-02-01', 'YYYY-MM-DD'), '����');
insert into ceo values(ceo_seq.nextval, 'ȫ�浿', to_date('1992-12-12', 'YYYY-MM-DD'), '����');
insert into ceo values(ceo_seq.nextval, '�ֱ浿', to_date('1989-07-14', 'YYYY-MM-DD'), '����');

select * from ceo;
-----------------------------------------------------------------------------------
--�¼����� ���� ���� �Ĵ��� ��ϴ� ����� ��ü ���� ��ȸ
select * from ceo
    where c_num = (
        select f_no
        from frenchise
        where f_seat =(
            select max(f_seat)
            from frenchise
        )
    );
-----------------------------------------------------------------------------------
--¥���, 5000��, ȫ����� ������(100��)���� �Ĵ�
--�Ҵ߹�, 12000��, �ѽ����� ������(150��)���� �Ĵ�

create table f_menu(
    m_no number(2) primary key,--�޴���ȣ
    m_name varchar2 (10 char)not null,
    m_price number(6)not null,
    m_f_no number(10)not null--�޴� �Ĵ� �Ĵ� ��ȣ
);
--drop table f_menu cascade constraint purge;
create sequence menu_seq;
--drop sequence menu_seq;
insert into f_menu values(menu_seq.nextval,'¥���', 6000,1);
insert into f_menu values(menu_seq.nextval,'��¥��', 6000,1);
insert into f_menu values(menu_seq.nextval,'«��', 5000,1);
insert into f_menu values(menu_seq.nextval,'������', 11000,1);
insert into f_menu values(menu_seq.nextval,'��ǳ��', 12000,1);
insert into f_menu values(menu_seq.nextval,'�쵿', 15000,1);
insert into f_menu values(menu_seq.nextval,'�Ｑ¥��', 9500,1);
insert into f_menu values(menu_seq.nextval,'�Ｑ«��', 9500,1);
insert into f_menu values(menu_seq.nextval,'�Ｑ�쵿', 9500,1);
insert into f_menu values(menu_seq.nextval,'¥���', 7500,1);
insert into f_menu values(menu_seq.nextval,'«�͹�', 7500,1);
insert into f_menu values(menu_seq.nextval,'�ຸ��', 18000,1);
insert into f_menu values(menu_seq.nextval,'������', 18000,1);
insert into f_menu values(menu_seq.nextval,'Ư�ع����¥��', 18000,1);
insert into f_menu values(menu_seq.nextval,'�����������', 18800,1);

insert into f_menu values(menu_seq.nextval,'¥���', 5500,2);
insert into f_menu values(menu_seq.nextval,'��¥��', 5500,2);
insert into f_menu values(menu_seq.nextval,'«��', 5500,2);
insert into f_menu values(menu_seq.nextval,'������', 11500,2);
insert into f_menu values(menu_seq.nextval,'��ǳ��', 12500,2);
insert into f_menu values(menu_seq.nextval,'�쵿', 15000,2);
insert into f_menu values(menu_seq.nextval,'�Ｑ¥��', 9500,2);
insert into f_menu values(menu_seq.nextval,'�Ｑ«��', 9500,2);
insert into f_menu values(menu_seq.nextval,'�Ｑ�쵿', 9500,2);
insert into f_menu values(menu_seq.nextval,'¥���', 7500,2);
insert into f_menu values(menu_seq.nextval,'«�͹�', 7500,2);
insert into f_menu values(menu_seq.nextval,'�ຸ��', 18500,2);
insert into f_menu values(menu_seq.nextval,'������', 18500,2);
insert into f_menu values(menu_seq.nextval,'Ư�ع����«��', 19000,2);
insert into f_menu values(menu_seq.nextval,'����¡�����뱸��', 22000,2);

insert into f_menu values(menu_seq.nextval,'�߲�ġ', 5500,3);
insert into f_menu values(menu_seq.nextval,'�粿ġ', 6000,3);
insert into f_menu values(menu_seq.nextval,'��ѱⲿġ', 5000,3);
insert into f_menu values(menu_seq.nextval,'������', 11000,3);
insert into f_menu values(menu_seq.nextval,'���', 12000,3);
insert into f_menu values(menu_seq.nextval,'��쵿��', 15000,3);
insert into f_menu values(menu_seq.nextval,'���ð���ġŲ', 9500,3);
insert into f_menu values(menu_seq.nextval,'����Ҵ�', 9500,3);
insert into f_menu values(menu_seq.nextval,'�������', 9500,3);
insert into f_menu values(menu_seq.nextval,'�Ҵ߹�', 7500,3);
insert into f_menu values(menu_seq.nextval,'������', 7500,3);
insert into f_menu values(menu_seq.nextval,'���ϸ���޺�', 18000,3);
insert into f_menu values(menu_seq.nextval,'�������޺�', 18000,3);
insert into f_menu values(menu_seq.nextval,'Ư���쵿', 21000,3);
insert into f_menu values(menu_seq.nextval,'Ư���쵿+����3���޺�', 38000,3);

insert into f_menu values(menu_seq.nextval,'�߲�ġ', 5500,4);
insert into f_menu values(menu_seq.nextval,'�粿ġ', 6500,4);
insert into f_menu values(menu_seq.nextval,'��ѱⲿġ', 5000,4);
insert into f_menu values(menu_seq.nextval,'������', 11000,4);
insert into f_menu values(menu_seq.nextval,'���', 12000,4);
insert into f_menu values(menu_seq.nextval,'��쵿��', 15000,4);
insert into f_menu values(menu_seq.nextval,'���ð���ġŲ', 9500,4);
insert into f_menu values(menu_seq.nextval,'����Ҵ�', 10000,4);
insert into f_menu values(menu_seq.nextval,'�������', 10000,4);
insert into f_menu values(menu_seq.nextval,'�Ҵ߹�', 8000,4);
insert into f_menu values(menu_seq.nextval,'������', 8000,4);
insert into f_menu values(menu_seq.nextval,'���ϸ���޺�', 18000,4);
insert into f_menu values(menu_seq.nextval,'�������޺�', 18000,4);
insert into f_menu values(menu_seq.nextval,'Ư���쵿', 21000,4);

select * from f_menu;
---------------------------------------------------------------------------------
--���������� �޴� ��ü�� �̸�, ���� ��ȸ
--      =>������ ���� �������� =>�޴��� ������ ����
select m_name, m_price from f_menu order by m_price, m_name desc;

-- ��ü ����Ե� �̸�, ���� ��ȸ
select c_name, c_birth from ceo;
--���������� �Ĵ� �?
select count (*) from frachise;
--�޴� ������ ��հ�
select avg(m_price) from f_menu;
---------------------------------------------------------------------------------
--���� ��� �޴� �̸�,����
select m_name,m_price 
    from f_menu
    where m_price =(
        select max(m_price)
        from f_menu
        );
--�ֿ����� ����� �̸�, ����
select c_name, c_birth
    from ceo
    where c_birth = (
        select min(c_birth)
        from ceo
        );
--�¼� �� ���� ���� �Ĵ��̸�, ������ �¼� ��
select f_name, f_loca, f_seat
    from frenchise
    where f_seat = (
        select min(f_seat)
        from frenchise
        );
        
-------------------------------------------------------------------------------------------
--ȫ����� ������ ��ϴ� ����� �̸�, ����
select c_name,c_birth 
    from ceo
    where c_num = (
        select f_ceo
        from frenchise
        where f_name = 'ȫ�����' and f_loca = '������'
    );
  
--'¥��' �� �� ������ ��𰡸� ������ �ֳ�?(�Ĵ� �Ĵ� �̸�, ������)
select f_name, f_loca 
    from frenchise
    where f_ceo in (
        select m_f_no
        from f_menu
        where m_name like '%¥��%'
        );

--�¼��� ���� ���� �Ĵ��� ��ϴ� ����� ��� ����
select * from ceo
    where c_num = (
        select f_ceo
        from frenchise
        where f_seat = (
            select max(f_seat)
            from frenchise
            )
            );
-------------------------------------------------------------------------------------------
--�ֿ��� ����Գ� ���� �޴� �̸�, ���� ��ȸ(�ٽ��غ���)
select m_name, m_price from f_menu
    where m_f_no = (
        select f_no from frenchise
        where f_ceo =(
            select c_num from ceo
            where c_birth = (select max(c_birth)from ceo)
        )
    );
-------------------------------------------------------------------------------------------
--���̺� �������� 'join'��Ų��
--���̺� �������� �ϳ��� �̾�ٿ��� ram�޸𸮿� ��� �־���� ����
select * from frenchise , ceo;

select * from frenchise, ceo where f_ceo = c_num;

--��ü �Ĵ��̸�, ������, ������̸�, ����Ի���
select f_name, f_loca, c_name, c_birth from frenchise, ceo;
    where f_ceo = c_no;
--��ü �޴���, ����, �Ĵ��̸�, ������
select m_name, m_price, f_name, f_loca from f_menu, frenchise;
    where m_f_no = f_no;
--�¼����� 50�� �̻��� �Ĵ��� �޴���, ����, �Ĵ��̸�, ������, �¼���
select m_name, m_price, f_name, f_loca, f_seat from f_menu, frenchise
    where m_f_no = f_no and f_seat >=50;
--�¼��� ���� ���� �Ĵ��� �޴���, ����, �Ĵ��̸�, ������, �¼���
select m_name, m_price, f_name, f_loca, f_seat from f_menu, frenchise
    where m_f_no = f_no and f_seat in(
    select max(f_seat)
    from frenchise);
--��ü �޴���, ����, �Ĵ��̸�, ������, ������̸�, ����
select m_name, m_price, f_name, f_loca, c_name, c_birth from f_menu, frenchise, ceo
    where m_f_no = f_no and f_ceo = c_num;
--�ֿ����� ����Գ� ��ü �޴���, ����, �Ĵ��̸�, ������, ������̸�, ����
--         �� �޴��� �����ټ� =>�Ĵ��̸� �����ټ� ����
select m_name, m_price, f_name, f_loca, c_name, c_birth from f_menu, frenchise, ceo
    where m_f_no = f_no and f_ceo = c_num
    and c_birth = (
    select min(c_birth)
    from ceo
    )
    order by m_name, f_name;
-------------------------------------------------------------------------------------- 
-- �޴� �������� ������ ������ �������� ������ ���� (����¡ ó��)
-- ��� �ұ�...?
-- �޴� ���̺� m_no �� �޴��� ��ȣ ���� �ִ�(primary key)
--          sequence�� ó������
--          insert�ϴµ� �����ص� �ö�
--          �����͸� �����ߴٸ� ? => ��ȣ�� ��������Ű�....
-- m_no �� ��Ȯ�� 1,2,3,4,5....�� �ƴ�
-- � ����� ������.....?
----------------------------------------------------------------------------------
--rownum(�����ʵ�)***************���!
--      select �Ҷ����� �ڵ����� �ο���
--      '*'���� ���� ��� ����
--      order by���� ���� �ο�
--      ������ 1������ ��ȸ�ؾ�!!

--������ ������ ������ �ؼ� menu���̺��� ��ü ������ ��ȸ
select rownum, m_no,m_name,m_price,m_f_no from f_menu order by m_name;

--�޴��̸� �����ټ����� �����ؼ� menu���̺� rownum1~3���� ��ü ����
select rownum, m_no,m_name,m_price,m_f_no 
    from f_menu 
    where rownum >=1 and rownum <=3
    order by m_name; --�ǵ��� �ٴ� �̸������� ������ �Ŀ�
                    -- �� ������ ��ȣ���� �ֱ� �ٶ�
select rownum, m_no,m_name,m_price,m_f_no 
    from f_menu 
    order by m_name;
    where rownum >=1 and rownum <=3--�̷��� ����
    

select rownum, m_no, m_name, m_price --2. rownum�ο�    
    from (
        select m_no, m_name, m_price --�� �κ��� ���̺�ó�� �����!(������ ���� 0)
        from f_menu                  --inline view��� ��(�ζ��κ�)   
        order by m_name              --�ϳ��� ������ ������ ���̺�ó�� ���       
        );                           --������ ���� �Ŀ� �����!   

--�޴��� �����ټ� �����ؼ� rownum2~4���� �޴����̺� ��ü���� ��ȸ

--select�� �ѿ� �ѹ� �� �����ְ� �Ǹ鼭 �ȿ� �ִ� rownum�� ���ڸ� �ο��س��� ȿ���� �Ҿ����
--why?=>�׳� �׷� ������� ���� �ȿ��ִ� rownum�� �����
select *--rownum, RN, m_no, m_name, m_price
    from(
        select rownum RN,m_no, m_name, m_price
        from(
            select m_no, m_name, m_price
            from f_menu
            order by m_name
        )
    )
    where RN>=2 and RN<=4;

-- ~�浿 �̸��� ���� ����Գ�
--      �޴���, ����, �Ĵ��, ������, ������̸�
--      ���� �������� => �޴��� �����ټ�
--      =>3~8���� ��ȸ

select * 
    from(
        select rownum RN, m_name, m_price, f_name, f_loca, c_name 
        from(
            select m_name, m_price, f_name, f_loca, c_name 
                from f_menu, frenchise, ceo
                where m_f_no = f_no and f_ceo = c_num
                    and c_name like '%�浿'
                    order by m_price desc, m_name
    
         )
    )
    where RN between 3 and 8;
    
--�达 ���� ���� ����Գ� �޴���, ����, ����� �̸�, ����� ����
--���� �������� => 2~3���� 
select*
    from(
    select rownum RN, m_name,m_price,c_name,c_gender
        from(
        select m_name,m_price,c_name,c_gender
            from f_menu, ceo, frenchise
            where m_f_no = f_no and c_num = f_ceo
            and c_name like '��%'
            order by m_price 
            )        
    )
    where RN between 2 and 3;

     
    
    
    






























