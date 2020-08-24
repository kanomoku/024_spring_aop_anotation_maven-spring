package com.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("demo123")
public class Demo {
	@Pointcut("execution(* com.test.Demo.demo1())")
	public void demo1() {
		System.out.println("demo1");
	}
	public void demo2() {
		System.out.println("demo2");
	}
	public void demo1(String name,int age) {
		System.out.println("demo1"+name+age);
	}
}
