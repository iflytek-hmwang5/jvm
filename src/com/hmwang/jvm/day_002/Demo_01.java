package com.hmwang.jvm.day_002;

/**
 * 演示运行时常量池和StringTable的关系
 * StringTable["a","b","ab"] hashTable 不能扩容
 */
public class Demo_01 {
    //常量池中的信息在运行时会被加载到运行时常量池中，这是 a b ab都只是运行时常量池中的符号，还没有变成java的String对象
    //ldc #2 会把符号a 变成"a"字符串对象，并放入串池中
    //ldc #3 会把符号b 变成"b"字符串对象，并放入串池中
    //ldc #4 会把符号ab 变成"ab"字符串对象，并放入串池中
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2; // new StringBuilder().append(s1).append(s2).toString() new String("ab")
        String s5 = "a" + "b";// javac 编译期优化，因为"a","b" 是确定的值，所以直接优化成"ab"
        System.out.println(s3 == s4);// false 因为s3指向串池中的"ab" , 而s4是new出来的String对象，存在于堆中
        System.out.println(s3 == s5);// true 因为编译期间优化
    }
}
