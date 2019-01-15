package opgave5;

public class KvadratrodApp {

    public static int kvadratrod(int n) {
        int i = n;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return kvadratrod(n, i);
        }
    }

    private static int kvadratrod(int n, int i) {
        if (i <= 0) {
            return 0;
        }
        else if(i*i==n) {
            return i;
        }
        else {
            return kvadratrod(n, i-1);

        }
    }

    public static void main(String[] args) {
        System.out.println(kvadratrod(9));

    }

}
