package net.mahboub.pres;

import net.mahboub.dao.DaoImpl;
import net.mahboub.ext.DaoImplV2;
import net.mahboub.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println(metier.calcul());
    }
}
