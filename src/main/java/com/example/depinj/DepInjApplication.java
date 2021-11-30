package com.example.depinj;

import com.example.depinj.controller.ConstructorInjectedOutputController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepInjApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DepInjApplication.class, args);

        /*
        FieldInjectedOutputController fieldInjectedOutputController = (FieldInjectedOutputController)context.getBean("fieldInjectedOutputController");
        String fieldResult = fieldInjectedOutputController.doOutput();
        System.out.println(fieldResult);
        */

        /*
        SetterInjectedOutputController setterInjectedOutputController = (SetterInjectedOutputController) context.getBean("setterInjectedOutputController");
        String setterResult = setterInjectedOutputController.doOutput();
        System.out.println(setterResult);
         */

        ConstructorInjectedOutputController constructorInjectedOutputController = (ConstructorInjectedOutputController)  context.getBean("constructorInjectedOutputController");
        String constructorResult = constructorInjectedOutputController.doOutput();
        System.out.println(constructorResult);
    }
}


