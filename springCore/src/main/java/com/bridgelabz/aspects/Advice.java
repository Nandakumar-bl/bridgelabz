package com.bridgelabz.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Advice 
{

@AfterReturning(pointcut="(args(name))")
public void advice1(String name)
{
	System.out.println(name+"\n");
	System.out.println("The first advice has made\n");
}


@Pointcut("execution(* set*(..))")
public void Eng()
{}

@Around("Eng()")
public void advice2(ProceedingJoinPoint proceed)
{

	try {
		System.out.println("before running of method\n");
		System.out.println(proceed.proceed());
		System.out.println("\nAfter running of method\n");
	
		} 
	
	catch (Throwable e) {
		
		e.printStackTrace();
	}
}

@AfterReturning("within(com.bridgelabz.beans.Engine)")
public void within()
{
	System.out.println("inside within method\n");
}

@Before("@annotation(com.bridgelabz.annotations.annot)")
public void forannot()
{
	System.out.println("Using customised @@ annotation\n");
}

}