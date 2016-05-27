package br.com.aspcect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @After("@annotation(testAnnotation)")
    public void aud(JoinPoint joinPoint, TestAnnotation testAnnotation) {
        System.out.print("After: " + testAnnotation.value());
    }

}
