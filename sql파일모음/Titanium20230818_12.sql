create table person(
    p_name VARCHAR2(10 char),
    p_age number(3),
    p_gender VARCHAR2(2 char)
);

insert into person values('ȫ�浿', 10, '��');
insert into person values('ȫ�浿', 10, '��');
insert into person values('��浿', 30, '��');
insert into person values('�ֱ浿', 20, '��');

select*from person;

drop table person cascade constraint purge;

--���̺��� Ư¡
-- 1. �Ӽ��� ���� ���� ������
--      �� �Ӽ��� ���� �����ο� ���ǵ� ���� ������, �� ���� ��� ������ ���̾�� ��
--      p_age�� ���� ��� �ִ� 3�ڸ� ���� ���� ������, �� ���� �������� ���� �ƴ�
--      �� �ϳ��� ���̾���Ѵ�.
-- 2. �Ӽ��� ���� �ٸ� �̸��� ������
--      �� �Ӽ����� p_name, p_age, p_gender ��� �̸��� ������ ����
--      =>�̸��� �ߺ��ؼ� ������ �ʱ�!!!
--      ex)�÷��� �ߺ����� !!
--create table test(
--    t_no number(3),
--    t_no varchar2(10 char)
--    );
-- 3. �� �Ӽ��� ���� ��� ���� ������ ���� ������
-- => 1���̶� ���� �ƶ�(p_age)

-- 4. �Ӽ��� ������ �������.
--      �Ӽ��� ������ �޶� ���̺��� ��Ű���� ����
--  ex)
select*from person;
select p_age, p_gernder, p_name from person;
-- ������ �ٲ���� ���뿡�� ��ȭ�� ����

-- 5.���̺� ���� �ߺ��� Ʃ���� ������� �ʴ´�.
-- ȫ�浿�� ���� ������ �ѹ� �� ���ԵǸ� �����ι����� �ٸ��ι����� �˼��� ����
-- ��, ��� Ʃ�ÿ��� �������� �־���Ѵ�...(������ �߰��Ѵٰų�, �ڵ��� ��ȣ�� �߰��Ѵٰų�)

drop table person cascade constraint purge;