package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation3Annotaion {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("Dao", "Metier");
        //scanner les packages Dao et Metier

        IMetier metier = applicationContext.getBean(IMetier.class);

        System.out.println(metier.calculer());

    }
}
