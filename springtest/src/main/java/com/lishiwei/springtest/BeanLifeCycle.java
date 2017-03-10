package com.lishiwei.springtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * Created by lishiwei on 17-2-9.
 */
public class BeanLifeCycle {
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource resource = resourcePatternResolver.getResource("classpath:beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        ((ConfigurableBeanFactory) beanFactory).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car.toString());
        car.setColor("red");


        Car car1 = (Car) beanFactory.getBean("car");
        System.out.println("car==car1:" + (car == car1));

        ((ConfigurableBeanFactory) beanFactory).destroySingletons();
    }
}
