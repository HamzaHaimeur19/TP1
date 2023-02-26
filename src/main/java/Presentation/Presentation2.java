package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) {
        //instanciation dynamique à l'aide de lecture d'un fichier config.txt
        try {
            Scanner scanner = new Scanner(new File("config"));

            String daoClassName = scanner.next(); // lire la ligne content la classe DaoImpl
            Class cDao = Class.forName(daoClassName); // definir la classe
            IDao dao = (IDao) cDao.newInstance(); // instancier objet dao equivalent de Idao dao = new Idao();

            String metierClassName = scanner.next(); // lire la ligne content la classe MetierImpl
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance(); // instancier objet metier equivalent de IMetier metier = new IMetier();

            Method method = cMetier.getMethod("setDao", IDao.class); // methode setDao de la classe IDao dans la classe cMetier

            method.invoke(metier, dao); // invoquer la methode setDao de l'instance metier sur objet dao

            System.out.println(metier.calculer());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
