--저번주에 DB설치 cmd기반의 SQLplus 를 다뤄보면서 DBA들이 하는 업무를 살짝 맛봤음(권한부여, tablespace)
--간단하게 용어정리(테이블/행/컬럼/스키마/인스턴스/도메인)
--SQL의 명령문 중에 정의어(DDL)를 배우면서 테이블을 만들어 봤고
--테이블을 만들면서 필요한 자료형(주력으로 사용한 것만)
--문자형 : VARCHAR2 / 숫자형 : NUMBER / 날짜형 : DATE
--제약조건 ! / 우선 NOT NULL과 PRIMARY KEY는 기억하자!!
--          /FOREIGN KEY는 조만간 보자...!
--테이블의 구조를 수정하거나, 삭제해보면서 DDL완료 했음!!!
--------------------------------------------------------------------------------------------
--과자 테이블을 만들어보자
--과자의 이름, 회사, 가격 정보 넣고싶다
--테이블 하나에 PK하나 있었으면 좋겠다 => 어디에 PK를 먹일지 생각해 보면서!

--어디다가 PK?
--번호값을 만들어서 여기에 PK를 먹이는 것이 한 방법
--create table snack(
--    s_no number(4) primary key,
--    s_name varchar2(10 char) not null,
--    s_maker varchar2(10 char) not null,
--    s_price number(4) not null
--    );
--------------------------------------------------------------------------------------------
--오늘은 DML을 다뤄볼것
--데이터 조작어(Data Manipulation Language)
--SELECT, INSERT, UPDATE, DELETE,...
--줄여서 CRUD(create read update delete)
--여기서의 C는 (create table - X(DBA의 작업))
--  데이터를 만든다는 의미의 C(insert - o)
-- 형태는
insert into 테이블명(컬럼명, 컬럼명, 컬럼명,....)values(값, 값, ...);
--값을 넣어 보자면
insert into SNACK(s_no, s_name, s_maker, s_price)values(1, '초코파이', '오리온', 5000);

--컬럼 순서 바꾸기 - 됨!
insert into SNACK(s_name, s_price, s_no, s_maker)values('새콤달콤', 500,2,'롯데');

--컬럼에 값을 안넣게되면 - ?! -에러
--NOT NULL이 없없다면 결과값은 null이라 표현됨
--가급적이면 값들이 들어있으면 좋겠음!
insert into SNACK(s_name, s_no)values('마이쮸',3);

--(컬럼명, 컬럼명, ....)안넣고 컬럼 순서대로 값을 넣는 방법도 있음!
insert into 테이블명 values (값, 값, ...);
insert into SNACK values (4, '엄마손파이', '롯데', 4000);
----------------------------------------------------------------------------------------------
--테이블 지우고 다시 만들어서
--4~5개 정도만 값을 넣어보자!
drop table snack cascade constraint purge;

create table snack(
    s_no number(4) primary key,
    s_name varchar2(10 char) not null,
    s_maker varchar2(10 char) not null,
    s_price number(4) not null
    );
    
    insert into snack(s_no,s_name,s_maker,s_price)values(1,'새우깡','농심',2000);
    insert into snack(s_no,s_name,s_maker,s_price)values(2,'먹태깡','농심',2000);
    insert into snack(s_no,s_name,s_maker,s_price)values(3,'신라면','농심',2000);
    insert into snack(s_no,s_name,s_maker,s_price)values(4,'초코송이','오리온',1500);
--그런데...지금이야 5개 넣어서 번호값 일일히 설정하면되지만
--과자의 종류가 수백 수천개가 되면 일일히 넣어주기 힘들다
--데이터를 만들때 과자 번호가 자동으로 계산이 되었으면 좋겠다

--factory pattern 이라고 해서 말 그대로 공장화 시스템
--MYSQL : Autoincreament 옵션 이라는 것도 있고,
--현재 우리가 사용하고 있는 OracleDB : Sequence 라는 것이 있음
--      위에서 했다시피 PK키 값을 어떻게든 넣기위해
--      번호를 순서에 맞게 자동으로 생성해 주는건데
--      테이블과는 무관하고, 단점으로는 insert 에 실패해도 sequence 값은 무조건 올라감
--      또한, 증가된 값을 다시 내릴수는 없다.

--sequence(table과는 무관한)생성
create sequence 시퀀스명; --간단한 시퀀스
create sequence snack_seq;--데이블 명에  _seq를 붙여주는 문화가 있음

--구체적인 시퀀스
create sequence 시퀀스명
    increament by 1 -- 증가값(1씩 증가)
    start with 1 -- 시작값
    minvalue -- 최소값
    maxvalue -- 최대값
    nocycle / cycle --최대값 도달시 시작값부터 다시 반복할지 말지
    nocache / cache -- 메모리에 시퀀스를 미리 만들어 놓고 가져다 쓸지 말지
    
--간단한 시퀀스를 써도 기본값이 있어서 간단한 시퀀스를 쓰는걸로!

--sequence 삭제
drop sequence 시퀀스명;

--seuqence 사용 : 시퀀스명.nextval
--기존 테이블 삭제 했다가 다시 만들고 값을 넣어봅시다!
drop table snack cascade constraint purge;
drop sequence snack_seq;

create table snack(
    s_no number(4) primary key,
    s_name varchar2(10 char) not null,
    s_maker varchar2(10 char) not null,
    s_price number(4) not null,
    s_exp date not null
    );
    create sequence snack_seq;
    
-- 시간 / 날짜
-- sysdate : 현재 시간 / 오늘 날짜
select sysdate from dual;

insert into snack values(snack_seq.nextval,'새콤달콤 딸기맛', '크라운', 500, sysdate);
--특정시간 / 날짜
-- 내장함수 - to_date('값','패턴')
-- 패턴(대문자)- YYYY(연도 4자리),MM(월),DD(일),AM/PM(오전/오후),
--              HH, HH24(추천),MI(분), SS(초)

-- 값들을 막 넣어주세요!!
insert into snack values (snack_seq.nextval, '새콤달콤 포도맛', '크라운',500,to_date('2023-08-22 12','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '새콤달콤 딸기맛', '크라운',500,to_date('2023-08-25 03','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '새콤달콤 복숭아맛', '크라운',500,to_date('2023-08-09 11','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '초코파이', '오리온',4500,to_date('2023-08-06 11','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '새우깡', '농심',1500,to_date('2023-08-11 11','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '와클', '크라운',1100,to_date('2023-08-23 07','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '짜파게티', '농심',1300,to_date('2023-08-01 08','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '뻥이요', '롯데',1000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));

select * from snack;

























