package opgave1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BilApp {

    public static void main(String[] args) {
        Set<Bil> bilset = new HashSet<>();
        Bil b1 = new Bil("AB12345", "Volkswagen", "Polo", "Blaa");
        Bil b2 = new Bil("ZX67892", "Volkswagen", "up!", "Hvid");
        Bil b3 = new Bil("TR74743", "Volkswagen", "Golf", "Gul");
        Bil b4 = new Bil("AB12345", "Volkswagen", "Polo", "Blaa");
        bilset.add(b1);
        bilset.add(b2);
        bilset.add(b3);
        bilset.add(b4);

        Iterator i = bilset.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }

    }

}
