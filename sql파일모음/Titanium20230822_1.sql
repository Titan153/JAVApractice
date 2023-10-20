--������Ʈ���� �Խ��ǿ� ���� ���̺�� �̸� [�����ϴ�]�Խ��� ��� ���̺��� ������� �մϴ�.
--�Խ��� ���̺��� ������ [�ۼ���/�Խ��� �� ����/ �ۼ��ð�] �� ���� �κ��� �־����� ���ڰ�
--��� ���̺��� [�ۼ��� /��۳���/ �ۼ��ð�]�� ���� �κ��� �־�����...

--1.���̺� ������ �ľ��ؼ� �Խ��� ���̺� �����
create table board (
    b_no number(4) primary key,
    b_owner varchar2(20 char)not null,--�ۼ��ڰ� ���� �ϳ��� �ø����� �ƴϴ� pk(x)
    b_txt varchar2(1000 char)not null,--�� ������ ������� �ߺ������� ��������,'��'�ϳ��� ���ִ� �Խñ��� �Խ��� ��ü�� ���� �ϳ��� ������?
    b_when date not null --Ȯ���� ����� ������, ���� �쿬�� ��ġ�� ���� �ð�/�� �뿡 �Խñ��� �ö� ���ɼ��� ����
);
--drop table board CASCADE CONSTRAINTS PURGE;
create sequence board_seq;
--drop SEQUENCE board_seq;

--2.���̺� ������ �ľ��ؼ� ��� ���̺� �����
--[���� : ���� �Ǵ� ���̺��� ������ �����Ǹ� �����ִ� ��۵� ����]
create table comment1(
    c_no number(4) primary key,
    c_c_no number(4) not null,--�Ҽӵ� �� ��ȣ/ �Խ��� ���̺��� �����Ұ�
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
--3.�Խ��� ���̺��� �� 2���� �����ϰ�, �� �Խ��Ǹ��� ����� 2���� ����
--[���� : �ۼ��ð��� ���� ���� ���� ��¥/�ð����� ����]
insert into board values(board_seq.nextval, 'ȫ�浿', '�ȳ��ϼ���', sysdate);
insert into board  values(board_seq.nextval, '��浿','�ȳ��ϼ���', sysdate);
insert into comment1 values(comment1_seq.nextval, 1,'�ڱ浿', '�ȳ��ϼ���', sysdate);
insert into comment1 values(comment1_seq.nextval, 2, '��浿', '�ȳ��ϼ���', sysdate);
