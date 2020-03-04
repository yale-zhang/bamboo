# 对于xml请求要如何快速的在controller中包装成对象，以及如何以xml的格式返回一个对象呢？  

实现原理：消息转换器 Message Converter
    springboot中处理http请求的实现是采用spring MVC，其中通过消息转化器负责处理不同格式的请求数据并包装成对象。  
在springmvc中定义了HttpMessageConverter接口，抽象了消息转换器对类型的判断，对读写的判断和操作。

http请求的Content-Type有各种不同的格式定义，如果要支持xml格式的消息转换，就必须要使用对应的转换器。**springmvc中默认采用jackson实现转换器MappingJackson2XmlHttpMessageConverter.**  

##  扩展实现
 1. 引入xml消息转换器  
 2. 定义xml与定义对象的关系  
 3. 创建接收xml请求的接口  
