package org.chiangkai.thread;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class MyCallableTest {
    @Test
    @SneakyThrows
    public void r(){
        MyCallable myCallable = new MyCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> submit = executorService.submit(myCallable);
        submit.get(5L, TimeUnit.SECONDS);
        System.out.println(999);
    }

}