package com.hmwang.jvm.day_001;

/**
 * 演示栈帧
 */
public class Demo_01 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2(1,2);
    }

    private static int method2(int i, int i1) {
        int c = i + i1;
        return c;
    }
}
