package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MetierImpl implements InterfaceMetier {

    // injection de dependance
    // couplage faible (entre classe MetierImpl et DaoImpl via l'interface IDao)
    // injection de dependances via Autowired

    private final IDao dao;

    @Autowired
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculer() {
        double nb = dao.getValue();

        double r = nb * 8;

        return r;

    }

    //setter pour initialiser l'object dao
   /* public void setDao(IDao dao) {
        this.dao = dao;
    }*/
}
