package com.lishiwei.springtest;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by lishiwei on 17-2-23.
 */
public class AMain {
    public static void main(String[] args){
        Unsafe unsafe = getUnsafe();
        Class aClass = A.class;
        A a = null;
        //don't need new
        /*try {
            a = (A) unsafe.allocateInstance(aClass);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }*/
        a = new A(1);
        System.out.println(a.getNum());
    }

    public static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe)field.get(null);

        } catch (Exception e) {
        }
        return null;
    }
}
