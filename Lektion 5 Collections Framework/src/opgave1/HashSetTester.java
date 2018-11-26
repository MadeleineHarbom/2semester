package opgave1;

import java.util.HashSet;

public class HashSetTester {

    public static void main(String[] args) {
        HashSet<Integer> ints = new HashSet<>();
        ints.add(34);
        ints.add(12);
        ints.add(23);
        ints.add(45);
        ints.add(67);
        ints.add(34);
        ints.add(98);
        System.out.println(ints.toString());
        ints.add(23);
        System.out.println(ints.toString());
        ints.remove(67);
        System.out.println(ints.toString());
        System.out.println(ints.contains(23));
        System.out.println(ints.size());
        
    }
}
