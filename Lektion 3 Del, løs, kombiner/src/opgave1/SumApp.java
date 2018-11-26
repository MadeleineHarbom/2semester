package opgave1;

import java.util.ArrayList;
import java.util.List;

public class SumApp {

    public static int summer(List<Integer> theList) {
        if (theList.size() == 1) {
            return theList.get(0);
        }
        else {
            int m = (theList.size())/2;
            return summer(theList.subList(0,m)) + summer(theList.subList(m, theList.size()));
        }

    }


    public static void main(String[] args) {
        List<Integer> testlist = new ArrayList<>();
        testlist.add(1);
        testlist.add(5);
        testlist.add(4);
        testlist.add(32);


        Integer i = 2;
        Integer j = 40;
        int k = i +j;
        System.out.println(k);
        System.out.println(testlist);
        System.out.println(summer(testlist));

    }


}
