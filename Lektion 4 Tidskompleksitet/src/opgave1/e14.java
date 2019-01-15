package opgave1;

public class e14 {

    public static void method1(int[] array, int n) {
        for (int index = 0; index <n; index++) {
            int mark = privateMethod1(array, index, n-1);
            int temp = array[index];
            array[index] = array[mark];
            array[mark] = temp;
        }
    }

    private static int privateMethod1(int[] array, int first, int last) {
        int min = array[first];
        int indexOfMin = first;
        for (int index = first +1; index <= last; index++) {
            if(array[index] < min) {
                min = array[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    public static void main(String[] args) {
        System.out.println("Diskutere funktionens Big Oh");
        System.out.println("Den koerer n*(n^2 -2n), er den saa faktoriel");
        System.out.println("Men da dette kun inkluderer den dominante del af ligningen");
        System.out.println("Saa den borde kunne forkortes til n^2, og blive kvadratisk?");
        System.out.println("SPOERG PETER NAAR HAN ER PAA GODT HUMOER"); //Hey
    }


}
