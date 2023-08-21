--커피 메뉴에 대한 테이블을
--커피의 이름, 가격, 칼로리, 판매개시한 날짜 값이 들어갈수 있게 만들어 주세요
--테이블에는 PK가 하나 꼭 있어야하고... 값들이 비어있지 않아야한다
create table menu(
    c_name varchar2(10 char) primary key,
    c_price number(5) not null,
    c_kcal number(4,1)not null,
    c_start date null
);
insert into menu values('카페라떼', 4000, 128, null);

drop table menu cascade constraint purge;
-- ALTER / DROP /TRUNCATE

-- 데이터 타입 변경/ 컬럼의 크기(용량)변경
--alter table [테이블명] modify [컬럼명][데이터타입(용량)];
alter table aug18_coffee modify c_name number(3);
alter table aug18_coffee modify c_name varchar2(2 char);
--주의사항 : 자료형을 변경할 때는 해당 컬럼의 값을 모두 지워야 변경이 가능
--          그렇지 않으면 오류가 발생
--          컬럼의 용량을 줄일경우 해당 컬럼의 용량을 조회해서 변경할 용량보다
--          큰 값이 있는지 확인하고 값을 변경!!
--  용량조회 : desc[테이블명];
desc menu;

--컬럼명 변경 
--alter table [테이블명] rename colum[이전컬럼명] to [새로운 컬럼명];
alter table aug18_coffee rename colum c_name to c_name2;

--컬럼 추가
--alter table[테이블명]add[컬럼명][데이터타입][제약조건(생략가능)];
alter table aug18_coffee and c+taste varcjar2(20 char) not null;

--컬럼삭제
--alter table [테이블명] drop colum[컬럼명];
alter table aug18_coffee drop colum c_taste;
-------------------------------------------------------------------------
--테이블 내의 내용 지우기
--truncate table[테이블명];
truncate table aug18_coffee;
--테이블에 있는 데이터를 삭제하지만, 테이블의 구조 자체는 사라지지 않음

--테이블 삭제 시 (휴지통에 넣은상황)
drop table [테이블명];
drop table [테이블명] cascade constraint;--참조 무시해버리고 삭제시
drop table aug18_coffee;

--휴지통에 있는 테이블 복원
flashback table[테이블명] to before drop;
select*from aug18_coffee;
flashback table aug18_coffee to before drop;

--휴지통 비우기
purge recyclebin;

--휴지통에 넣기 + 비우기 => 테이블 완전 삭제
drop table [테이블명] cascade constraint purge;
drop table aug18_coffee cascade constraint purge;
-------------------------------------------------------------------