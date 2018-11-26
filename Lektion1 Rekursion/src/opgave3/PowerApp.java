package opgave3;

public class PowerApp {

    public static int power(int n, int p) {
        //cant do power of 0
        if (p == 0) {
            return 1;
        }
        else {
            p--;
            return n * power(n, p);
        }
    }

    //Lave en hjælpemetoode og fix 0-bug


    public static void main(String[] args) {
        System.out.println(power(8,1));
    }
}
