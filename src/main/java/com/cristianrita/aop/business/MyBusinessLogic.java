package com.cristianrita.aop.business;

import com.cristianrita.aop.LogMethodExecution;
import org.springframework.stereotype.Service;

@Service
public class MyBusinessLogic {

    public void doSomething() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void doSomethingElse() throws InterruptedException {
        Thread.sleep(5000);
    }
    @LogMethodExecution
    public int sum(int a, int b) {
        return a + b;
    }
}
