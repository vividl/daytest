package com.lishiwei.springtest;

import java.io.Serializable;

/**
 * Created by lishiwei on 17-2-23.
 */
public class A implements Serializable {
    private final int num;

    public A(int num) {
        System.out.println("Hello");
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
