package opgave2;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayedList<String> list = new ArrayedList<>();
        list.add("Banan");
        list.add("Æble");
        list.add("Tomat");
        list.add("Jordbær");
        System.out.println(list);

        Iterator<String> i =list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
