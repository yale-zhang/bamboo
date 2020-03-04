#  springboot中使用redis数据库  
` redis 是一个开源的使用ANSI C语言编写,支持网络、可基于内存亦可持久化的日志型、key-value数据库` 
 1. 引入依赖  
    spingboot提供的数据访问框架spring data redis基于jedis。可以通过引入spring-boot-starter-redis来配置依赖关系。  
 2. 参数配置  
    在application.properties中加入redis服务端的相关配置：
     ```xml 
        # REDIS(redisproperties)
        #redis 数据库索引(默认为0)
        spring.redis.database = 0
        #redis 服务器地址
        spring.redis.host=localhost
        #redis 服务器端口
        spring.redis.port=6379
        #redis 服务器连接密码(默认为空)
        spring.redis.password=
        #连接池最大连接数(使用负值表示没有限制)
        spring.redis.pool.max-active=8
        #连接池最大阻塞等待时间(~)
        spring.redis.pool.max-wait=-1
        #连接池最大空闲连接
        spring.redis.pool.max-idle=8
        #连接池最小空闲连接
        spring.redis.pool.min-idle=0
        #连接超时时间(毫秒)
        spring.redis.timeout=0
     ```  
     其中 spring.redis.database 的配置通常使用0即可，在redis配置的时候可以设置数据库数量，默认为16，可以理解为数据库的schema  

 3. 测试访问  
      通过编写测试用例，举例说明如何访问redis
        