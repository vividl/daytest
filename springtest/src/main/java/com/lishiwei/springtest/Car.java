package com.lishiwei.springtest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by lishiwei on 17-2-8.
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String      brand;
    private String      color;
    private int         maxSpeed;
    private BeanFactory beanFactory;
    private String      beanName;

    public Car() {
        System.out.println("调用Car()构造函数。");
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("调用setColor()设置属性");
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        System.out.println("调用setSpeed()设置属性");
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", color='" + color + '\'' +
               ", maxSpeed=" + maxSpeed +
               '}';
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory(BeanFactory beanFactory)。");
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware.setBeanName(String name)。");
        this.beanName = s;
    }

    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy()。");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()。");
    }

    public void myInit() {
        System.out.println("调用init-method指定的myInit(),将maxSpeed值设置为240。");
        this.maxSpeed = 240;
    }

    public void myDestroy() {
        System.out.println("调用destroy-method指定的myDestory()。");
    }
}
