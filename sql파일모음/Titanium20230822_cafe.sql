--1.음료테이블과 카페테이블을 만들어보려고 합니다.
--음료테이블에는 음료이름/가격/판매하는 카페의 이름
create table drink(
    d_name varchar2(10 char)primary key,
    d_price number(5),
    d_cafeName varchar2(10 char)
);
insert into drink values('아메리카노', 2000, 'acafera');
insert into drink values('라떼', 3000, 'acafera');
insert into drink values('녹차', 2500, 'acafera');
insert into drink values('홍차', 2500, 'beaver');
insert into drink values('스무디', 3000, 'beaver');
insert into drink values('에스프레소', 4000,'beaver');

--카페테이블에는 카페이름 /지역/좌석수
--조건)각 테이블에서 음료이름과/ 카페이름은 고유한 값을 갖는다.
--조건)각 테이블의 관계를 고려

--2.조건에 맞는 테이블을 만들고 값을 넣어주세요
--A카페는 서울에 위치하고 좌석이 100석이며,(아메리카노, 2000원),(라떼, 3000원),(녹차,2500원)에 판매
--B카페는 부천에 위치하고 좌석이 80석이며,(홍차, 2500원),(스무디, 3000원),(에스프레소,4000원)에 판매
create table cafe(
    c_name varchar2(10)primary key,
    c_loca varchar2(10),
    c_seat number(3)
);
--drop table cafe cascade constraint purge;
insert into cafe values ('acafera', '서울', 100);
insert into cafe values ('beaver', '부천', 80);

--3.요청하는 쿼리문을 작성해주세요

--모든 음료의 평균가보다 비싼 음료는 몇 종류인지
select count (*) d_price 
    from drink 
    where d_price > (
        select avg(d_price)
        from drink
    );
--제일 싼 음료를 파는 카페의 이름?
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
--서울에 있는 카페에서 만드는 음료 평균가?
select avg(d_price)
    from drink
    where d_cafeName = (
        select c_name
        from cafe
        where c_loca = '서울'
        );
--좌석이 90석 이상인 카페에서 파는 음료의 이름?
select d_name
    from drink
    where d_cafeName = (
        select c_name from cafe where c_seat >= 90);
--평균가 이하인 음료의 이름?
select d_name 
    from drink 
    where d_price <=(
        select avg(d_price)
        from drink);

--가장 비싼 음료를 파는 카페는 어디에 있는지?
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

