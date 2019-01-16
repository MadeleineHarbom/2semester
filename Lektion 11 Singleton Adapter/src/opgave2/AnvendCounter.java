package opgave2;

public class AnvendCounter {

    public static void main(String[] args) {
        Counter c = Counter.getCounter();
        c.count();
        c.count();
        c.count();
        System.out.println(c.getValue());
        c.times2();
        System.out.println(c.getValue());
        c = Counter.getCounter();
        System.out.println(c.getValue());
        c.zero();
        System.out.println(c.getValue());


    }

}
