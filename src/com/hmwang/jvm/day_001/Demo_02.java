package com.hmwang.jvm.day_001;

/**
 * 栈帧过多导致栈内存溢出 -Xss256k java.lang.StackOverflowError
 */
public class Demo_02 {
    private static int count = 0;

    public static void main(String[] args) {
        try {
            method1();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println(count);
        }
    }

    private static void method1() throws Throwable {
        count++;
        method1();
    }
}
