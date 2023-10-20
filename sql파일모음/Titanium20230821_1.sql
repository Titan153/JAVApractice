--1. 노트북에 대한 테이블을 만들건데
-- 노트북의 이름, 가격, cpu, RAM, HDD, 보증기간 을 속성으로 갖게 하고싶음
-- 조건에 부합하는 테이블을 작성하는 문장을 작성해 주세요
-- [하나의 기본키(PK)를 가져야 하고, 모든 값은 채워넣어야한다
create table notebook(
    n_name varchar2(40 char)primary key,
    n_price number(7) not null,
    n_cpu varchar2(10 char) not null,
    n_ram number(2) not null,
    n_hdd number(4) not null,
    n_warranty date not null
    );     
--    drop table notebook cascade constraint purge;
    
--2. 노트북의 사양이 좋아져서 128GB짜리 RAM을 사용하게되었음
-- 이 때 RAM 컬럼의 용량을 변경하는 문장을 작성
    alter table notebook modify n_ram number(3);
--3. 노트북의 크기(인치)에 대한 컬럼을 추가하는 문장을 작성
--[단위는 cm이며, 소수점 두번째 자리까지 나타냄]
--[이 값은 빈 값으로 넣을 수 없음]    
    alter table notebook add n_inch number(4,2) not null;
--4. 노트북에는 앞으로 HDD대신 SSD가 장착됨
--HDD컬럼의 이름을 SSD에 대한 이름으로 변경하는 문장을 작성    
    alter table notebook rename column n_hdd to n_ssd;
--5.보증기간 컬럼을 삭제하는 문장을 작성
    alter table notebook drop column n_warranty;

--6.노트북의 가격에 대한 값이 [800000~2300000]사이의값만 들어갈수 있게끔
--해당 컬럼을 변경하는 문장을 작성
--   alter table notebook modify n_price number(7)
--    constraint n_check check (n_price between 800000 and 2300000);
  
  alter table notebook modify n_price number(7)
    check (n_price between 800000 and 2300000);

--
--7.만든 테이블을 완전히 삭제하는 문장을 작성    
    drop table notebook cascade constraint purge;
    
    
    
    
    
    