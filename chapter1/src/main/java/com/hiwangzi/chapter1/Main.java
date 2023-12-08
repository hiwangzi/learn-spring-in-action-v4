package com.hiwangzi.chapter1;

import com.hiwangzi.chapter1.knight.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        runBaseOnXml();
        System.out.println("---------");
        runBaseOnAnnotation();
        System.out.println("---------");
        runToShowLifecycle();
    }

    private static void runBaseOnXml() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

    private static void runBaseOnAnnotation() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

    private static void runToShowLifecycle() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LifecycleKnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
