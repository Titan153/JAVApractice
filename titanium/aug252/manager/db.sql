-- 어떤 특정한 식당에 대한 테이블
-- 식당 지점(체인점 지역), 식당 주인, 좌석 수
create table restaurant(
	r_location varchar2 (10 char) primary key,
	r_owner varchar2 (5 char) not null,
	r_seat number(5) not null
);
insert into restaurant values('종로','홍길동',100);
insert into restaurant values('강남','최길동',80);

-- 예약 테이블
-- 예약자 이름, 예약 시간, 예약자 전화번호, 예약 지점
create table reservation(
	r_no number(3) primary key,
	r_name varchar2(10 char)not null,
	r_time date not null,
	r_phonenum varchar2(20 char)not null,
	r_location varchar2(10 char)not null,
	constraint fk_r_location foreign key(r_location)
	references restaurant(r_location)
	on delete cascade
);

create sequence reservation_seq;

insert into reservation values(reservation_seq.nextval, '김길동',
to_date('2023-08-30 18:30', 'YYYY-MM-DD HH24:MI'),'010-1111-2222', '종로');
insert into reservation values(reservation_seq.nextval, '김길동'
, to_date('2023-09-01 14:15', 'YYYY-MM-DD HH24:MI'), '010-1234-3333', '강남');

select * 
from reservation;








