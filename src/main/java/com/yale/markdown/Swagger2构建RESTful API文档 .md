##Swagger2构建RESTful API文档   
1.添加Swagger2依赖  
2.创建Swagger2配置类 [Swagger2]    
  通过@Configuration注解，让Spring来加载该类配置。再通过@EnableSwagger2注解来启用Swagger2。  
  再通过createRestApi函数创建Docket的Bean之后，apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。
  select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，
  并产生文档内容（除了被@ApiIgnore指定的请求）。  
  
3.添加文档内容  
    通过@ApiOperation注解来给API增加说明、通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明。  

4.API文档访问与调试  
    http://localhost:8080/swagger-ui.html
    
[SpringBoot 使用Swagger2打造在线接口文档（附汉化教程）](https://www.jianshu.com/p/7e543f0f0bd8)
 