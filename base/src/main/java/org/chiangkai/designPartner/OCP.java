package org.chiangkai.designPartner;


/**
 * 开闭原则
 * 对扩展开发 对修改关闭
 */
public class OCP {

    abstract class Coder{
        abstract void coding();

        class PHPER extends Coder   {

            @Override
            void coding() {
                System.out.println("PHP is a the best program");
            }
        }
    }
}

