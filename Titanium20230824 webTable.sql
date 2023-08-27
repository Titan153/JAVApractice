--join
--하나의 명령문에 의해 여러 테이블에 저장된 데이터를 한번에 조회할수 있는 기능
--마치 하나의 테이블 인것 처럼 보여주는 것!

create table tb1(name varchar(20), age number(3));
create table tb2(name varchar(20), age number(3));

insert into tb1 values ('김비버', 30);
insert into tb1 values ('박비버', 35);
insert into tb1 values ('최비버', 40);
insert into tb1 values ('오비버', 40);

insert into tb2 values('김비버', 30);
insert into tb2 values('이비버', 50);
insert into tb2 values('정비버', 55);

--cross join : 별도의 조건 없이 두 테이블간의 가능한 모든 결과를 조회(모든 경우의 수)
--사실상 안쓰는 조인
select * from tb1, tb2;
select * from cross join tb2;

--inner join : 조건에 해당하는 값만 나옴
select * from tb1 inner join tb2 on tb1.name = tb2.name;
select * from tb1 A, tb2 B where a.name = b.name;--EQUI조인(동등조인)
select * from tb1 join tb2 using (name);--join~uning(조인대상컬럼명)
select * from tb1 natural join tb2;--자연조인, 조건절 없이 양쪽에 같은 이름을 가진
                                    --동일한 컬럼만 조회

--outer join : 기준 테이블의 데이터가 모두 조회(누락없이)되고, 
-- 대상테이블에 데이터가 있을 경우 해당 컬럼의 값을 가져오기 위해서 사용
-- (+)를 이용한 outer join : null이 출력되는 테이블의 컬럼에 (+)기호 추가
--left outer join : 왼쪽 테이블에 값이 있을때 오른쪽 테이블이 조건에 맞지 않아도 나옴
--(조건에 맞지 않으면 null로 메꿈) + right보다 더 자주사용 (글을 왼쪽에서 오른쪽으로 읽는경향)
select*from tb1 left outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name = tb2.name(+);

--right outer join : 오른쪽 테이블에 값이 있을때 왼쪽 테이블이 조건에 맞지 않아도 나옴
--(조건에 맞지 않으면 null로 메꿈)
select*from tb1 right outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name(+) = tb2.name;

--full outter joun : 한쪽 테이블에 값이 있을때 다른쪽 테이블이 조건에 맞지 않아도 나옴
select * from tb1 full outer join tb2 on tb1.name = tb2.name;

--self join***헷갈림

--하나의 테이블 내에 있는 컬럼끼리 연결하는 조인이 필요한 경우
--하나의 웹사이트에 회원이 5명 있고 관리자가 2명이 있음
create table web(
    w_id varchar2(10 char)primary key,
    w_name varchar2(10 char)not null,
    w_manager varchar2(10 char)
);
drop table web cascade constraint purge;
--회원의 이름은 각각 회원1~5/관리자의 이름 관리자 1,2
insert into web values('meber1', '회원1', 'manager1');
insert into web values('meber2','회원2', 'manager1');
insert into web values('meber3','회원3', 'manager1');
insert into web values('meber4','회원4', 'manager2');
insert into web values('meber5','회원5', 'manager2');
--회원의 아이디는 각각 member1~5/관리자의 아이디는 각각 manager 1,2
insert into web values('manager1','관리자1', null);
insert into web values('manager2','관리자2', null);
--회원 1~3번은 관리자 1이 관리/나머지 회원은 관리자 2가 관리

select  * from web;
--이 테이블 내에서 각 관리자가 어떤 회원을 관리하는지 알고싶음
select w_id, w_name, w_manager from web 
        where w_manager in (select w_id from web);

select * from web A join web B
    on A.w_id = B.w_id;
    
--그래서 A테이블 w_id와 B테이블의 w_name를 연결해서
select * from web A join web B
    on A.w_id = B.w_manager; --계정 id와 관리자의 계정이 같은
                            -- 값들을 연결해서
                            --관리하는 회원id값을 가져올수있게
--------------------------------------------------------------------------------


















