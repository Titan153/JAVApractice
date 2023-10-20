--배추, 3000g, 10000원, 홈플러스, 강남점, 1000평, 주차장 500석
--무, 500g, 5000원, 홈플러스, 종로점, 500평, 주차장 300석
--배추, 2000g 5000원, 이마트, 서초점, 800평, 주차장 800석

create table MARKET(
    M_NO number(4)primary key,
    M_NAME varchar2(10 char)not null,
    M_LOCA varchar2(10 char)not null,
    M_LAND number(4) not null,
    M_PARKING number(4) not null
    );
--    drop table MARKET cascade constraint purge;
create sequence MARKET_SEQ;

insert into MARKET values(MARKET_SEQ.nextval,'홈플러스', '강남', 1000, 500);
insert into MARKET values(MARKET_SEQ.nextval,'홈플러스', '종로', 500, 300);
insert into MARKET values(MARKET_SEQ.nextval,'이마트', '서초', 800, 800);
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
    insert into PRODUCT values(PRODUCT_SEQ.nextval,'배추',3000,10000,1);    
    insert into PRODUCT values(PRODUCT_SEQ.nextval,'무',500,5000,2);   
    insert into PRODUCT values(PRODUCT_SEQ.nextval,'배추',2000,5000,3);
-------------------------------------------------------------------------------
--C-insert
--R-SELECT
--U-UPDATE
update 테이블명
    set 컬럼명 = 값, 컬럼명 = 값, ....--바꿀 내용
    where 조건식;
--무를 공짜(0원)으로 만들고
update PRODUCT
    set P_PRICE = 0
    where P_NAME = '무';
--배추를 김장용특대배추로 수정
update PRODUCT
    set P_NAME = '김장용특대배추'
    where P_NAME = '배추';
--전 마트의 주차장 30% 줄이기
update MARKET
    set M_PARKING = M_PARKING * 0.7;
--홈플러스 종로점의 상품들의 가격 10% 할인
update PRODUCT
    set P_PRICE = P_PRICE *0.9
    where P_M_NO = ( 
        select M_NO
        from MARKET
        where M_NAME = '홈플러스' and M_LOCA ='종로'
        );
--제일 비싼 상품 10%할인
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
delete from 테이블명
    where 조건식;
    
--무 삭제
delete from PRODUCT
    where P_NAME = '무';
        

--가장 좁은 매장 상품 다 삭제
delete from PRODUCT
    where P_M_NO in (
        select M_NO
        from MARKET
        where M_LAND = (
            select min(M_LAND)
            from MARKET
        )
    );