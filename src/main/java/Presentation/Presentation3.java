package Presentation;

import metier.InterfaceMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation3 {

    public static void main(String[] args) {
        //version xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        InterfaceMetier metier = applicationContext.getBean(InterfaceMetier.class);

        System.out.println(metier.calculer());
    }
}