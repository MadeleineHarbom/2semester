package opgave2;

public class StringApp {

    public static String reverseString(String theString) {
        if (theString.length() < 1) {
            return "";
        } else {
            String newString = theString.substring(0, theString.length() - 1);;
            return theString.substring(theString.length() - 1, theString.length()) + reverseString(newString);
        }

    }

    public static String reserveStringWithHelper(String theString) {
        int counter = theString.length();
        if (theString.length() <= 0) {
            return "";
        } else {
            return reserveStringHelper(theString, counter);
        }
    }

    public static String reserveStringHelper(String theString, int counter) {
        if (counter <= 0) {
            return "";
        }
        else {
            counter--;
            return theString.charAt(counter) + reserveStringHelper(theString, counter);
        }

    }


    public static void main(String[] args) {
        String test = "Madeleine";
        System.out.println(reverseString(test));
        System.out.println("-----");
        System.out.println(reserveStringWithHelper(test));


    }
}
