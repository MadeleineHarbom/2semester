package opgave3;

public class TestApp {


    public static void main(String[] args) {
        SortedLink sl = new SortedLink();
        sl.addElement("Madeleine");
        System.out.println("Madeleine");
        sl.addElement("Steffen");
        System.out.println("Steffen");
        sl.addElement("Douglas");
        System.out.println("Doublas");
        sl.addElement("Patrick");
        System.out.println("Patrick");
        sl.addElement("Bertil");
        System.out.println("Bertil");
        sl.addElement("Thomas");
        System.out.println("Thomas");
        System.out.println(sl.countElements());

        System.out.println("------");
        System.out.println(sl.getFirst());

        System.out.println(sl.toString());

        System.out.println(sl.removeElement("Bertil"));
        System.out.println(sl.toString());
        System.out.println(sl.countElements());
        System.out.println(sl.removeElement("Chico"));
        System.out.println(sl.toString());
        System.out.println(sl.countElements());
        System.out.println(sl.removeElement("Thomas"));
        System.out.println(sl.toString());
        System.out.println(sl.countElements());

        System.out.println();
        System.out.println("List2");

        SortedLink sl2 = new SortedLink();
        sl2.addAll(sl);
        System.out.println(sl2.toString());

    }


}
