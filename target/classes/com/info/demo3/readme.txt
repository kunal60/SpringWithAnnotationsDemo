https://www.javatpoint.com/spring-aop-aspectj-annotation-example

1) In demo3, we focused on Spring AOP
To create an aspect, you need to apply @Aspect annotation on your aspect class and register it
in applicationContext.xml file.  


applicationContext.xml
**********************
<!-- Enable support for AspectJ -->

	<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
	<bean id="empservimpl" class="com.info.demo3.EmployeeServiceImpl">
</bean>
	<bean id="empaspect" class="com.info.demo3.EmployeeAspect"></bean>

	
POM.xml
*******
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aspects</artifactId>
    <version>5.0.4.RELEASE</version>
</dependency>

OR
	
POM.xml
*******
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.8.13</version>
</dependency> 

<!-- https://mvnrepository.com/artifact/aspectj/aspectjrt -->
<dependency>
    <groupId>aspectj</groupId>
    <artifactId>aspectjrt</artifactId>
    <version>1.5.4</version>
</dependency> 

	