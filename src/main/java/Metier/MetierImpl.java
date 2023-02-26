package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MetierImpl implements IMetier {

    // injection de dependance
    // couplage faible (entre classe MetierImpl et DaoImpl via l'interface IDao)
    @Autowired // injection de dependances via Autowired
    private IDao dao;

    @Override
    public double calculer() {
        double nb = dao.getValue();

        double r = nb * 8;

        return r;

    }

    //setter pour initialiser l'object dao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
