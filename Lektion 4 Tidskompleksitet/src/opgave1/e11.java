package opgave1;

public class e11 {

    public static boolean checkString(String[] strings, String string) {
        for(int i=0; i<strings.length; i++) {
            if (strings[i].equals(string)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Diskutere denne funktions Big Oh");
        System.out.println("Liniar, en mere sting i array, vil give en mere iteration (worst case)");
    }
}
