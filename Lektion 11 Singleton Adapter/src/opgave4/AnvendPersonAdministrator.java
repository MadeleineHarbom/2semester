package opgave4;

import java.util.Set;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {
        PersonAdministration pa = PersonAdministration.getPersonAdministration();
        Person p1 = new Person("Made");
        Person p2 = new Person("Douglas");
        Person p3 = new Person("Patrick");

        pa.add(p1);
        pa.add(p2);
        pa.add(p3);

        Set<Person> peeps = pa.getPpl();

        for (Person p : peeps) {
            System.out.println(p.getName());
        }

        pa.remove(p1);
        System.out.println("------");
        peeps = pa.getPpl();

        for (Person p : peeps) {
            System.out.println(p.getName());
        }
    }
}
