--1. ��Ʈ�Ͽ� ���� ���̺��� ����ǵ�
-- ��Ʈ���� �̸�, ����, cpu, RAM, HDD, �����Ⱓ �� �Ӽ����� ���� �ϰ����
-- ���ǿ� �����ϴ� ���̺��� �ۼ��ϴ� ������ �ۼ��� �ּ���
-- [�ϳ��� �⺻Ű(PK)�� ������ �ϰ�, ��� ���� ä���־���Ѵ�
create table notebook(
    n_name varchar2(40 char)primary key,
    n_price number(7) not null,
    n_cpu varchar2(10 char) not null,
    n_ram number(2) not null,
    n_hdd number(4) not null,
    n_warranty date not null
    );     
--    drop table notebook cascade constraint purge;
    
--2. ��Ʈ���� ����� �������� 128GB¥�� RAM�� ����ϰԵǾ���
-- �� �� RAM �÷��� �뷮�� �����ϴ� ������ �ۼ�
    alter table notebook modify n_ram number(3);
--3. ��Ʈ���� ũ��(��ġ)�� ���� �÷��� �߰��ϴ� ������ �ۼ�
--[������ cm�̸�, �Ҽ��� �ι�° �ڸ����� ��Ÿ��]
--[�� ���� �� ������ ���� �� ����]    
    alter table notebook add n_inch number(4,2) not null;
--4. ��Ʈ�Ͽ��� ������ HDD��� SSD�� ������
--HDD�÷��� �̸��� SSD�� ���� �̸����� �����ϴ� ������ �ۼ�    
    alter table notebook rename column n_hdd to n_ssd;
--5.�����Ⱓ �÷��� �����ϴ� ������ �ۼ�
    alter table notebook drop column n_warranty;

--6.��Ʈ���� ���ݿ� ���� ���� [800000~2300000]�����ǰ��� ���� �ְԲ�
--�ش� �÷��� �����ϴ� ������ �ۼ�
--   alter table notebook modify n_price number(7)
--    constraint n_check check (n_price between 800000 and 2300000);
  
  alter table notebook modify n_price number(7)
    check (n_price between 800000 and 2300000);

--
--7.���� ���̺��� ������ �����ϴ� ������ �ۼ�    
    drop table notebook cascade constraint purge;
    
    
    
    
    
    