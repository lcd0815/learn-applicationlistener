# learn-applicationlistener
spring-observermodel-helloworld-demo

1，项目正常的bean、controller、service，

2，额外添加listener和event类

3，其中event类要extends ApplicationEvent，并且在构造器中绑定并添加了bean，并添加get方法

4，其中listener类要在类上@Component，

5，添加register方法，方法上@EventListener，传入event，并通过event得到bean，处理bean

6，service层@Autowired applicationContext，并且applicationContext.publishEvent(new UserRegisterEvent(this,user));
