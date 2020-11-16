package com.mxk.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

	// 第一个 * ：任意返回值的方法
	// .. ： mxk 包下的，包括子包下的
	// 第二个 * ：所有的类
	// .* ：类里面所有的方法
	// (..) ：传入任意多个参数或者没有参数
	@Pointcut("execution(* com.mxk..*.*(..))")
	public void embed(){}

	@Before("embed()")
	public void before(JoinPoint joinPoint){
		System.out.println("开始调用 :" + joinPoint);
	}

	@After("embed()")
	public void after(JoinPoint joinPoint){
		System.out.println("调用完成 :" + joinPoint);
	}

	@Around(value = "embed()")
	public Object around(JoinPoint joinPoint){
		long startTime = System.currentTimeMillis();
		Object returnValue = null;
		System.out.println("开始计时 :" + joinPoint);
		try {
			returnValue = ((ProceedingJoinPoint)joinPoint).proceed();
			System.out.println("执行成功，结束计时");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println("总耗时：[" + (endTime - startTime) + "]ms");
		}
		return returnValue;
	}

	@AfterReturning(pointcut = "embed()",returning = "returnValue")
	public void afterReturning(JoinPoint joinPoint,Object returnValue){
		System.out.println("无论是空还是有返回值都返回：" + joinPoint + ", 返回值：[" + returnValue + "]");
	}

	@AfterThrowing(pointcut = "embed()",throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint,Exception exception){
		System.out.println("抛出异常 ： " + exception.getMessage());
	}


}
