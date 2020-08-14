package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice{
	@Before("com.test.Demo.demo1())")
	public void mybefore() {
		System.out.println("前置");
	}
	@After("com.test.Demo.demo1())")
	public void myafter1() {
		System.out.println("后置1");
	}
	@AfterThrowing("com.test.Demo.demo1())")
	public void mythrow() {
		System.out.println("异常");
	}
	
	@Around("com.test.Demo.demo1())")
	public Object myarround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("环绕前置");
		Object proceed = p.proceed();
		System.out.println("环绕后置");
		return proceed;
		
	}

}
