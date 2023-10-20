--커피 메뉴에 대한 테이블을
--커피의 이름, 가격, 칼로리 , 판매게시한 날짜 값이 들어 갈 수 있게 만들어주세요.
create table menu(
    c_name varchar2(10 char) primary key,
    c_price number(5) not null,
    c_kcal number(4,1)not null,
    c_start date null
);
insert into menu values('카페라떼', 4000, 128, null);

drop table menu cascade constraint purge;
-- ALTER / DROP /TRUNCATE

--  데이터 타입의 변경 / 컴럼의 크기(용량) 변경
-- ALTER TABLE [테이블명] MODIFY [컬럼명] [데이터타입(용량)];
alter table aug18_coffee modify c_name number(3);
alter table aug18_coffee modify c_name varchar2(2 char);
-- 주의: 자료형을 변경할 때는 해당 컬럼의 값을 모두 지워야 변경이 가능!!
--      그렇지 않으면 오류가 발생!!
--      컬럼의 용량을 줄일 경우 해당 컬럼의 용량을 조회해서 변경할 용량 보다
--      큰 값이 있는지 확인하고 값을 변경
-- 용량 조회: DESC 테이블명;

desc menu;

-- 컬럼명 변경 (테이블명)           (컬럼명)    (변경할 컬럼명)
--alter table [테이블명] rename colum[占쏙옙占쏙옙占시뤄옙占쏙옙] to [占쏙옙占싸울옙 占시뤄옙占쏙옙];
alter table aug18_coffee rename colum c_name to c_name2;

--컬럼추가
--alter table[테이블명]add[컬럼명][占쏙옙占쏙옙占쏙옙타占쏙옙][占쏙옙占쏙옙占쏙옙占쏙옙(占쏙옙占쏙옙占쏙옙占쏙옙)];
alter table aug18_coffee and c+taste varcjar2(20 char) not null;

--컬럼삭제
--alter table [테이블명] drop colum[占시뤄옙占쏙옙];
alter table aug18_coffee drop colum c_taste;
-------------------------------------------------------------------------
--2. TRUNCATE 테이블 내의 내용 지우기
--truncate table[테이블명];
truncate table aug18_coffee;
-- 테이블에 있는 데이터를 삭제하지만, 테이블의 구조자체는 사라지지 않음
DESC COFFEE;


-- 3. DROP 테이블 삭제
DROP TABLE [테이블명]; -- 휴지통에 넣어둔 느낌(복원가능)
                    -- EX) FLASHBACK TABLE [테이블명] TO BEFORE DROP;
DROP TABLE [테이블명] CASCADE CONSTRAINT; -- 참조 무시해버리고 삭제시

drop table [테이블명];-- 휴지통에 넣어둔 느낌(복원가능)
                    -- EX) FLASHBACK TABLE [테이블명] TO BEFORE DROP;
drop table [테이블명] cascade constraint;--참조 무시해버리고 삭제시
drop table aug18_coffee;

--占쏙옙占쏙옙占쎈에 占쌍댐옙 占쏙옙占싱븝옙 占쏙옙占쏙옙
flashback table[占쏙옙占싱븝옙占쏙옙] to before drop;
select*from aug18_coffee;
flashback table aug18_coffee to before drop;

--쓰레기통비우기
purge recyclebin;

--테이블 완전삭제
drop table [테이블명] cascade constraint purge;
drop table aug18_coffee cascade constraint purge;
-------------------------------------------------------------------