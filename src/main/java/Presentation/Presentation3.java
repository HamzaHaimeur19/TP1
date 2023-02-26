package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation3 {

    public static void main(String[] args) {
        //version xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = (IMetier) applicationContext.getBean("metier");

        System.out.println(metier.calculer());

    }
}
