package opgave1;


import java.util.Arrays;

public class Test {

    public static int highestArray(int[] theArray) {
        if (theArray.length == 0) {
            return 0;
        }
        else {
            int next = highestArray(Arrays.copyOfRange(theArray, 1, theArray.length));
            if (theArray[0] > next) {
                return theArray[0];
            }
            else {
                return next;
            }
        }
    }

    public static int sumOfArray(int[] theArray) {
        if (theArray.length == 0) {
            return 0;
        }
        else {
            return theArray[0] + sumOfArray(Arrays.copyOfRange(theArray,1,theArray.length));
        }
    }



    // Rectangle
    public static void main(String[] args) {


        Rectangle testi = new Rectangle(10, 20);
        System.out.println(testi.getArea());

        Rectangle testies = new Rectangle(5, 8);
        System.out.println(testies.getArea());

        int[] testArray = {7, 8, 15, 1, 9, 17,3, 3, 15};
        System.out.println(highestArray(testArray));

        System.out.println(sumOfArray(testArray));

        int[] testArray1 = {7};
        System.out.println(sumOfArray(testArray1));


        String test0 = "Made";
        System.out.println(test0.substring(0,4));


    }






}
