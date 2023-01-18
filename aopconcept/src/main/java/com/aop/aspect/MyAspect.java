package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void pay() {
		
		System.out.println("amout....a");
	}
}
