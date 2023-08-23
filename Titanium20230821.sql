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
--오늘은 DML을 다룬다.
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
    increment by 1 -- 증가값(1씩 증가)
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
insert into snack values (snack_seq.nextval, '뻥이요', '롯데',2000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '비타500', '광동',1600,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '삼다수', '광동',1700,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '초코송이', '오리온',2000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '고래밥', '크라운',2000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '고래밥매운맛', '크라운',3000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '몽쉘', '오리온',3000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '크라운산도', '해태',3000,to_date('2023-08-05 13','YYYY-MM-DD HH24'));

select * from snack;
--------------------------------------------------------------------------------------------------------------------------
--이제 데이터들을 조회해봅시다!
--R(Read) *********
--select [distinct][컬럼명],[컬렴명 as 별칭 || 컬럼명 as 별칭], [연산자 사용], [통계함수],....
--from[테이블명]
--where[조건식]
--group by[그룹대상]
--having[함수 포함 조건]
--order by[정렬대상 ASC/DESC(오름차순/내림차순)];--기본값은 오름차순
--의 형태...

--과자테이블 전체 조회
--'*':테이블 내의 모든 컬럼을 가져온다
--select * from snack;

--select s_maker from snack;
--distinct : 중복 제거
--select distinct s_maker from snack;

--별칭 같은 경우에는 select문 안에서 숫자 계산이 가능한데(+,-,*,/)
select s_price / 100 from snack;
--컬럼명 자체가 s_price/100으로 나옴
--실제 프로그래밍 언어와 연동하다 보면 컬럼명을 이용해서 값을 불러오는 경우가 있는데,
--별칭을 써서 헷갈림을 방지하는 용도로 사용
--select s_price / 100 as s_price, 
sprice/100 s_price2 from snack;

--연산자 사용(산술연산자))
--Dual 테이블의 정의
--1.오라클 자체에서 제공하는 더미테이블
--2.간단하게 함수를 이용해서 계산 결과값을 확인할 때 사용하는 테이블
select 1+'3' from dual; 
-- 어떤 결과값이 나올까?=> 4가 나옴
-- 대부분 다른 언어들 같은 경우에는 문자 우선으로 13이라는 결과가 나오는데
-- 오라클에서는 반대로 숫자가 우선시됨
-- 오라클 내에서는 연산자가 숫자만 연산해줌
select 1+'a' from dual;--에러! invalid number

--문자를 더해주기 위한 연산자가 따로 있는데
--'||'(shift + \)
select '3' || 10 from dual; --결과 310
------------------------------------------------------------------------------
--<쓸만한 내장 함수>
--1.숫자 함수 
--      -ABS(숫자) : 절대값 계산                              ex)ABS(-4.5)
--      -ROUND(숫자, M) : 숫자 반올림, M은 반올림 기준 자릿수    ex)ROUND(5.36,1)
--      -POWER(숫자, N) : 숫자를 N제곱 값을 계산               ex)POWER(2,3)
--      -TRUNC(N, M) : 숫자 값을 M번째 자리까지 남기고 값을 버림 ex)TRUNC(123.456,2)
--                                                          ex)TRUNC(123.456,-1) 
--                                                          ex)TRUNC(123.456,0) 
--      -MOD(M,N) : 숫자 M을 N으로 나눈 나머지                 ex)MOD(12,10)
--      -SQRT(숫자) : 숫자의 제곱근 값을 계산(숫자는 양수)        ex)SQRT(9.0)

--2.문자 함수
--      -CONCAT(S1,S2) : 두 문자열을 연결              ex)CONCAT('ABCD','EFG')
--select CONCAT('ABCD','EFG') from dual;
--      -SUBSTR(S1, N, K) : 문자열의 N번째 부터 K번째 만큼의 길이를 반환
--                                                  ex)SUBSTR('ABCDEFG',3,4)
--      -INSTR(S1,S2,N,K) : S1의 N번째 부터 시작하여 찾고자 하는
--       문자열 S2가 K번째 나타나는 문자열의 위치를 반환
--                                                  ex)INSTR('HELLO','L',1,2)
--      -LPAD(S,N,C):문자열 S의 왼쪽으로부터 지정한 자릿 수 N까지
--          지정한 문자 C로 채움                        ex)LPAD('ABC',5,'*')
--      -RPAD(S,N,C):문자열 S의 오른쪽으로부터 지정한 자릿 수 N까지
--          지정한 문자 C로 채움                        ex)RPAD('ABC',5,'*')
--      -LTRIM(S1,S2) : 문자열 S1을 기준으로 왼쪽에 있는 지정한 문자 S2제거
--                                                  ex)LTRIM('*ABC','*')
--      -RTRIM(S1,S2) : 문자열 S1을 기준으로 오른쪽에 있는 지정한 문자 S2제거
--                                                  ex)RTRIM('*ABC','*')
--      -REPLACE(S1,S2,S3):S1의 지정한 문자 S2를 원하는 문자 S3로 변경
--                                                  ex)REPLACE('JACK and JUE', 'j','BL')
--      -LENGTH : 글자 수를 세어주는 함수 
--      -LENGTH : 글자의 용량(바이트)응 세어주는 함수
--select length('zzz')"글자수",length('zzz')"바이트수"FROM dual;

--3.날짜/시간 관련 함수
--[날짜 형식]
--YYYY:4자리연도 //YYY, YY, Y : 각각 4자리 연도의 마지막 3,2,1 자리
--MM:월 / DD:1달 중 날짜(일자) /DAY :요일(월요일 ~일요일)/DY :요일(월~일)
--HH,HH12: 12시간 단위 / HH24 :24시간 단위 / MI :분 / SS:초/ AM/PM :오전/오후

--      -SYSDATE : 현재 날짜/시간을 반환
--      -TO_DATE(S1, DATETIME형식) : 문자형 데이터를 날짜형으로 반환
select to_date('2023-08-21 오후 03:10', 'YYYY-MM-DD AM HH:MI')from dual;
--      -TO_CHAR(DATE, DATETIME형식):날짜형 데이터를 문자형으로 반환
select to_char(SYSDATE, 'YYYY-MM-DD')from dual;
-- 특정 날짜 값을 받아오고 싶다면 SYSDATE 자리에 TO_DATE함수를 넣어서 만들자!
--      =>반환 되는 데이터 타입이 다르다는걸 기억!!
--  to_date 는 날짜형/ to_char 는 문자형!

--      -ADD_MONTHS(DATE, 숫자):날짜에서 지정한 달만큼 더함(1:다음달, -1:이전달)
select add_months(sysdate, -3)from dual;

--      - LAST_DAY(DATE) : 달의 마지막 날을 반환
select last_day(sysdate)from dual;

--오늘 날짜 기준 연도 조회(테이블 헤더'연도'/컬럼에 2023년 이라고 나오게)
select to_char(sysdate, 'YYYY')||'년'from dual;
--오늘 날짜 기준 월 조회(테이블 헤더'월'/컬럼에 8월 이라고 나오게)
select to_char(sysdate, 'MM')||'월'from dual;
--오늘 날짜 기준 일 조회(테이블 헤더'일'/컬럼에 21일 이라고 나오게)
select to_char(sysdate, 'DD')||'일'from dual;
--오늘 날짜 기준 시/분 조회(테이블 헤더에 각각 시랑 분/컬럼에 21일 이라고 나오게)
select to_char(sysdate, 'HH24')||'시' 시, to_char(sysdate, 'MI')||'분'분 from dual;
--오늘 날짜 기준 초 조회(테이블 헤더에 '초'/컬럼에 ?초 라고 나오게)
select to_char(sysdate, 'MI')||'초'from dual;
--오늘 날짜 기준 요일 조회
select to_char(sysdate, 'DY')요일 from dual;
--지금 오전인지 오후인지 조회
select to_char(sysdate, 'AM')"오전/오후"from dual;
--문자열 '2023-08-23 오전 06:00' 을 날짜형 2023.08.23으로 조회
select to_char(to_date('2023-08-23 오전 06:00','YYYY-MM-DD AM HH:MI'),'YYYY.MM.DD')from dual; 
--오늘 날짜 기준 3달전 마지막날은 몇월 며칠인지 조회
select to_char(last_day(add_month(sysdate,-3)),'mm-dd' from dual;

-- 4.집계/분석 함수 - Select 필드명 쪽이나 having절에서 사용!
--      -AVG(필드명):평균
--      -Count(필드명):검색되는 데이터 수
--      -Max(필드명):최대값
--      -MIn(필드명):최소값
--      -Sum(필드명):총합
--      -Rank:중복 순위만큼 다음 순위값을 증가 시킴
--      -DENSE_RANK: 중복순위가 존재해도 순차적으로 다음 순위값으로 표시함

-- 5.NULL 관련 함수
-- 현재 제약 조건에 NOT NULL로 무조건 데이터를 입력하게 해놨는데
-- NULL : 미확인 값이나 아직 적용되지 않은 값/ 0이나 공란도 아님!
--        말그대로 아직 값이 없다!!

--  NVL함수 : NULL인 경우만 지정된 값으로 대치하는 함수
--      NVL(값, NULL일 때 대체값)
select NVL(NUll, 'B'),NVL('C','B')From dual;

--  NVL2함수 : NULL의 여부에 따라서 지정한 값으로 대치하는 함수
--  NVL2(값, 값이 있을때 대체값, NULL일 때 대체값)
select NVL2(NULL,'A', 'B'), NVL2('C','A','B')from dual;
---------------------------------------------------------------------------
--where 절(조건식)
--전체 데이터 중 지정한 조건에 맞는 데이터를 찾아주는 문장
--조건식에서 사용할 연산자 => 비교 연산자
-- =, !=, ^=, <>, >, <, >=, <=
-- 2,3,4번째는 '같지 않다'로 쓰이는 연산자인데 왜 3개나 될까...?
-- 가격이 3000원인 과자의 모든 정보를 조회
--select * from snack where s_price = 4500;
----------------------------------------------------------------------------
--모든 과자의 이름, 가격 조회
select s_name, s_price from snack;
--모든 과자 이름(가격)으로 조회 ex)컬럼명 : 이름(가격) / 값 : 콘칩(2000원)
select s_name||'('||s_price||'원)'"이름(가격)"from snack;
--2000원 이하의 과자 중 최소가격
select min(s_price)from snack where s_price <=2000;
--모든 과자의 평균가
select round(avg(s_price),1) from snack;
--과자의 이름과 가격의 30%할인 금액
select s_name, s_price * 0.7 from snack;
--4500원인 과자의 갯수
select count(*)from snack where s_price = 500;
--4000원 이하인 과자이름, 회사 이름
select s_name, s_maker from snack where s_price <= 4000;

--모든 과자 이름, 가격, 유통기한 조회
select s_name, s_price, s_exp from snack;
--모든 과자 이름, 가격, 부가세 조회(가격의 10%)
select s_name, s_price, s_price * 0.1 vat from snack;
--모든 과자 이름, 가격, 판매가(20% 할인)
select s_name, s_price, s_price *0.8 from snack;
--3000원보다 큰 금액의 평균가
select round(avg(s_price),1) from snack where s_price > 3000;--소수점 한자리까지
--최고가, 최저가, 총 과자종류 몇가지?
select max(s_price), min(s_price), count(*)from snack;
--3000원 이상인 과자의 전체정보
select * from snack where s_price>=3000;--
--3000원 미만인 과자의 이름, 가격, 판매가(20% 할인)
select s_name, s_price, s_price * 0.8 selling_price from snack where s_price <3000;
--2000원 짜리 과자 몇개?
select count (*) from snack where s_price = 1000;
--허니버터칩의 가격?
select s_price from snack where s_name = '새우깡';
--크라운 회사의 과자 가격 총합
SELECT sum(s_price)from snack where s_maker = '농심';
--이번달 안에 먹어야 하는 과자이름, 가격, 유통기한
select s_name, s_price, s_exp from snack where s_exp < to_date('2023-09-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS')
and s_exp>=sysdate;
----------------------------------------------------------------------------------------------------------------
--관계 연산자
--NOT, AND, OR, BETWEEN, IN
--먼저 AND와 BETWEEN
--가격이 1000원 이상 3000원 이하인 과자의 전체 내용을 조회
--and 를 써서 하는 방법
--select *from snack where 1000<=s_price
select*from snack where s_price>=1000 and s_price <=3000;
--between을 써서 하는 방법
select*from snack where s_price between 1000 and 3000;
--between은 이상/이하로 조건을 정하기 때문에
--1000원 초과 3000원 미만에서는 between사용 못함..

--가격이 1000원, 2000원, 3000원인 과자의 전체 내용을 조회
--or 연산자!
select * from snack where s_price = 1000 or s_price = 2000 or s_price = 3000;
--비효율적인 방법에서 벗어나 편하게 쓸수있는 방법?
--in 연산자 
select * from snack where s_price in(1000, 2000, 3000);
--연속되지 않은 값들을 받아오고 싶을떄는 in을 사용!
--이 결과에 반대되는 결과값을 받아오고 싶을떄 => not연산자!
--이 not을 어디에 쓰면 좋을까? not in
select * from snack where s_price not in(1000, 2000, 3000);
--in 연산자 앞에다가 not을 붙여서 사용하면됨!
--------------------------------------------------------------------------------------
-- 패턴 연산자
--문자열을 포함하는 검색 : like '패턴'의 형태
--이때 패턴에는 '%'를 넣는데 뭐가 들어갈지 모르겠다는 뜻!
--like'%ㅋ' : ㅋ로 끝나는거
--like 'ㅋ%': ㅋ로 시작하는거
--like '%ㅋ%' : ㅋ가 포함
-- 왜 like 대신 (='ㅋ%')는 안되는가?
-- 등호를 써서 식을 표현하면 패턴으로 인식하는게 아닌'ㅋ%'문자 그대로 인식해버림
-- '해'가 들어가는 회사에서 만든 과자 이름 조회
select * from snack where s_name like '%새%';
--  '이'가 들어가는 과자들 평균가
select avg(s_price)from snack where s_name like '%이%';
-- 크라운 과자거나 , 와클 이름 ,제조사,가격 조회
select s_name, s_maker, s_price from snack where s_maker = '크라운' or s_name like '몽쉘%';
-- 과자의 이름이 새콤달콤을 포함하거나, 와클을 포함하는 과자의 이름,제조사,가격 조회
select s_name, s_maker, s_price from snack where s_name like '%새콤달콤%' or s_name like '%와클%';

--select s_name, s_maker, s_price from snack where s_name like in('%새콤달콤%','%몽쉘%');
--like~in 구조는 아얘 없음...

--regexp_like(컬럼명, 패턴1|패턴2|...)
select s_name, s_maker, s_price from snack where like(s_name, '^새콤달콤|이$');

--정규식(regex)을 이용해서 문자를 찾는 방법
--패턴 앞에 ^을 넣으면 : 패턴값으로 시작하는 문자열 찾기
--패턴 뒤에 $를 넣으면 : 패턴값으로 끝나는 문자열을 찾기
--여러개의 패턴을 이용해서 찾고 싶다면 | (파이프)를 넣어서 패턴을 추가하면 됨
----------------------------------------------------------------------------------
-- 집합 연산자
-- 합집합
-- union : 중복되는 값 제외하고 출력
select 1 id, '수학' subject, 90 score from dual
union
select 1 id, '수학' subject, 90 score from dual
union
select 1 id, '수학' subject, 90 score from dual;
-- union all : 중복되더라도 모두 출력
select 1 id, '수학' subject, 90 score from dual
union all
select 1 id, '수학' subject, 90 score from dual
union all
select 1 id, '수학' subject, 90 score from dual;

--교집합
--intersect : 두 테이블의 집합 중 공통되는 값 출력
select 1 id, '수학' subject, 90 score from dual
union
select 2 id, '영어' subject, 90 score from dual--합집합으로 수학,영어 둘다 들어가고
intersect
select 1 id, '수학' subject, 90 score from dual;--교집합으로 공통된 값 수학만 출력

--차집합
--minus : 첫번째 select문 중에서 두번째 select문에는 없는 값 출력
select 1 id, '수학' subject, 90 score from dual
minus
select 1 id, '수학' subject, 80 score from dual--여기까지는 첫번째 select문 출력
minus
select 1 id, '수학' subject, 90 score from dual;--여기는 값이 같으므로 반환되지 않음
---------------------------------------------------------------------------------------
--연산자 우선순위(오른쪽이 최우선순위)
-- or > and > not > 비교연산자 > 괄호
-- 과자 데이터 중에서 회사가 크라운이고 가격이 1000원 이하 이거나 3000원 이상인 과자의
-- 이름, 가격, 유통기한 조회
select s_name, s_price, s_exp, s_maker from snack where s_maker = '크라운' and (s_price<=1000 or s_price >=3000);
--------------------------------------------------------------------------------------------
--group by : 그룹으로 묶어서 연산하여 하나의 결과를 나타내는 것
--회사별 과자 평균가격, 최소가격, 최대가격, 
select s_maker, avg(s_price),min(s_price),max(s_price) from snack group by s_maker;--회사별로 그룹을 지어줌

--rollup 연산자 
group by rollup[그룹대상]
--컬럼에 대한 소계(subtotal)을 만들어 줌
--group by 절의 컬럼갯수가 n개 라고 하면, rollup을 썻을떄 n+1개

--회사이름, 회사별 가격 과자 총 가격 합계와 모든 과자들의 가격 합계
select s_maker, sum(s_price) from snack group by rollup(s_maker);

select nvl2(s_maker,s_maker,'전체')s_maker, sum(s_price) from snack group by rollup(s_maker);
--decode(컬럼, 조건, 조건에 맞는 결과값, 조건에 맞지않는 결과값)
select decode(s_maker, null, '전체',s_maker) s_maker, sum(s_price) from snack group by rollup(s_market);
--having : group by절에 의해 생성된 결과 중 원하는 조건에 부합하는 자료만 찾고자 할때 사용
--having 과 where 모두 조건을 이용해서 원하는 조건에 맞는 자료만 뽑아온다는 공통점
--having : 그룹에 대한 결과를 제한
-- vs
--where : 조건을 사용해서 그 결과를 제한

--회사별 과자 평균 가격이 2000원 이상인 회사의 이름과 과자 평균가격을 조회
select s_maker, avg(s_price) from snack group by s_maker having avg(s_price) >= 2000; 
-------------------------------------------------------------------------------------------------------
--order by : 정렬! 기본값은 오름차순 ASC, 내림차순 정렬은 DESC
--order by : [정렬대상 asc/desc]
--롯데 또는 해태 회사의 과자 평균 가격이 1800원 이상일때 각 회사의 평균 가격 내림차순 정렬
select s_maker,avg(s_price)from snack where s_maker in ('해태','롯데')group by s_maker having avg(s_price) >= 1800 order by avg(s_price)desc;

--***서브쿼리(SUBQUERY)
--사실상 이거 때문에 지금까지 공부한거!
--select 문 안에 다시 select문을 사용하는 기술
--하나의 SQL문 안에 다른 SQL문이 중첩되어있는 쿼리(질의)를 말함
--다른 테이블에서 가져온 데이터로 현재 테이블에 있는 정보를 찾거나 가공할 때 사용함
--나중에 배울 JOIN

--주 질의(main query,외부질의)와 부속질의(sub query,내부질의)로 구성됨

select s_name, s_price from snack where s_price <(select avg(s_price)from snack);
--평균가 보다 가격이 낮은 과자의 이름과 가격 정보를 조회한 문장
--한가지 팁이라면....부분으로 나눠서 구성해보면 가독성이 조금 더 좋아지고,
--조건에 맞게 잘 찾을수 있음!

--메인쿼리의 where절에서 서브쿼리의 결과와 비교할때에는 반드시!!!비교연산자를 사용!!!

--최고가 얼마인지 
select max(s_price) from snack; 
--제일 비싼 과자의 이름, 제조사, 가격
select s_name, s_maker, s_price from snack where s_price = (select max(s_price) from snack);
--제일 싼 과자는 어디에서 만드는지?
select distinct s_maker from snack where s_price = (select min(s_price)from snack);
--평균가보다 비싼 과자는 몇종류?
select count (*) s_name from snack where s_price >(select avg(s_price)from snack);
--유통기한이 가장 오래남은 과자의 전체 정보
select * from snack where s_exp = (select max(s_exp)from snack);
---------------------------------------------------------------------------------------------
--과자회사 테이블을 만들건데 =>회사 이름, 주소(도시), 직원 수 값에 대한 속성!
--과자 테이블에 맞춰서 데이터를 넣어주세요
create table company(
    co_name varchar2(20 char)primary key,
    co_address varchar2(20 char)not null,
    co_employee number(4)not null
    
);

drop table company cascade constraint purge;

insert into company values ('오리온', '수원', 1200);
insert into company values('크라운', '성남', 1300);
insert into company values('농심', '서울', 1500);
insert into company values('롯데', '대전', 1600);
insert into company values('광동', '광동', 900);

--직원 수가 제일 적은 회사에서 만드는 과자이름, 가격 조회
select s_name, s_price 
    from snack 
    where s_maker = (
        select co_name 
        from company 
        where co_employee = (
            select min(co_employee)
            from company
        )
    );
--제일 비싼 과자를 만드는 회사는 어디에?
select co_address 
    from company
    where co_name =(
        select s_maker
        from snack
        where s_price = (
            select max(s_price)
            from snack
        )
    );
--서울에 있는 회사에서 만드는 과자의 평균가?
select avg(s_price)
    from snack
    where s_maker = (
        select co_name
        from company
        where co_address = '서울'
    );
--평균가 이상의 과자를 만드는 회사 이름, 위치 조회
select co_name, co_address
    from company
    where co_name in ( --'='를 쓰면 단일값 이상의 결과를 내보낼수 없어서 관계연산자<IN>사용! single-row subquery returns more than one row
        select s_maker
        from snack
        where s_price >= (
            select avg(s_price)
            from snack
        )
    );









