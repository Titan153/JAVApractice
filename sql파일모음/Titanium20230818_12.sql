create table person(
    p_name VARCHAR2(10 char),
    p_age number(3),
    p_gender VARCHAR2(2 char)
);

insert into person values('홍길동', 10, '남');
insert into person values('홍길동', 10, '남');
insert into person values('김길동', 30, '여');
insert into person values('최길동', 20, '남');

select*from person;

drop table person cascade constraint purge;

--테이블의 특징
-- 1. 속성은 단일 값만 가진다
--      각 속성의 값은 도메인에 정의된 값만 가지며, 그 값은 모두 단일한 값이어야 함
--      p_age를 예로 들면 최대 3자리 정수 값만 가지며, 그 값은 여러개의 값이 아닌
--      단 하나의 값이어야한다.
-- 2. 속성은 서로 다른 이름을 가진다
--      각 속성마다 p_name, p_age, p_gender 라는 이름을 가지고 있음
--      =>이름을 중복해서 만들지 않기!!!
--      ex)컬럼명 중복오류 !!
--create table test(
--    t_no number(3),
--    t_no varchar2(10 char)
--    );
-- 3. 한 속성의 값은 모두 같은 도메인 값을 가진다
-- => 1번이랑 같은 맥락(p_age)

-- 4. 속성의 순서는 상관없다.
--      속성의 순서가 달라도 테이블의 스키마는 같음
--  ex)
select*from person;
select p_age, p_gernder, p_name from person;
-- 순서만 바뀌었지 내용에는 변화가 없음

-- 5.테이블 내의 중복된 튜플은 허용하지 않는다.
-- 홍길동에 대한 정보가 한번 더 들어가게되면 동일인물인지 다른인물인지 알수가 없음
-- 즉, 모든 튜플에는 차별성이 있어야한다...(생일을 추가한다거나, 핸드폰 번호를 추가한다거나)

drop table person cascade constraint purge;