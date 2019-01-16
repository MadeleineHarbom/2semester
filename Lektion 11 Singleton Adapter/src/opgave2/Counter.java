package opgave2;

public class Counter {

    //Tjek
    private static Counter uniqueCounter;
    private int value;


    private Counter() {
        value = 0;
    }

    public static synchronized Counter getCounter() {
        if (uniqueCounter == null) {
            uniqueCounter = new Counter();
        }
        return uniqueCounter;
    }

    public void count() {
        value++;
    }

    public void times2() {
        value = value *2;
    }

    public void zero() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
