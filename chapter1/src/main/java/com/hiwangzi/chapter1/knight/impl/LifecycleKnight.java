package com.hiwangzi.chapter1.knight.impl;

import com.hiwangzi.chapter1.knight.Knight;
import com.hiwangzi.chapter1.quest.Quest;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/* 实际执行结果：
#3 BeanNameAware setBeanName(): knight
#4 BeanFactoryAware setBeanFactory(): class org.springframework.beans.factory.support.DefaultListableBeanFactory
#5 ApplicationContextAware setBeanFactory(): org.springframework.context.annotation.AnnotationConfigApplicationContext@401f7633
#8 InitializingBean afterPropertiesSet()
#9 LifecycleKnight initMethod()
Rescue damsel quest embarked
#13 DisposableBean destroy()
#14 LifecycleKnight destroyMethod()
*/
public class LifecycleKnight implements Knight,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        BeanPostProcessor, InitializingBean,
        DisposableBean {

    private Quest quest;

    public LifecycleKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    // step 3
    @Override
    public void setBeanName(String s) {
        System.out.println("#3 BeanNameAware setBeanName(): " + s);
    }

    // step 4
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#4 BeanFactoryAware setBeanFactory(): " + beanFactory.getClass());
    }

    // step 5
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#5 ApplicationContextAware setBeanFactory(): " + applicationContext.getDisplayName());
    }

    // step 6
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("#6 BeanPostProcessor postProcessBeforeInitialization(): " + bean.toString() + ", " + beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    // step 7
    @PostConstruct
    public void postConstruct() {
        System.out.println("#7 LifecycleKnight @postConstruct()");
    }

    // step 8
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#8 InitializingBean afterPropertiesSet()");
    }

    // step 9
    public void initMethod() {
        System.out.println("#9 LifecycleKnight initMethod()");
    }

    // step 10
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("#10 BeanPostProcessor postProcessAfterInitialization(): " + bean.toString() + ", " + beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    // step 12
    @PreDestroy
    public void preDestroy() {
        System.out.println("#12 LifecycleKnight @preDestroy()");
    }

    // step 13
    @Override
    public void destroy() throws Exception {
        System.out.println("#13 DisposableBean destroy()");
    }

    // step 14
    public void destroyMethod() {
        System.out.println("#14 LifecycleKnight destroyMethod()");
    }
}
