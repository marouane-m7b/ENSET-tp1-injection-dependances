package net.mahboub.ext;

import net.mahboub.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version captures...");
        double t = 0.1;
        return t;
    }
}
