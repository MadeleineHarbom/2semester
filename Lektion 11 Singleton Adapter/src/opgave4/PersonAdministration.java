package opgave4;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class PersonAdministration {
    private Set<Person> ppl = new HashSet<>();
    private static PersonAdministration admin = new PersonAdministration(); //eager

    public static PersonAdministration getPersonAdministration() {
        return admin;
    }

    public Person add(Person p) {
        ppl.add(p);
        return p;
    }

    public Person remove(Person p) {
        ppl.remove(p);
        return p;
    }

    public Set<Person> getPpl() {
        return new HashSet<>(this.ppl);
    }




}
