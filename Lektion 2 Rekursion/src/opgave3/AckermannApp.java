package opgave3;

public class AckermannApp {

    public static int acker(int m, int n) {
        if (m==0) {
            return n+1;
        }
        else if (n==0){
            return acker(m-1, 1);
        }
        else {
            return acker(m-1,acker(m, n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(acker(2, 3));
    }
}
