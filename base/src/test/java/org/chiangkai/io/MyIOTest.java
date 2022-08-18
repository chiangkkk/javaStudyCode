package org.chiangkai.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class MyIOTest {
    @Test
    public void testWrite(){
        MyIO myIO = new MyIO();
        myIO.transStream();

    }
    @Test
    public void t1(){
        log.info("{}",System.getProperties());
    }

}