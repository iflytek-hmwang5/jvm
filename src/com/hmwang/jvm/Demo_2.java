package com.hmwang.jvm;

/**
 * 单例模式
 */
public class Demo_2 {
    public static void main(String[] args) {
        System.out.println(Sington.getInstance());
        System.out.println(Sington.getInstance());
    }

}

class Sington{

    private Sington(){};
    private static class LazyHolder{
        static final Sington sington = new Sington();
    }

    public static Sington getInstance(){
        return LazyHolder.sington;
    }

}