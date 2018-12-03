##Thymeleaf模板引擎

Thymeleaf是一个XML/XHTML/HTML5模板引擎  

Thymeleaf的默认参数配置
如有需要修改默认配置的时候，只需复制下面要修改的属性到application.properties中，并修改成需要的值，如修改模板文件的扩展名，修改默认的模板路径等。  
```
 # Enable template caching.
 spring.thymeleaf.cache=true 
 # Check that the templates location exists.
 spring.thymeleaf.check-template-location=true 
 # Content-Type value.
 spring.thymeleaf.content-type=text/html 
 # Enable MVC Thymeleaf view resolution.
 spring.thymeleaf.enabled=true 
 # Template encoding.
 spring.thymeleaf.encoding=UTF-8 
 # Comma-separated list of view names that should be excluded from resolution.
 spring.thymeleaf.excluded-view-names= 
 # Template mode to be applied to templates. See also StandardTemplateModeHandlers.
 spring.thymeleaf.mode=HTML5 
 # Prefix that gets prepended to view names when building a URL.
 spring.thymeleaf.prefix=classpath:/templates/ 
 # Suffix that gets appended to view names when building a URL.
 spring.thymeleaf.suffix=.html  spring.thymeleaf.template-resolver-order= 
 # Order of the template resolver in the chain. spring.thymeleaf.view-names= 
 # Comma-separated list of view names that can be resolved.
```