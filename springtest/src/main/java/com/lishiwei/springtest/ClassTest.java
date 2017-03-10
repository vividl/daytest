package com.lishiwei.springtest;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lishiwei on 17-2-8.
 */
public class ClassTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
        try {
            Class<?> clazz = loader.loadClass("com.lishiwei.springtest.Car");
            Constructor<?> constructor = clazz.getConstructor(String.class, String.class, int.class);
            Car car = (Car) constructor.newInstance("infinity", "black", 100);
            System.out.println("aa" +car.getClass());

//            Object car = constructor.newInstance("ford", "white", 100);
            Method setBrand = clazz.getMethod("setBrand", String.class);
            setBrand.invoke(car, "infinity2");

            Field brand = clazz.getDeclaredField("brand");
            brand.set(car, "infinity3");
            Package aPackage = clazz.getPackage();
            System.out.println(aPackage.getName());
            System.out.println(car.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
