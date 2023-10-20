--����, 3000g, 10000��, Ȩ�÷���, ������, 1000��, ������ 500��
--��, 500g, 5000��, Ȩ�÷���, ������, 500��, ������ 300��
--����, 2000g 5000��, �̸�Ʈ, ������, 800��, ������ 800��

create table MARKET(
    M_NO number(4)primary key,
    M_NAME varchar2(10 char)not null,
    M_LOCA varchar2(10 char)not null,
    M_LAND number(4) not null,
    M_PARKING number(4) not null
    );
--    drop table MARKET cascade constraint purge;
create sequence MARKET_SEQ;

insert into MARKET values(MARKET_SEQ.nextval,'Ȩ�÷���', '����', 1000, 500);
insert into MARKET values(MARKET_SEQ.nextval,'Ȩ�÷���', '����', 500, 300);
insert into MARKET values(MARKET_SEQ.nextval,'�̸�Ʈ', '����', 800, 800);
-----------------------------------------------------------------------------
create table PRODUCT(
    P_NO NUMBER(4)primary key,
    P_NAME varchar2(10 char)not null,
    P_WEIGHT number(4) not null,
    P_PRICE number(5) not null,
    P_M_NO number(4) not null,
    constraint fk_P_M_NO foreign key(P_M_NO)
        references MARKET(M_no)
        on delete cascade
    );
    create sequence PRODUCT_SEQ;
    insert into PRODUCT values(PRODUCT_SEQ.nextval,'����',3000,10000,1);    
    insert into PRODUCT values(PRODUCT_SEQ.nextval,'��',500,5000,2);   
    insert into PRODUCT values(PRODUCT_SEQ.nextval,'����',2000,5000,3);
-------------------------------------------------------------------------------
--C-insert
--R-SELECT
--U-UPDATE
update ���̺��
    set �÷��� = ��, �÷��� = ��, ....--�ٲ� ����
    where ���ǽ�;
--���� ��¥(0��)���� �����
update PRODUCT
    set P_PRICE = 0
    where P_NAME = '��';
--���߸� �����Ư����߷� ����
update PRODUCT
    set P_NAME = '�����Ư�����'
    where P_NAME = '����';
--�� ��Ʈ�� ������ 30% ���̱�
update MARKET
    set M_PARKING = M_PARKING * 0.7;
--Ȩ�÷��� �������� ��ǰ���� ���� 10% ����
update PRODUCT
    set P_PRICE = P_PRICE *0.9
    where P_M_NO = ( 
        select M_NO
        from MARKET
        where M_NAME = 'Ȩ�÷���' and M_LOCA ='����'
        );
--���� ��� ��ǰ 10%����
update PRODUCT
    set P_PRICE = P_PRICE *0.9
    where P_PRICE = (
        select max(P_PRICE)
        from PRODUCT
        );
        
select * from PRODUCT;
select * from MARKET;
-----------------------------------------------------------------------------------
--D - DELETE
delete from ���̺��
    where ���ǽ�;
    
--�� ����
delete from PRODUCT
    where P_NAME = '��';
        

--���� ���� ���� ��ǰ �� ����
delete from PRODUCT
    where P_M_NO in (
        select M_NO
        from MARKET
        where M_LAND = (
            select min(M_LAND)
            from MARKET
        )
    );