package opgave2;

import java.util.Arrays;
import java.util.List;

public class ZeroApp {


    public static int countZero(List<Integer> theList) {
        int count = 0;
        if (theList.size() > 0) {
            if (theList.get(0) == 0) {
                count ++;
            }
            count += countZero(theList.subList(1, theList.size()));
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,8,0);
        System.out.println(countZero(test));

    }

}
