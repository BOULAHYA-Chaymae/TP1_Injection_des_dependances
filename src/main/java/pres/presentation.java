package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class presentation {
    public presentation() {
    }

    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Le resultat est " + metier.calcul());
    }
}