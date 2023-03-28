package com.example.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class CommentAspect {

    @Before("execution(* com.example.springaop.service.impl.CommentServiceImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
       System.out.println("Before Methodu : " + joinPoint.getSignature().getName());

    }

    @After("execution(* com.example.springaop.service.CommentService.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("After Methodu : " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.example.springaop.service.CommentService.*(..))",returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + " Metodu cagirildi ve " + result.toString() + " degeri ile tamamlandi.");
    }


    @AfterThrowing(pointcut = "execution(* com.example.springaop.service.CommentService.*(..))", throwing = "exception")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception exception) {
        System.err.println(joinPoint.getSignature().getName() + " Metodu sirasinda bir hata olustu : " + exception.getMessage());
    }


}
