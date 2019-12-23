####springboot自我整理
参照W3C文档

Application.java  --启动类

###sql
create table city (
	id number(10),
	province_id number(10),
	city_name varchar2(100),
	description varchar2(100)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
  
INSERT into city VALUES (1 ,1,'温岭市','BYSocket 的家在温岭。');  
  
-- Create/Recreate indexes 
create unique index SYS_COOO2 on city (id)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

##mercury_user
create table MERCURY_USER
(
  user_id      NUMBER(10),
  user_name    VARCHAR2(100) not null,
  status       VARCHAR2(1),
  is_admin     VARCHAR2(1),
  added_by     VARCHAR2(100),
  added_date   VARCHAR2(16),
  updated_by   VARCHAR2(100),
  updated_date VARCHAR2(16),
  name         VARCHAR2(100),
  password     VARCHAR2(1000)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Create/Recreate indexes 
create unique index SYS_COOO1 on MERCURY_USER (USER_ID)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

create unique index PK_USER_NAME on mercury_user (user_name)


create table MERCURY_USER_BAK
(
  user_id      NUMBER(10),
  user_name    VARCHAR2(100) not null,
  status       VARCHAR2(10),
  is_admin     VARCHAR2(10),
  added_by     VARCHAR2(100),
  added_date   VARCHAR2(16),
  updated_by   VARCHAR2(100),
  updated_date VARCHAR2(16),
  name         VARCHAR2(100),
  password     VARCHAR2(1000)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;



#菜单权限
create table MERCURY_ACTION
(
  action_id      NUMBER(10) ,
  component_id    NUMBER(10),
  component_name  VARCHAR2(100),
  display_name   varchar2(100)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Create/Recreate indexes 
create unique index SYS_COOO3 on MERCURY_ACTION (action_id)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;



----springboot相关
1.在application.properties中引入mybatis-config.xml
mybatis-config.xml是关于mybatis的相关配置，其中配置了插入null时不会引起mybatis报错
http://localhost:8888/mercuryUser/insert?userName=test&status=1&isAdmin=0

2.@Transaction
springboot默认设置了声明式事务管理，直接可以采用对应注解的方式.
可以增加下rollbackFor = { Exception.class }，不过记得得要抛出异常才能回滚

3.增加下log4j
a.pom.xml中引入log4j的jar包，同时要exclusions排除依赖spring-boot-starter-logging
b.直接在src目录下增加log4j相关的配置信息

4.引入jsp页面
a.pom.xml引入相关jar,jstl,spring-boot-starter-tomcat,tomcat-embed-jasper
b.application.properties中设置目录spring.mvc.view.prefix=/WEB-INF/jsp/；spring.mvc.view.suffix=.jsp;
同时在src/main/新建目录，webapp/WEB-INF/jsp
c.新建controller
@Controller  @Controller   @RequestMapping("/hello")
@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
无法返回jsp页面，或者html，返回的内容就是Return 里的内容

5.引用dubbo接口
注意点，调用dubbo时，对应的实体类对象需要序列化;需要引入相同的jar包
provider：
        <dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>0.2.0</version>
        </dependency>
	application.properties
		#当前服务/应用的名字
		dubbo.application.name=user-service-provider
		#注册中心的协议和地址
		dubbo.registry.protocol=zookeeper
		dubbo.registry.address=192.168.195.129:2181
		#通信规则（通信协议和接口）
		dubbo.protocol.name=dubbo
		dubbo.protocol.port=20880
		#连接监控中心
		#dubbo.monitor.protocol=registry
		#开启包扫描，可替代 @EnableDubbo 注解
		##dubbo.scan.base-packages=com.zang.gmall
		实现common里的接口，
		@Service   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
		@Component
		实现类
customer:
		<!-- dubbo -->
        <dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>0.2.0</version>
        </dependency>
	application.properties;
		###dubbo -customer
		dubbo.application.name=order-service-consumer
		dubbo.registry.address=zookeeper://192.168.195.129:2181
		#dubbo.monitor.protocol=registry  #dubbo-monitor安装、 监控中心

 	注意点：dubbo相关的注解
 	@service(version="111")
 	@Reference(version="111")


