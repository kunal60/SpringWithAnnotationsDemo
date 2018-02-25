https://www.programcreek.com/2014/01/spring-helloworld-example-using-eclipse-and-maven/

1) In demo1, we focuses on Autowired and Component Annotation and creating 
Application Context through applicationContext.xml


Annotations Learned - 	@Autowired,@Component



applicationContext.xml
**********************

<!-- Autowiring by Name -->

	<context:annotation-config></context:annotation-config>
	<!--demo1 -->
	<bean id="helloWorldService" class="com.info.demo1.HelloWorldService">
		<property name="name" value="Program Creek Readers" />
	</bean>


	<bean id="hello" class="com.info.demo1.Hello">
	</bean>
	
	
POM.xml
*******
<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>	


	