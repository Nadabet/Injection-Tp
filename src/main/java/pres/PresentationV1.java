package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class PresentationV1 {public static void main(String[] args) {
    // Instanciation et injection des dépendances
    IDao dao = new DaoImpl(); // ou new DaoImplV2()
    MetierImpl metier = new MetierImpl();
    metier.setDao(dao);

    // Test
    System.out.println("Résultat : " + metier.calcul());
}
}
