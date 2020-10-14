package com.hmwang.jvm.day_001;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示堆内存溢出 -Xmx8m java.lang.OutOfMemoryError: Java heap space
 */
public class Dmeo_03 {
    public static void main(String[] args) {
        int count = 0;
        try {
            List<String> list = new ArrayList<>();
            String str = "hello";

            while (true){
                list.add(str);
                str = str + str;
                count++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(count);
        }

    }
}
