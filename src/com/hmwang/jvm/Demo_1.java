package com.hmwang.jvm;

/**
 * 演示栈内存溢出的情况 测试demo
 */
public class Demo_1 {

    private int count = 0;

    private void add(){
        count++;
        add();
    }

    public static void main(String[] args) throws Throwable{
        Demo_1 demo = new Demo_1();
        try {
            demo.add();
        }catch (Throwable e){
            System.out.println("stack length:" + demo.count);
            throw e;
        }
    }

}
