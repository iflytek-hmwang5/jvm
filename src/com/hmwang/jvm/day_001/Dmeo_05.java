package com.hmwang.jvm.day_001;

import java.util.ArrayList;
import java.util.List;

/**
 * 用jvisualvm 的dump 查看堆内存占用
 */
public class Dmeo_05 {
    public static void main(String[] args) throws InterruptedException {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(new Student());
        }
        Thread.sleep(100000000l);
    }
}

class Student{
    private byte[] bytes = new byte[1024*1024];
}
