package opgave2;

public class BinomApp {

    public static int binom(int m, int n) {
        if (m == 0 || m == n) {
            return 1;
        }
        else {
            return binom(m, n-1) + binom(m-1, n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(binom(3, 20));

    }
}
