https://www.boraji.com/spring-dependency-injection-example-with-annotation

1) In demo2, we focused on Interface and creating 
Application Context without using applicationContext.xml. We will be using annotaations 
for creating ApplicationContext
AppConfig.java


HiService ->Interface
GoodMorningService->Implementing HiService
GoodNightService->Implementing HiService

Hi-> Has Dependency of HiService


MainApp 

Annotations Learned - 	@Configuration,@ComponentScan,@Bean