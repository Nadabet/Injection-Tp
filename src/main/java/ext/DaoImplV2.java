package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Vesion web service");
        double temp = 11;
        return temp;
    }
}
