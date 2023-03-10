package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        System.out.println("version bd");
        return 8;
    }
}
