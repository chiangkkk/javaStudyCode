package org.chiangkai.designPartner;



public class Srp {

}

/**
 * 一个不符合单一职责原则的例子
 */
class People{



    public void work(){
        System.out.println("i can work");
    }

    public void code(){
        System.out.println("i can code");
    }
}

/**
 * 单一职责原则
 */
class Worker{
    public void work(){
        System.out.println("i can work");
    }
}

@SuppressWarnings("ALL")
class Coder{
    public void code(){
        System.out.println("i can coding");
    }
}
interface Device{
    String getType();
}
interface SmartDevice extends Device{
    String getMerory();
}

class Phone implements SmartDevice{
    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getMerory() {
        return null;
    }
}