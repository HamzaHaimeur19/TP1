package Presentation;

import metier.InterfaceMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAnnotation {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("metier", "dao");
        //scanner les packages Dao et Metier

        InterfaceMetier metier = context.getBean(InterfaceMetier.class);

        System.out.println(metier.calculer());

    }
}
