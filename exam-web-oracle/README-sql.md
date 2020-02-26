---班级
##EXAM_CLASS
create table EXAM_CLASS
(
  class_id      NUMBER(10),
  class_name    VARCHAR2(100) not null,
  status       VARCHAR2(1),
  added_by     VARCHAR2(100),
  added_date   VARCHAR2(16),
  updated_by   VARCHAR2(100),
  updated_date VARCHAR2(16)
)

##EXAM_USER
create table EXAM_USER
(
  user_id      NUMBER(10),
  user_name    VARCHAR2(100) not null,
  user_type    NUMBER(10),
  status       VARCHAR2(1),
  added_by     VARCHAR2(100),
  added_date   VARCHAR2(16),
  updated_by   VARCHAR2(100),
  updated_date VARCHAR2(16)
)


  
  
  