package opgave1;

public class e10 {
    public static boolean IsStringHello(String s) {
        if(s.equals("Hello")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Diskutere denne funktion's Big Oh");
        System.out.println("Svar: Konstant, maaske, afhaengig af hvordan equalsfunktionen er");
        System.out.println("Eller linear, da den skal loebe gennem hver char, hvis den bliver laengere");
    }
}
