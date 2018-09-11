# Spring Boot practice

1 集成JSP 
* 创建jsp目录
* application.properties配置jsp信息
* pom.xml添加依赖组件  
    在pom.xml需要添加3个组件：
    * spring-boot-starter-web(用于运行web项目)
    * jstl（JavaServer Pages Standard Tag Library，JSP标准标签库，用于程序中解析JSP）
    * tomcat-embed-jasper （内置tocat对Jsp支持的依赖，用于编译Jsp）
* 编写SpringMVC代码

*scope（作用域）值列表代表含义解释如下:   
    compile：默认值 他表示被依赖项目需要参与当前项目的编译，还有后续的测试，运行周期也参与其中，是一个比较强的依赖。打包的时候通常需要包含进去
    test：依赖项目仅仅参与测试相关的工作，包括测试代码的编译和执行，不会被打包，例如：junit
    runtime：表示被依赖项目无需参与项目的编译，不过后期的测试和运行周期需要其参与。与compile相比，跳过了编译而已。例如JDBC驱动，适用运行和测试阶段
    provided：打包不会包含进去，别的设施会提供。事实上该依赖理论上可以参与编译，测试，运行等周期。相当于compile，但是打包阶段做了exclude操作
    system：从参与度来说，和provided相同，不过被依赖项不会从maven仓库下载，而是从本地文件系统拿。需要添加systemPath的属性来定义路径*

2,Spring MVC注解解读  
    *@Controller 标识在一个类上，标识的类就是Spring MVC的控制器类，分发处理器会扫描使用了该注解的类是否使用了@RequestMapping 注解，@Controller只是定义了一个控制器类，只用使用了@RequestMapping 注解，才是真正处理请求的处理器；
    @RequestMapping 标识在类或者方法上，用来处理请求地址的注解，一共有6个属性：
        value 对应请求的实际地址
        method 请求的类型:get、post、put、delete 等，ex:@RequestMapping(value = "/test", method = RequestMethod.PUT)
        consumes 指定请求上的内容类型，比如application/json、text/html等
        produces 指定返回的数据类型，类型必须是Request Headers中accept包含的类型
        params 过滤请求，只有请求中包含某个参数，才会执行，比如@RequestMapping(value = "",params = "flag")，只有参数中包含flag才会执行，不然不能访问，http://localhost:8080/cat?true=flag这个地址是访问不到的，正确的地址是http://localhost:8080/cat?flag=true才可以正常访问
        headers 和params类似，只有请求headers里面包含某个key才可以访问方法*

  

3,生产环境部署    

*  下载安装Tomcat
*  入口类继承SpringBootServletInitializer重写configure方法
*  配置pom.xml
*  IDEA生成war文件
*  配置Tomcat运行项目
