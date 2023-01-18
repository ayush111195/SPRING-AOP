package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;
import com.aop.services.PaymentServiceImpl;

public class App 
{
    private static Object bean;

	public static void main( String[] args )
    {
      
       ApplicationContext con =new ClassPathXmlApplicationContext("com/aop/config.xml");
         PaymentServiceImpl be = (PaymentServiceImpl) con.getBean("payment");
         be.makePayment();
    }
}
