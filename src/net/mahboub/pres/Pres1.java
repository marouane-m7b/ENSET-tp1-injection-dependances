package net.mahboub.pres;

import net.mahboub.dao.DaoImpl;
import net.mahboub.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println(metier.calcul());
    }
}
