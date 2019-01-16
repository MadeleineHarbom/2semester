import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double getPris(List<Abonnement> list) {
        double pris = 0.0;
        for (Abonnement a : list) {
            pris += a.abopnentsPris();
        }
        return pris;
    }

    public static void main(String[] args) {
        List<Abonnement> aboneter = new ArrayList<>();
        Abonnement a1 = new Abonnement(70.0, 3.0);
        Abonnement a2 = new TimePakke(66.0, 2.0, 6);
        Abonnement a3 = new Udvidelsespakke(70.0, 3.5, 8, 20.0);
        aboneter.add(a1);
        aboneter.add(a2);
        aboneter.add(a3);
        System.out.println("ca 223: " + getPris(aboneter));



    }

}
