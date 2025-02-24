package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // Injection de dépendance

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp * 23; // Traitement métier
    }

    // Setter pour l'injection de dépendance
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
