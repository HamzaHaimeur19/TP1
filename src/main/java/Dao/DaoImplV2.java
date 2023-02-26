package Dao;


import org.springframework.stereotype.Component;

@Component
public class DaoImplV2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("version webservices");
        return 10;
    }
}
