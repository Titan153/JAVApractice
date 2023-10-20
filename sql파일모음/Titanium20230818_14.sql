-- [옵션]
-- 제약조건 (Constraint)이라고 부름
-- 데이터 무결성을 보장하기 위해서 사용하는데
-- 데이터 무결성 : 데이터베이스에 저장된 데이터의 일관성과 정확성을 지키는 것

--  1.도메인 무결성 제약조건
--      도메인 제약(Domain Constraint)이라고도 하며,
--      테이블 내의 튜플들이 각 도메인에 지정된 값만 가져야 한다는 조건
--      데이터타입(type), (null, not null) , 기본값(default), 체크(check)등을
--      사용하여 지정할 수 있음
--  2.개체 무결성 제약조건
--      기본키 제약(Primary Key Costraint)이라고도 함
--      개체(Entity) : 사람, 장소, 사물, 사건 등과 같이 독립적으로 존재하면서
--                      고유하게 식별이 가능한 단위
--      아무리 많은 개체가 있어도 내가 원하는 유일한 개체를 발견할 수 있어야함!
--      테이블은 기본 키 를 지정하고 , null값을 가져서는 안되며,
--      오직 하나의 값만 존재해야 한다는 조건!!
--  3.참조 무결성 제약조건
--      외래키 제약(Foreign Key Costraint)라고도 하며,
--      테이블 간의  참조 관계를 선언하는 제약조건
--      참조 받는 테이블의 외래키는 참조하는 테이블의 기본키와 도메인이 동일해야하며,
--      참조 받는 테이블의 값이 변경될 때 참조하는 테이블의 제약을 받는다는 것!
-----------------------------------------------------------------------
--  1. NOT NULL : NULL은 값이 비어있다라는 뜻
--                 0이나 띄어쓰기도 아닌 정말로 값을 넣지 않은 상태
--                NULL을 허용하지 않겠다 => 필수적으로 입력해야 할 컬럼에 설정
create table example1(
    col1 varchar2(10 char),
    col2 VARCHAR2(10 char)not null
);

/*Costraint 키워드를 사용해서 제약조건 명을 따로 부여함*/
create table example2(
    col1 varchar2(10 char),
    col2 varchar2(10 char)
    CONSTRAINT col2_notnull not null
);
--테이블을 만들떄 가급적이면 값이 들어가게 해줬으면 좋겠다!

--2. UNIQUE : 단어 뜻 그대로 해당 컬럼에 들어가는 값이 테이블 전체에서 유일해야 한다.
--      NOT NULL과 함꼐 사용이 가능하지만, UNIQUE는 많이 사용되지는 않음
create table example3(
    col1 varchar2(10 char) unique,
    col2 varchar2(10 char) unique not null,
    col3 VARCHAR2(10 char),
    CONSTRAINT col3_unique unique(col3)
    );

-- 3.Primary Key(기본키) : NULL을 허용하지 않고, 중복된 데이터를 허용하지 않는다
--  (NOT NULL + UNIQUE = PRIMARY KEY)
-- 따라서 데이터의 특정 조건을 검색하거나 수정등의 작업을 할 때 기본키로 구분
--  (ID, 주민등록번호 ,회원번호, 글 번호 등이 기본키에 적합)
-- 테이블에 1개의 기본키를 갖는다
create table example4(
    col1 varchar2(10 char)primary key,
    col2 varchar2(10 char)
);

create table example5(
    col1 varchar2(10 char),
    col2 varchar2(10 char),
    col3 varchar2(10 char),
    constraint PK_example5 primary key(co1, col2)
    
);

-- ****진짜 어려움!!!=>적어도 오늘은 보고 넘깁시다//PK와 NN에 집중!
-- 4. FOREIGN KEY(외래키) : 다른 테이블의 특정 컬럼을 조회해서
--                          동일한 데이터가 있는경우에만 입력이 허용됨
--      참조하는 테이블은 PK나 UNIQUE로 지정된 컬럼만을 FK로 지정할 수 있음
--      외래키 설정을 위해서는 참조받는 컬럼이 먼저 생성이되어야 하고,
--      외래키를 심을 테이블이 이후에 생성이 되어야 함
--  외래키를 심을 테이블의 형태는...
create table 테이블명(
    컬럼명 자료형,
    constraint fk명 foreign key(컬럼명)
        references 대상테이블명(대상테이블의 기본키(OR고유키) 컬럼명)
        on delete set null || on delete cascade
        --참조받는 테이블에서 행 부분을 지웠을때
        --이 테이블에서 연결되어있는 행에 대해서
        --NUll값으로 바꿀지 || 같이 지워버릴지에 대한 옵션
);
create table example6(
    ex6_id varchar2(10 char)primary key
);
insert into example6 values('10');
insert into example6 values('20');
insert into example6 values('30');
select * from example6;

create table example7(
    ex7_id varchar2(10 char),
    constraint fk_ex7 foreign key(ex7_id)
    references example6(ex6_id)
    on delete cascade
);
insert into example7 values('10');
insert into example7 values('20');
insert into example7 values('30');
insert into example7 values('40');--실패(참조한 ex6에는 현재'10', '20', '30' 만 있어서)

select*from example6;
select*from example7;
--ex6_id가 '10'인 값을 지우면 어떻게 될까?
delete from example6 where ex6_id = '10';
select*from example6;
select*from example7;

drop table example6 cascade constraint purge;
drop table example7 cascade constraint purge;
---------------------------------------------------------------------------------
--학과 테이블과 이것을 참조하는 학생 테이블을 만들어 보자.
--학과 테이블 + 값 넣기
--학과 코드 : 4자리 숫자
--학과 이름 : 10글자 이내의 글자

create table major(
    m_code number(4) primary key,
    m_name varchar2(10 char) not null
);
insert into major values(1001, '컴퓨터공학과');
insert into major values(2001, '체육학과');
--학생테이블 + 값 넣기
--학생번호 : 3자리 숫자(101번부터 시작), 
--학생이름 : 17자리 , 
--학생이 소속되어있는 학과의 코드
create table student(
    s_num number(3)primary key,
    s_name varchar2(17 char)not null,
    s_code number(4)not null,
    constraint fk_student foreign key(s_code)
        references major(m_code)
        on delete cascade
);
insert into student values (101, '곽두팔', 1001);
insert into student values (102, '김춘삼', 2001);
insert into student values (103, '곽비버', 1001);
insert into student values (104, '박비버', 2001);
insert into student values (105, '왕비버', 3001);
--major테이블에서 101 코드를 지우면, student테이블에서 1001코르들 가지고있는 학생정보 사라짐
select*from major;
select*from student;
--drop table major;
drop table major cascade constraint purge;
drop table student cascade constraint purge;

-- 5.check : 데이터의 값의 범위나 조건을 설정해서 조건에 해당하는 데이터만 허용!
create table example8(
    col1 number(10)
    constraint ex8_check check (col1 between 1 and 9)
);

insert into example8 values(10);
drop table example8 cascade constraint purge;

-- 6.DEFAULT : 아무런 데이터도 입력하지 않았을 경우 지정한 데이터가 자동으로 입력!
create table example9(
    col1 number default 999
);
insert into example9 values(default);
insert into example9 values(null);
insert into example9 values(0);
insert into example9 values(11);

select*from example9;
