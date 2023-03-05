package com.surya.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class DemoAspect {
	public void before(JoinPoint jp)
	{
		System.out.println("before==> method calling"+jp.getSignature().getName());
	}
	public void after(JoinPoint jp)
	{
		System.out.println("after==> method calling"+jp.getSignature().getName());
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println(" around====>before method calling with method name-->"+pjp.getSignature().getName());
		pjp.proceed();
		System.out.println("around====>after method calling with method name-->"+pjp.getSignature().getName());
	}
	public void afterThrowing(JoinPoint jp,Throwable throwable) throws Throwable
	{
		System.out.println("afterthrowing  ====>an exception has occured in method-->"+jp.getSignature().getName()+"and name of the exception is"+throwable.getMessage());
		
		
	}
	public void afterReturning(JoinPoint jp,Object result)
	{
		System.out.println("for method"+jp.getSignature().getName()+"result obj returned"+result);
	}


}
