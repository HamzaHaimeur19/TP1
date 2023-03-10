package dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("version webservice");
        return 15;
    }
}
