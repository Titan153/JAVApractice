create table snack(
    s_no number(4)primary key,
    s_name varchar2(10 char) not null,
    s_maker varchar2(10 char) not null,
    s_price number(4) not null
);
insert into snack(s_no,s_name,s_maker,s_price)values(1,'새우깡', '농심', 3000);
insert into snack(s_no,s_name,s_maker,s_price)values(2,'먹태깡', '농심', 3500);
insert into snack(s_no,s_name,s_maker,s_price)values(3,'라면깡', '농심', 3000);
insert into snack(s_no,s_name,s_maker,s_price)values(4,'미역깡', '농심', 2000);
insert into snack(s_no,s_name,s_maker,s_price)values(5,'우럭깡', '농심', 4000);
insert into snack(s_no,s_name,s_maker,s_price)values(6,'광어깡', '농심', 4000);
--지금이야 적은갯수를 일일히 넣지만 종류가 수백 수천 수만개가 되면
--일일히 숫자를 부여하기 힘들다
--데이터를 만들때 과자번호가 자동으로 계산이 되면 좋겠다.

--factory pattern 공장화 패턴
--MYSQL : AUTOincreament 옵션도 있다.
--현재 우리가 사용하고 있는 OracleDB : Sequence라는 것이 있음
-- 위에서 했다시피 PK키 값을 어떻게든 넣기위해
-- 번호를 순서에 맞게 자동으로 생성해줌
-- 테이블과는 무관하고, 단점으로는 insert에 실패해도 sequence 값은 무조건 올라감
-- 또한, 증가된 값을 다시 내릴수는 없다.

--sequence(table과는 무관한)생성
create sequence 시퀀스명;
create sequence snack_seq;

--구체적인 시퀀스
create sequence 시퀀스명
    increment by 1 -- 증가값(1씩증가)
    start with 1 -- 시작값
    minvalue --최소값
    maxvalue --최대값
    nocycle / cycle --최대값 도달시 시작값부터 다시 반복할지 말지
    nocache / cache -- 메모리에 시퀀스를 미리 만들어 놓고 가져다 쓸지 말지






