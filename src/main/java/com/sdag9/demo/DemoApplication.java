package com.sdag9.demo;

import com.sdag9.SchoolManager;
import com.sdag9.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.register(AppConfig.class);
        applicationContext.refresh();

        SchoolManager schoolManager = (SchoolManager) applicationContext.getBean("schoolManager");

        schoolManager.saveData();
    }
}
