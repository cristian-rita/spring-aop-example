package com.cristianrita.aop;


import com.cristianrita.aop.business.MyBusinessLogic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopApplication {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyBusinessLogic businessLogic = context.getBean(MyBusinessLogic.class);
        businessLogic.doSomething();
        businessLogic.doSomethingElse();
        businessLogic.sum(1, 2);
    }
}
