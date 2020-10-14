package com.hmwang.jvm.day_001;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * 演示jdk1.8的方法区（元空间）内存溢出 -XX:MaxMetaspaceSize=8m java.lang.OutOfMemoryError: Metaspace
 */
public class Demo_06 extends ClassLoader{ //classLoader可以用来加载类的二进制字节码
    public static void main(String[] args) {
        int j = 0;
        Demo_06 demo = new Demo_06();
        try {
            for (int i = 0; i < 10000; i++ , j++) {
                ClassWriter cw = new ClassWriter(0);//生成类的二进制字节码
                // 版本号 ， 访问修饰符 ， 类名 ， 包名 ， 父类 ， 接口
                cw.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"Class"+i,null,"java/lang/Object",null);
                // 返回byte数组
                byte[] bytes = cw.toByteArray();
                // 执行了类的加载
                demo.defineClass("Class"+i,bytes,0,bytes.length);
            }
        }finally {
            System.out.println(j);
        }

    }
}
