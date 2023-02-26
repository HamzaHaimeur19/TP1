package Dao;

public class DaoImpl implements IDao {


    @Override
    public double getValue() {
        System.out.println("version bd");
        return 8;
    }
}
