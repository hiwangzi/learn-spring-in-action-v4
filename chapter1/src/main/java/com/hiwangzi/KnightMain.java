package com.hiwangzi;

import com.hiwangzi.knight.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        runBaseOnXml();
        System.out.println("=== === ===");
        runBaseOnAnnotation();
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
}
