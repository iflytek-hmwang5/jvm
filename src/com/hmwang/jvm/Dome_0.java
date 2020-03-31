package com.hmwang.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作jvirsualvm示例
 * 堆内存溢出
 */
public class Dome_0 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < 200; i++) {
            studentList.add(new Student());
        }
        try {
            Thread.sleep(1000000000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Student{
    private byte[] big = new byte[1024*1024];
}


