package com.hmwang.jvm;

public class Demo_3 {
    int num = 0;
    boolean ready = false;
    public void actor1(I_Result r) {
        if(ready) {
            r.r1 = num + num;
        }
        else {
            r.r1 = 1;
        }
    }
    public void actor2(I_Result r){
        num = 2;
        ready = true;
    }
}

class I_Result{
    int r1 = 0;

}
