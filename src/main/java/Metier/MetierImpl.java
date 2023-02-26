package Metier;

import Dao.IDao;

public class MetierImpl implements IMetier {

    // injection de dependance
    // couplage faible (entre classe MerierImpl et DaoImpl via l'interface IDao)
    private IDao dao;
    @Override
    public double calculer() {
        double nb = dao.getValue();

        double r = nb* 8;

        return r;

    }

    //setter pour initialiser l'object dao
   public void setDao(IDao dao){
        this.dao = dao;
   }
}
