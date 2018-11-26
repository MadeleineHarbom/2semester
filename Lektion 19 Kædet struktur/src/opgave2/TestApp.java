package opgave2;

public class TestApp {


    public static void main(String[] args) {
        SortedDoubleLink sl = new SortedDoubleLink();
        sl.addElement("Madeleine");
        System.out.println("Madeleine");
        System.out.println(sl.toString());
        sl.addElement("Steffen");
        System.out.println("Steffen");
        System.out.println(sl.toString());
        sl.addElement("Douglas");
        System.out.println("Doublas");
        System.out.println(sl.toString());
        sl.addElement("Patrick");
        System.out.println("Patrick");
        System.out.println(sl.toString());
        sl.addElement("Bertil");
        System.out.println("Bertil");
        System.out.println(sl.toString());
        sl.addElement("Thomas");
        System.out.println("Thomas");
        System.out.println(sl.toString());
        System.out.println(sl.countElements());

        System.out.println("------");


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

    }


}
