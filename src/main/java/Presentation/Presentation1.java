package Presentation;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
       //instanciation statique
        MetierImpl metier = new MetierImpl();
        DaoImpl dao = new DaoImpl();

        metier.setDao(dao);

        System.out.println(metier.calculer());


    }
}