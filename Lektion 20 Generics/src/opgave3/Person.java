package opgave3;

public class Person<T> implements Comparable<Person> {
    T name;

    public Person(T t) {
        name = t;
    }

    public String toString() {
        return name.toString();
    }

    @Override
    public int compareTo(Person o) {
        return toString().compareTo(o.toString());
    }
}

