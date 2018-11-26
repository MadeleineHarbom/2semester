package opgave1;

public class e13 {
    public static void main(String[] args) {
        int n = 10; //Should be an array with 10 items
        for(int pass=1; pass <= n; pass++) {
            for(int index = 0; index < n; index++) {
                for(int count=1; count <n; count++) {
                    System.out.println("Do stuff");
                }
            }
        }

        System.out.println("Diskutere funktionens Big Oh");
        System.out.println("Svar: n*n*n, den er kubisk");

    }
}
