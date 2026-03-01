package net.mahboub.metier;

import net.mahboub.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage Faible

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.random() / Math.PI;
        return res;
    }

    /**
     * Pour injecter dans l'attribut dao un objet d'une classe
     * qui implemente l'interface IDao au moment de l'instanciation
     * Plus preferable que setDao
     */

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    /**
     * Pour injecter dans l'attribut dao un objet d'une classe
     * qui implemente l'interface IDao
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
