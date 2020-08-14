package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
//		七. 使用注解(基于Aspect)
//		1. spring 不会自动去寻找注解,必须告诉spring 哪些包下的类中可能有注解
//			1.1 引入xmlns:context
//		2. @Component
//			2.1 相当于<bean/>
//			2.2 如果没有参数,默认对象名称是把类名首字母变小写,相当于<bean id=””/>
//			2.3 @Component(“自定义对象的名称”)
//		3. 实现步骤:
//			3.1 在spring 配置文件中设置注解在哪些包中
//			3.2 在Demo 类中添加@Componet
//				3.2.1 在方法上添加@Pointcut(“”) 定义切点
//			3.3 在通知类中配置
//				3.3.1 @Component 类被spring 管理
//				3.3.2 @Aspect 相当于<aop:aspect/>表示通知方法在当前类中
		
//		七. Spring 中常用注解.
//		1. @Component 创建类对象,相当于配置<bean/>
//		2. @Service 与@Component 功能相同.
//			2.1 写在ServiceImpl 类上.
//		3. @Repository 与@Component 功能相同.
//			3.1 写在数据访问层类上.
//		4. @Controller 与@Component 功能相同.
//			4.1 写在控制器类上.
//		5. @Resource(不需要写对象的get/set)
//		5.1 java 中的注解
//		5.2 默认按照byName 注入,如果没有名称对象,按照byType 注入
//		5.2.1 建议把对象名称和spring 容器中对象名相同
//		6. @Autowired(不需要写对象的get/set)
//		6.1 spring 的注解
//		6.2 默认按照byType 注入.
//		7. @Value() 获取properties 文件中内容
//		8. @Pointcut() 定义切点
//		9. @Aspect() 定义切面类
//		10. @Before() 前置通知
//		11. @After 后置通知
//		12. @AfterReturning 后置通知,必须切点正确执行
//		13. @AfterThrowing 异常通知
//		14. @Arround 环绕通知
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		 for (int i = 0; i < beanDefinitionNames.length; i++) {
			 System.out.println(beanDefinitionNames[i]);
		}
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Demo demo = ac.getBean("demo123",Demo.class);
		try {
			demo.demo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
