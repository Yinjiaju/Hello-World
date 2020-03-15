--exam_user
create table exam_user (
  user_id number(10),
  user_name varchar2(100),
  password varchar2(100),
  status varchar2(10),
  role_type varchar2(10),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  user_menus varchar2(2000)
);
/
declare
  iCnt number := 0;
begin 
  select count(1) into iCnt  from user_sequences where sequence_name = 'EXAM_USER_ID_SEQ';
  if iCnt = 1 then
  execute immediate 'drop sequence EXAM_USER_ID_SEQ';
  end if;
  execute immediate '
  create sequence EXAM_USER_ID_SEQ
  minvalue 1
  maxvalue 9999999999999999999999999999
  start with 1
  increment by 1
  nocache';
end;
/

--exam_menus  
create table exam_menus (
  menu_id number(10),
  menu_name varchar2(100),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  status varchar2(10)
);
/
declare
  iCnt number :=0;
begin 
  select count(1) into iCnt  from user_sequences where sequence_name = 'EXAM_MENU_ID_SEQ';
  if iCnt = 1 then
  execute immediate 'drop sequence EXAM_MENU_ID_SEQ';
  end if;
  execute immediate '
  create sequence EXAM_MENU_ID_SEQ
  minvalue 1
  maxvalue 9999999999999999999999999999
  start with 1
  increment by 1
  nocache';
end;
/
--exam_menus_detail
create table exam_menus_detail (
  menu_detail_id number(10),
  menu_id number(10),
  menu_detail_name varchar2(100),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  status varchar2(10)
);
/
declare
  iCnt number :=0;
begin 
  select count(1) into iCnt  from user_sequences where sequence_name = 'EXAM_MENU_DETAIL_ID_SEQ';
  if iCnt = 1 then
  execute immediate 'drop sequence EXAM_MENU_DETAIL_ID_SEQ';
  end if;
  execute immediate '
  create sequence EXAM_MENU_DETAIL_ID_SEQ
  minvalue 1
  maxvalue 9999999999999999999999999999
  start with 1
  increment by 1
  nocache';
end;
/
--exam_title
create table exam_title (
  title_id number(10),
  title_name varchar2(2000),
  title_type number(10),
  title_type_name varchar2(100),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  title_level  varchar2(100),
  tilte_chapter  varchar2(100),
  tilte_knowledge  varchar2(100),
  status varchar2(10)
);
/
declare
  iCnt number :=0;
begin 
  select count(1) into iCnt  from user_sequences where sequence_name = 'EXAM_TITLE_ID_SEQ';
  if iCnt = 1 then
  execute immediate 'drop sequence EXAM_TITLE_ID_SEQ';
  end if;
  execute immediate '
  create sequence EXAM_TITLE_ID_SEQ
  minvalue 1
  maxvalue 9999999999999999999999999999
  start with 1
  increment by 1
  nocache';
end;
/
--exam_results_details
create table exam_results_details (
  result_id varchar2(10),
  result_name varchar2(2000),
  result_isTrue char(1),
  title_id number(10),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  status varchar2(10)
);
/
--exam_test_history
create table exam_test_history (
  test_id  varchar2(100),
  test_name  varchar2(100),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  test_userId  number(10),
  test_userName  varchar2(100),
  test_user_scores  varchar2(100),
  status varchar2(10)
);
/
--exam_test_history_detail
create table exam_test_history_detail (
  test_detail_id varchar2(100),
  test_id  varchar2(100),
  test_name  varchar2(100),
  test_userId  number(10),
  test_userName  varchar2(100),
  test_title_id varchar2(100),
  test_title_userResult varchar2(100),
  test_title_checkResult varchar2(100),
  test_user_score varchar2(100),
  added_by  varchar2(100),
  added_date  varchar2(100),
  updated_by  varchar2(100),
  updated_date  varchar2(100),
  sortID  varchar2(100),
  status varchar2(10)
);
