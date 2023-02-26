package Dao;

import org.springframework.stereotype.Component;

@Component //version annotation de spring
public class DaoImpl implements IDao {


    @Override
    public double getValue() {
        System.out.println("version bd");
        return 8;
    }
}
