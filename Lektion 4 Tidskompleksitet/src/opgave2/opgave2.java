package opgave2;

public class opgave2 {

    public static int method1(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n; j=j*2) {
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hvilken stoerrelsesorden er metoden?");
        System.out.println("Linear logarithmisk");
    }

}
