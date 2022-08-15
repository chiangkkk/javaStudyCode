package org.chiangkai.thread;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author ChiangKai
 * @date 2022/8/15 14:56
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int a =1;
        while (true) {

            System.out.println(a);
            a++;
            Thread.sleep(1000);
            if (a > 10){
                break;
            }
        }
        return new Random().nextInt();
    }
}
