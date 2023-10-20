--웹사이트에서 게시판에 대한 테이블과 이를 [참조하는]게시판 댓글 테이블을 만들려고 합니다.
--게시판 테이블의 구조는 [작성자/게시판 글 내용/ 작성시간] 에 대한 부분이 있었으면 좋겠고
--댓글 테이블에는 [작성자 /댓글내용/ 작성시간]에 대한 부분이 있었으면...

--1.테이블 구조를 파악해서 게시판 테이블 만들기
create table board (
    b_no number(4) primary key,
    b_owner varchar2(20 char)not null,--작성자가 글을 하나만 올릴것은 아니니 pk(x)
    b_txt varchar2(1000 char)not null,--글 내용이 길어지면 중복될일이 적겠지만,'ㅋ'하나만 써있는 게시글이 게시판 전체에 과연 하나만 있을까?
    b_when date not null --확률이 상당히 적지만, 정말 우연의 일치로 같은 시간/초 대에 게시글이 올라갈 가능성이 있음
);
--drop table board CASCADE CONSTRAINTS PURGE;
create sequence board_seq;
--drop SEQUENCE board_seq;

--2.테이블 구조를 파악해서 댓글 테이블 만들기
--[조건 : 참조 되는 테이블의 내용이 삭제되면 관련있는 댓글도 삭제]
create table comment1(
    c_no number(4) primary key,
    c_c_no number(4) not null,--소속된 글 번호/ 게시판 테이블을 참조할것
    c_user varchar2(20 char)not null,
    c_contents varchar2(1000 char)not null,
    c_date date not null,
    constraint fk_comment1 foreign key (c_c_no)
        references board(b_no)
        on delete cascade 
    
);
--drop table comment1 cascade constraint purge;
create sequence comment1_seq;
--drop sequence comment1_seq; 
--3.게시판 테이블이 값 2개를 생성하고, 각 게시판마다 댓글을 2개씩 생성
--[조건 : 작성시간에 대한 값은 현재 날짜/시간으로 통일]
insert into board values(board_seq.nextval, '홍길동', '안녕하세요', sysdate);
insert into board  values(board_seq.nextval, '김길동','안녕하세요', sysdate);
insert into comment1 values(comment1_seq.nextval, 1,'박길동', '안녕하세요', sysdate);
insert into comment1 values(comment1_seq.nextval, 2, '고길동', '안녕하세요', sysdate);
