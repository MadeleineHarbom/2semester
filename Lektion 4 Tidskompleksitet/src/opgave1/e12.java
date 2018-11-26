package opgave1;

public class e12 {


    public static void main(String[] args) {
        int n = 10; //Should be an array with n-items
        for(int pass=1; pass <= n; pass++) {
            for(int index = 0; index < n; index++) {
                for(int count=1; count <10; count++) {
                    System.out.println("Do stuff");
                }
            }
        }

        System.out.println("Diskutere funktionens Big Oh");
        System.out.println("Svar: n*n gange, den er kvadratisk");

    }

}
