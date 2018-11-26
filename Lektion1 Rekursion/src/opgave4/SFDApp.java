package opgave4;

public class SFDApp {

    public static int sfd(int a, int b) {
        if (a < 0 || b < 0) {
            return 0;
        }
        int i;
        if ( a > b) {
            i = a;
        }
        else {
            i = b;
        }
        return sfd(a,b, i);



    }

    public static int sfd(int a, int b, int i) {
        if (i <= 0) {
            return 0;
        }
        else if (a%i == 0 && b%i == 0){
            return i;
        }
        else {
            return sfd(a, b, i-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(sfd(10,8));


    }

}
