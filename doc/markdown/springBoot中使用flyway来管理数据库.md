#  springboot中使用flyway管理数据库版本  

` flyway是个开源数据库版本控制器，主要提供migrate、clean、info、validate,baseline、repair等命令。它支持SQL(PL/SQL,T-SQL)方式和java方式，支持命令行客户端，还提供一系列的插件支持；`

 - 在pom.xml中增加flyway的依赖：
 ```java
    <dependency>
	    <groupId>org.flywaydb</groupId>
	    <artifactId>flyway-core</artifactId>
	    <version>5.0.3</version>
    </dependency>
 ```  
 - 按照flyway的规范创建版本化的sql脚本  
   - 在工程的 src/main/resources 目录下创建db目录  
   - 在db目录下创建版本化的sql脚本 V1__Base_version.sql
   - 在application.properties文件中配置Flyway要加载的sql脚本设置。
        ` flyway.locations=classpath:/db `
   - 写单元测试  
   