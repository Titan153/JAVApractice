-- select 문을 다뤄보는중...
-- select 구조는 몇번을 강조해도 정말!!!중요하기 때문에

select [distinct][컬럼명],[컬럼명 as 별칭 || 컬럼명 별칭],[연산자],[통계함수],.......
from [테이블명]
where [조건식]
group by[그룹대상]
having[함수 포함 조건]
order by[정렬대상 asc/desc (오름차순/내림차순)];
-------------------------------------------------------------------------------
--요식업 프랜차이즈
--홍콩반점 서초점은 홍길동이 운영하고 100석
--홍콩반점 종로점은 김길동이 운영하고 80석
--한신포차 강남점은 홍길동이 운영하고 150석
--구로포차 구로점은 최길동이 운영하고 130석
--------------------------------------------------------------------------------
create table franchise(
    f_no number(3) primary key,
    f_name varchar2 (10 char)not null,
    f_loca varchar2(10 char)not null,
    f_ceo number(3)not null,--사장님 번호 --이름값으로 하게되면 '홍길동'겹침
    f_seat number(3)not null
);
--drop table frenchise cascade constraint purge;
create sequence frenchise_seq;
--drop sequence frenchise_seq;

insert into frenchise values(frenchise_seq.nextval,'홍콩반점', '서초점', 1, 100);
insert into frenchise values(frenchise_seq.nextval,'홍콩반점', '종로점', 2, 80);
insert into frenchise values(frenchise_seq.nextval,'한신포차', '강남점', 3, 150);
insert into frenchise values(frenchise_seq.nextval,'구로포차', '구로점', 4, 130);

select * from frenchise;
-------------------------------------------------------------------------------
--홍길동, 1990-03-01일생, 남자
--김길동, 1992-02-01일생, 여자
--홍길동, 1992-12-12일생, 여자
--최길동, 1989-07-14일생, 남자
-------------------------------------------------------------------------------
create table ceo(
    c_num number(3)primary key,
    c_name varchar2(4 char)not null,
    c_birth varchar2(20 char)not null,
    c_gender varchar2(2 char)not null
);
--drop table ceo cascade constraint purge;

create sequence ceo_seq;
--drop sequence ceo_seq;

insert into ceo values(ceo_seq.nextval, '홍길동', to_date('1990-03-01', 'YYYY-MM-DD'), '남자');
insert into ceo values(ceo_seq.nextval, '김길동', to_date('1992-02-01', 'YYYY-MM-DD'), '여자');
insert into ceo values(ceo_seq.nextval, '홍길동', to_date('1992-12-12', 'YYYY-MM-DD'), '여자');
insert into ceo values(ceo_seq.nextval, '최길동', to_date('1989-07-14', 'YYYY-MM-DD'), '남자');

select * from ceo;
-----------------------------------------------------------------------------------
--좌석수가 제일 많은 식당을 운영하는 사람의 전체 정보 조회
select * from ceo
    where c_num = (
        select f_no
        from frenchise
        where f_seat =(
            select max(f_seat)
            from frenchise
        )
    );
-----------------------------------------------------------------------------------
--짜장면, 5000원, 홍콩반점 서초점(100명)에서 파는
--불닭발, 12000원, 한신포차 강남점(150명)에서 파는

create table f_menu(
    m_no number(2) primary key,--메뉴번호
    m_name varchar2 (10 char)not null,
    m_price number(6)not null,
    m_f_no number(10)not null--메뉴 파는 식당 번호
);
--drop table f_menu cascade constraint purge;
create sequence menu_seq;
--drop sequence menu_seq;
insert into f_menu values(menu_seq.nextval,'짜장면', 6000,1);
insert into f_menu values(menu_seq.nextval,'간짜장', 6000,1);
insert into f_menu values(menu_seq.nextval,'짬뽕', 5000,1);
insert into f_menu values(menu_seq.nextval,'탕수육', 11000,1);
insert into f_menu values(menu_seq.nextval,'깐풍기', 12000,1);
insert into f_menu values(menu_seq.nextval,'우동', 15000,1);
insert into f_menu values(menu_seq.nextval,'삼선짜장', 9500,1);
insert into f_menu values(menu_seq.nextval,'삼선짬뽕', 9500,1);
insert into f_menu values(menu_seq.nextval,'삼선우동', 9500,1);
insert into f_menu values(menu_seq.nextval,'짜장밥', 7500,1);
insert into f_menu values(menu_seq.nextval,'짬뽕밥', 7500,1);
insert into f_menu values(menu_seq.nextval,'멘보샤', 18000,1);
insert into f_menu values(menu_seq.nextval,'마라탕', 18000,1);
insert into f_menu values(menu_seq.nextval,'특해물쟁반짜장', 18000,1);
insert into f_menu values(menu_seq.nextval,'윈난성전통면', 18800,1);

insert into f_menu values(menu_seq.nextval,'짜장면', 5500,2);
insert into f_menu values(menu_seq.nextval,'간짜장', 5500,2);
insert into f_menu values(menu_seq.nextval,'짬뽕', 5500,2);
insert into f_menu values(menu_seq.nextval,'탕수육', 11500,2);
insert into f_menu values(menu_seq.nextval,'깐풍기', 12500,2);
insert into f_menu values(menu_seq.nextval,'우동', 15000,2);
insert into f_menu values(menu_seq.nextval,'삼선짜장', 9500,2);
insert into f_menu values(menu_seq.nextval,'삼선짬뽕', 9500,2);
insert into f_menu values(menu_seq.nextval,'삼선우동', 9500,2);
insert into f_menu values(menu_seq.nextval,'짜장밥', 7500,2);
insert into f_menu values(menu_seq.nextval,'짬뽕밥', 7500,2);
insert into f_menu values(menu_seq.nextval,'멘보샤', 18500,2);
insert into f_menu values(menu_seq.nextval,'마라탕', 18500,2);
insert into f_menu values(menu_seq.nextval,'특해물쟁반짬뽕', 19000,2);
insert into f_menu values(menu_seq.nextval,'베이징오리통구이', 22000,2);

insert into f_menu values(menu_seq.nextval,'닭꼬치', 5500,3);
insert into f_menu values(menu_seq.nextval,'양꼬치', 6000,3);
insert into f_menu values(menu_seq.nextval,'비둘기꼬치', 5000,3);
insert into f_menu values(menu_seq.nextval,'오뎅탕', 11000,3);
insert into f_menu values(menu_seq.nextval,'어묵탕', 12000,3);
insert into f_menu values(menu_seq.nextval,'어묵우동탕', 15000,3);
insert into f_menu values(menu_seq.nextval,'마늘간장치킨', 9500,3);
insert into f_menu values(menu_seq.nextval,'까르보불닭', 9500,3);
insert into f_menu values(menu_seq.nextval,'까르보나라', 9500,3);
insert into f_menu values(menu_seq.nextval,'불닭발', 7500,3);
insert into f_menu values(menu_seq.nextval,'불족발', 7500,3);
insert into f_menu values(menu_seq.nextval,'과일모둠콤보', 18000,3);
insert into f_menu values(menu_seq.nextval,'술안주콤보', 18000,3);
insert into f_menu values(menu_seq.nextval,'특대어묵우동', 21000,3);
insert into f_menu values(menu_seq.nextval,'특대어묵우동+소주3병콤보', 38000,3);

insert into f_menu values(menu_seq.nextval,'닭꼬치', 5500,4);
insert into f_menu values(menu_seq.nextval,'양꼬치', 6500,4);
insert into f_menu values(menu_seq.nextval,'비둘기꼬치', 5000,4);
insert into f_menu values(menu_seq.nextval,'오뎅탕', 11000,4);
insert into f_menu values(menu_seq.nextval,'어묵탕', 12000,4);
insert into f_menu values(menu_seq.nextval,'어묵우동탕', 15000,4);
insert into f_menu values(menu_seq.nextval,'마늘간장치킨', 9500,4);
insert into f_menu values(menu_seq.nextval,'까르보불닭', 10000,4);
insert into f_menu values(menu_seq.nextval,'까르보나라', 10000,4);
insert into f_menu values(menu_seq.nextval,'불닭발', 8000,4);
insert into f_menu values(menu_seq.nextval,'불족발', 8000,4);
insert into f_menu values(menu_seq.nextval,'과일모둠콤보', 18000,4);
insert into f_menu values(menu_seq.nextval,'술안주콤보', 18000,4);
insert into f_menu values(menu_seq.nextval,'특대어묵우동', 21000,4);

select * from f_menu;
---------------------------------------------------------------------------------
--프랜차이즈 메뉴 전체의 이름, 가격 조회
--      =>정보를 가격 오름차순 =>메뉴명 가나다 역순
select m_name, m_price from f_menu order by m_price, m_name desc;

-- 전체 사장님들 이름, 생일 조회
select c_name, c_birth from ceo;
--프랜차이즈 식당 몇개?
select count (*) from frachise;
--메뉴 전테의 평균가
select avg(m_price) from f_menu;
---------------------------------------------------------------------------------
--제일 비싼 메뉴 이름,가격
select m_name,m_price 
    from f_menu
    where m_price =(
        select max(m_price)
        from f_menu
        );
--최연장자 사장님 이름, 생일
select c_name, c_birth
    from ceo
    where c_birth = (
        select min(c_birth)
        from ceo
        );
--좌석 수 제일 적은 식당이름, 지점명 좌석 수
select f_name, f_loca, f_seat
    from frenchise
    where f_seat = (
        select min(f_seat)
        from frenchise
        );
        
-------------------------------------------------------------------------------------------
--홍콩반점 서초점 운영하는 사람의 이름, 생일
select c_name,c_birth 
    from ceo
    where c_num = (
        select f_ceo
        from frenchise
        where f_name = '홍콩반점' and f_loca = '서초점'
    );
  
--'짜장' 이 들어간 음식은 어디가면 먹을수 있나?(파는 식당 이름, 지점명)
select f_name, f_loca 
    from frenchise
    where f_ceo in (
        select m_f_no
        from f_menu
        where m_name like '%짜장%'
        );

--좌석수 제일 많은 식당을 운영하는 사람의 모든 정보
select * from ceo
    where c_num = (
        select f_ceo
        from frenchise
        where f_seat = (
            select max(f_seat)
            from frenchise
            )
            );
-------------------------------------------------------------------------------------------
--최연소 사장님네 가게 메뉴 이름, 가격 조회(다시해보기)
select m_name, m_price from f_menu
    where m_f_no = (
        select f_no from frenchise
        where f_ceo =(
            select c_num from ceo
            where c_birth = (select max(c_birth)from ceo)
        )
    );
-------------------------------------------------------------------------------------------
--테이블 여러개를 'join'시킨다
--테이블 여러개를 하나로 이어붙여서 ram메모리에 잠깐 넣어놓는 과정
select * from frenchise , ceo;

select * from frenchise, ceo where f_ceo = c_num;

--전체 식당이름, 지점명, 사장님이름, 사장님생일
select f_name, f_loca, c_name, c_birth from frenchise, ceo;
    where f_ceo = c_no;
--전체 메뉴명, 가격, 식당이름, 지점명
select m_name, m_price, f_name, f_loca from f_menu, frenchise;
    where m_f_no = f_no;
--좌석수가 50석 이상인 식당의 메뉴명, 가격, 식당이름, 지점명, 좌석수
select m_name, m_price, f_name, f_loca, f_seat from f_menu, frenchise
    where m_f_no = f_no and f_seat >=50;
--좌석수 제일 많은 식당의 메뉴명, 가격, 식당이름, 지점명, 좌석수
select m_name, m_price, f_name, f_loca, f_seat from f_menu, frenchise
    where m_f_no = f_no and f_seat in(
    select max(f_seat)
    from frenchise);
--전체 메뉴명, 가격, 식당이름, 지점명, 사장님이름, 생일
select m_name, m_price, f_name, f_loca, c_name, c_birth from f_menu, frenchise, ceo
    where m_f_no = f_no and f_ceo = c_num;
--최연장자 사장님네 전체 메뉴명, 가격, 식당이름, 지점명, 사장님이름, 생일
--         을 메뉴명 가나다순 =>식당이름 가나다순 정렬
select m_name, m_price, f_name, f_loca, c_name, c_birth from f_menu, frenchise, ceo
    where m_f_no = f_no and f_ceo = c_num
    and c_birth = (
    select min(c_birth)
    from ceo
    )
    order by m_name, f_name;
-------------------------------------------------------------------------------------- 
-- 메뉴 데이터의 갯수를 나눠서 페이지로 나누고 싶음 (페이징 처리)
-- 어떻게 할까...?
-- 메뉴 테이블에 m_no 각 메뉴별 번호 값이 있다(primary key)
--          sequence로 처리했음
--          insert하는데 실패해도 올라감
--          데이터를 삭제했다면 ? => 번호값 비어있을거고....
-- m_no 가 정확히 1,2,3,4,5....가 아님
-- 어떤 방법이 있을까.....?
----------------------------------------------------------------------------------
--rownum(가상필드)***************고급!
--      select 할때마다 자동으로 부여됨
--      '*'랑은 같이 사용 못함
--      order by보다 먼저 부여
--      무조건 1번부터 조회해야!!

--가나다 순으로 정렬을 해서 menu테이블의 전체 정보를 조회
select rownum, m_no,m_name,m_price,m_f_no from f_menu order by m_name;

--메뉴이름 가나다순으로 정렬해서 menu테이블 rownum1~3까지 전체 정보
select rownum, m_no,m_name,m_price,m_f_no 
    from f_menu 
    where rownum >=1 and rownum <=3
    order by m_name; --의도한 바는 이름순으로 정렬한 후에
                    -- 그 다음에 번호값을 주길 바람
select rownum, m_no,m_name,m_price,m_f_no 
    from f_menu 
    order by m_name;
    where rownum >=1 and rownum <=3--이러면 오류
    

select rownum, m_no, m_name, m_price --2. rownum부여    
    from (
        select m_no, m_name, m_price --이 부분을 테이블처럼 사용함!(데이터 정렬 0)
        from f_menu                  --inline view라고 함(인라인뷰)   
        order by m_name              --하나의 쿼리문 내에서 테이블처럼 사용       
        );                           --쿼리문 종료 후에 사라짐!   

--메뉴명 가나다순 정렬해서 rownum2~4까지 메뉴테이블 전체정보 조회

--select을 겉에 한번 더 씌워주게 되면서 안에 있는 rownum이 숫자만 부여해놓고 효력을 잃어버림
--why?=>그냥 그럼 덧씌운놈만 남고 안에있는 rownum은 사라짐
select *--rownum, RN, m_no, m_name, m_price
    from(
        select rownum RN,m_no, m_name, m_price
        from(
            select m_no, m_name, m_price
            from f_menu
            order by m_name
        )
    )
    where RN>=2 and RN<=4;

-- ~길동 이름을 가진 사장님네
--      메뉴명, 가격, 식당명, 지점명, 사장님이름
--      가격 내림차순 => 메뉴명 가나다순
--      =>3~8번만 조회

select * 
    from(
        select rownum RN, m_name, m_price, f_name, f_loca, c_name 
        from(
            select m_name, m_price, f_name, f_loca, c_name 
                from f_menu, frenchise, ceo
                where m_f_no = f_no and f_ceo = c_num
                    and c_name like '%길동'
                    order by m_price desc, m_name
    
         )
    )
    where RN between 3 and 8;
    
--김씨 성을 가진 사장님네 메뉴명, 가격, 사장님 이름, 사장님 성별
--가격 오름차순 => 2~3번만 
select*
    from(
    select rownum RN, m_name,m_price,c_name,c_gender
        from(
        select m_name,m_price,c_name,c_gender
            from f_menu, ceo, frenchise
            where m_f_no = f_no and c_num = f_ceo
            and c_name like '김%'
            order by m_price 
            )        
    )
    where RN between 2 and 3;

     
    
    
    






























