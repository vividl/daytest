/*
package com.lishiwei.springtest;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

*/
/**
 * Created by lishiwei on 17-2-9.
 *//*

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcessorAdaptor.postProcessBeforeInstantiation(Class<?> class, String beanName)。");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcessorAdapter.postProcessAfterInstantiation(ObejectBean bean, String beanName)。");
        }
        return super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcessorAdaptor.postProcessPropertyValues(...)");
        }
        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = ((Car) bean);
            if (car.getColor() == null) {
                System.out.println("调用postProcessBeforeInitialization(Object bean, String beanName),color为空,设置为black。");
                car.setColor("black");
            }
        }
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getMaxSpeed() >= 200) {
                System.out.println("调用postProcessorAfterInitialization(Object bean, String beanName),最大速度大于200，设置为200。");
                car.setMaxSpeed(200);
            }
        }
        return super.postProcessAfterInitialization(bean, beanName);
    }
}
*/
