package opgave3;

public class PowerApp {

    public static int power(int n, int p) {
        //cant do power of 0
        if (p == 0) {
            return 1;
        }
        else if (p < 0) {//p skal vaere possitiv
            return 0;
        }
        else {
            p--;
            return n * power(n, p);
        }
    }



    public static void main(String[] args) {
        System.out.println(power(8,1));
        System.out.println(power(8, 0));
        System.out.println(power(8, 8));
        System.out.println(power(2, 8));
    }
}
