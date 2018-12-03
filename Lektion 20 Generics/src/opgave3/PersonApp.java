package opgave3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PersonApp {

    public static void main(String[] args) {
        ArrayList<Person> ppl = new ArrayList<>();
        Person<Name> steffen = new Person<Name>(new Name("Steffen", "Rudkjoebing"));
        ppl.add(steffen);

        Person<String>  made = new Person<String>("Madeleine Harbom");
        ppl.add(made);

        Person<Name> per = new Person<>(new Name("Per", "Jernrod"));
        ppl.add(per);

        Person<String> john = new Person<>("John Donne");
        ppl.add(john);

        Person<Name> stine = new Person<>(new Name("Stine", "Klarasen"));
        ppl.add(stine);

        Person<Name> lara = new Person<>(new Name("Lara", "Croft"));
        ppl.add(lara);


        for (Person p : ppl) {
            System.out.println(p.toString());
        }

        Collections.sort(ppl);

        System.out.println("-------");
        for (Person p : ppl) {
            System.out.println(p.toString());
        }


    }


}

class Name {
    String fornavn;
    String efternavn;

    public Name(String f, String e) {
        fornavn = f;
        efternavn = e;
    }

    public String toString() {
        return "" + fornavn + " " + efternavn;
    }
}