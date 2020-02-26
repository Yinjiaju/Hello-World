###注意点
oracle相关jar包没法通过mvn仓库下载，需要自己下载jar后，执行
eg：将下载好的ojdbc6.jar放在D盘：cmd命令先切换到D：
执行：mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar -Dfile=ojdbc6.jar


springboot不引入db时，需要配置信息
spring boot会默认加载org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration类使用了@Configuration注解向spring注入了dataSource bean,因为工程中没有关于dataSource相关的配置信息，当spring创建dataSource bean因缺少相关的信息就会报错

因此我们需要在Application类上面增加注解
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})