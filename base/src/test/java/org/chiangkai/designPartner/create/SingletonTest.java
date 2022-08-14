package org.chiangkai.designPartner.create;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getSingleton(){
        Singleton singleton = Singleton.getSingleton();
        Singleton2 instance = Singleton2.getInstance();
    }

}