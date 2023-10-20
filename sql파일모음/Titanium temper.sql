create table temper(
    STD_DE varchar2(11 char),--날짜 담을 컬럼
    area_cd varchar2(5 char),--지역 코드번호를 담을 컬럼
    avg_temper number(5, 2), --평균기온을 담을 컬럼
    min_temper number(5, 2), --최저기온을 담을 컬럼
    max_temper number(5, 2)  --최고기온을 담을 컬럼

);

select * from temper;
--drop table temper cascade constraint purge;

create table temper_data(
    std_de varchar2(11 char) primary key,--날짜 담을 컬럼
    area_cd varchar2(5 char),--지역 코드번호를 담을 컬럼
    avg_temper number(5, 2), --평균기온을 담을 컬럼
    min_temper number(5, 2), --최저기온을 담을 컬럼
    max_temper number(5, 2)  --최고기온을 담을 컬럼

);
--drop table temper_data cascade constraint purge;
--temper_data 테이블에 temper 테이블에 있는 데이터 저장
insert into temper_data
    select
        replace(std_de , '-', '')std_de,
        area_cd,
        avg_temper,
        min_temper,
        max_temper
    from temper;
        
select * from temper_data;

--서울시 역사상 최저온도, 최고온도 조회
select min(min_temper)최저온도, max(max_temper)최고온도 from temper_data;
-------------------------------------------------------------------------------
--서울시의 역사상 최저온도, 최고온도와 해당일자
select B.STD_DE, B.min_temper, B.max_temper
    from(
        select min(A.min_temper) min_temper, max(A.max_temper) max_temper
        from temper_data A)A, temper_data B
        where B.min_temper = A.min_temper
        or B.max_temper = A.max_temper
        order by b.max_temper;
        

select B.STD_DE, B.min_temper, B.max_temper
    from(select min(min_temper) 최저온도, max(max_temper) 최고온도
        from temper_data )A, temper_data B
        where B.min_temper = A.최저온도
        or B.max_temper = A.최고온도
        order by b.max_temper;
        

create table STUDENT(
    S_NO number(3) primary key,
    S_NAME varchar2(10 char)not null,
    S_HEIGHT number(4,1)not null,
    S_CLASS varchar2(10 char)not null
);
create sequence STUDENT_SEQ;
insert into STUDENT values(STUDENT_SEQ.nextval, 'ASDF', 172.1, '1강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'ZXQV', 168.3, '2강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'QWER', 175.1, '2강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'TYUI', 153.1, '3강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'GHJK', 190.8, '1강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'VBNM', 176.2, '3강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'POIU', 185.3, '3강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'LKJH', 175.1, '2강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'MNBV', 153.1, '3강의장');
insert into STUDENT values(STUDENT_SEQ.nextval, 'ERTY', 183.1, '1강의장');

select *from STUDENT;

--window함수
--행과 행 사이에 관계를 쉽게 정의하기 위해 만든 함수
--복잡한 프로그램을 하나의 문장으로 쉽게 해결할 수 있다
--대표적으로 전에 배운 집계함수와 순위함수가 있는데 
--순위, 합계 평균 등을 조작할 수 있음

--구조
select 컬럼명, 컬럼명, 집계함수, ...,
    over([partition by 컬럼명] [order by 컬럼명][windowing절])
    from 테이블명; 

--over(): oreder by, group by 구문을 대체할수 있는 함수
--partition by : 컬럼을 기준으로 그룹(파티션)을 나눈다
--order by : over함수 내에서 정렬
--windowing절 : 행 기준의 범위를 정함
--  옵션...
--  rows : 범위를 지정(행을 기준으로)
--  range: 범위를 지정(행이 가지고 있는 값을 기준으로)
--  between ~ and : 시작과 끝 위치를 설정
--  unbounded preceding : 시작위치가 첫번째 행
--  unbounded following : 마지막 위치가 마지막 행

--  rank : 중복순위 만큼 다음 순위값을 증가시킴
select S_NAME, S_CLASS, S_HEIGHT,
    rank()over(order by S_HEIGHT desc)HEIGHT_RANK,
    rank()over(PARTITION by S_CLASS order by S_HEIGHT desc)IN_CLASS_RANK
    from STUDENT;
    
--dense_rank : 중복 순위가 존재해도 순차적으로 다음 순위값을 나타냄
select S_NAME, S_CLASS, S_HEIGHT,
    rank()over(order by S_HEIGHT desc)RANK,
    dense_rank()over(order by S_HEIGHT desc)dense_RANK
    from STUDENT;

--first_value : 그룹(파티션)에서 가장 처음에 나오는 값
select S_CLASS , S_NAME, S_HEIGHT,
    FIRST_VALUE(S_NAME)OVER(PARTITION by S_CLASS order by S_HEIGHT desc
    --강의장 별로 그룹 지었고, 그 안에서 학생들 키 내림차순 정렬
    --그 그룹 내의 처음부터 끝까지행에는 처음 나오는 학생의 이름값을 불러오겠다
    rows between UNBOUNDED PRECEDING and UNBOUNDED FOLLOWING)
from STUDENT;

--last_value : 파티션에서 가장 마지막에 나오는 값
select S_CLASS , S_NAME, S_HEIGHT,
    --강의장 별로 그룹 지었고, 그 안에서 학생들 키 내림차순 정렬
    last_VALUE(S_NAME)OVER(PARTITION by S_CLASS order by S_HEIGHT desc
    --그 그룹 내의 처음부터 끝까지행에는 마지막에 나오는 학생의 이름값을 불러오겠다
    rows between UNBOUNDED PRECEDING and UNBOUNDED FOLLOWING)
from STUDENT;

--lag : 이전 행의 값을 가져옴
select S_CLASS, S_NAME, S_HEIGHT,
        --이전행의 S_HEIGHT 값을 가져올건데 강의장 별로 그룹을 지었고, 키 오름차순으로 정렬,
        --만약 이전 행에 대한 값이 없어서 null값이면'-'으로 바꾸고
    decode(lag(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT),null, '-',
    --이전 행의 값이 있으면 그 값을 불러오겠다
    lag(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT))lag_HEIGHT
    from STUDENT;

--lead : 다음 행의 값을 가져옴
select S_CLASS, S_NAME, S_HEIGHT,
        --다음행의 S_HEIGHT 값을 가져올건데 강의장 별로 그룹을 지었고, 키 오름차순으로 정렬,
        --만약 이전 행에 대한 값이 없어서 null값이면'-'으로 바꾸고
    decode(lead(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT),null, '-',
    --다음행의 값이 있으면 그 값을 불러오겠다
    lead(S_HEIGHT)over(PARTITION by S_CLASS order by S_HEIGHT))lag_HEIGHT
    from STUDENT;
--ntile : 결과를 사용자가 지정한 그룹 수로 나눠서 출력
--키 내림차순 기준으로 5개로 그룹으로 나누기
select S_CLASS, S_NAME, S_HEIGHT,
    NTILE(5) over(order by S_HEIGHT desc)N_TILE
    from STUDENT;
