----相关的sql-----
1.用户表： exam_user
	user_id  用户id
	user_name 用户名称
	password 用户密码
	status 用户状态
	role_type 用户角色
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	user_menus  用户菜单；采用;拼接
	
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
  
-- Create/Recreate indexes 
create unique index PK_EXAM_USER on EXAM_USER (USER_ID);

	
2.系统菜单表： exam_menus  （题库管理，测试试卷管理）
	menu_id  菜单id
	menu_name 菜单名称
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	
	create table exam_menus (
		menu_id number(10),
		menu_name varchar2(100),
		added_by  varchar2(100),
		added_date  varchar2(100),
		updated_by  varchar2(100),
		updated_date  varchar2(100)
	);
  
-- Create/Recreate indexes 
create unique index PK_EXAM_MENUS on EXAM_MENUS (MENU_ID);


  系统菜单明细表： exam_menus_detail
	menu_detail_id 明细id
	menu_id  菜单id
	menu_detail_name 明细名称  （新建试卷、删除试卷、修改试卷、自动出题、copy试卷、导入、导出）
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	
	create table exam_menus_detail (
		menu_detail_id number(10),
		menu_id number(10),
		menu_detail_name varchar2(100),
		added_by  varchar2(100),
		added_date  varchar2(100),
		updated_by  varchar2(100),
		updated_date  varchar2(100)
	);
  
-- Create/Recreate indexes 
create unique index PK_EXAM_MENUS_DETAIL on EXAM_MENUS_DETAIL (MENU_DETAIL_ID);


3.题库表： exam_title
	title_id  考题id
	title_name 考题名称
	title_type 考题类型（1:填空题、2单选题、3多选题、4判断题、填表题、图片题、视频题、3D展示题）
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	title_level 考试难度
	tilte_chapter 考题章节
	tilte_knowledge 考题知识点

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
		tilte_knowledge  varchar2(100)
	);
  
-- Create/Recreate indexes 
create unique index PK_EXAM_TITLE on EXAM_TITLE (TITLE_ID);



4.题库答案表： exam_results_details
	--result_id  答案id
	result_name 答案名称
	result_isTrue 是否为正确答案
	title_id 对应的题库
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	
----问题点：如果确保每次取题目是，答案的顺序是变化的
	解决方案：list集合插入随机数，然后获取随机数大的前几个


create table exam_results_details (
		--result_id number(10),
		result_name varchar2(2000),
		result_isTrue char(1),
		title_id number(10),
		added_by  varchar2(100),
		added_date  varchar2(100),
		updated_by  varchar2(100),
		updated_date  varchar2(100)
	);
  
4.考试记录表：exam_test_history
	test_id 考试记录id
	test_name  考试记录的名称
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	test_userId 考试人id
	test_userName 考试人姓名
--	test_title_ids 考题id:用,拼接
--	test_title_results 考题的答案
--	test_user_results  考试给出的答案
	test_user_scores 考试成绩
	
	create table exam_test_history (
		test_id  varchar2(100),
		test_name  varchar2(100),
		added_by  varchar2(100),
		added_date  varchar2(100),
		updated_by  varchar2(100),
		updated_date  varchar2(100),
		test_userId  varchar2(100),
		test_userName  varchar2(100),
		test_user_scores  varchar2(100),
	);
  
-- Create/Recreate indexes 
create unique index PK_EXAM_TEST_HISTORY on EXAM_TEST_HISTORY (TEST_ID);


   答题明细表：exam_test_history_detail	
	test_id 考试记录id
	test_userId 考试人id
	test_userName 考试人姓名
	test_title_id 考题id
	test_title_userResult 用户答案
	test_title_checkResult 标准答案
	test_userScore 该题目得分
	added_by 添加人
	added_date  添加时间
	updated_by  修改人
	updated_date 修改时间
	sortID  序列号
	test_user_score 用户得分

create table 答题明细表：exam_test_history_detail (
		test_id  varchar2(100),
		test_name  varchar2(100),
		test_userId  number(10),
		test_userName  varchar2(100),
		test_title_id varchar2(100),
		test_title_userResult	varchar2(100),
		test_title_checkResult varchar2(100),
		test_userScore varchar2(100),
		added_by  varchar2(100),
		added_date  varchar2(100),
		updated_by  varchar2(100),
		updated_date  varchar2(100),
		sortID  varchar2(100)
	);
  

