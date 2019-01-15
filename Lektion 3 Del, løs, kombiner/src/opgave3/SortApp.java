package opgave3;



import java.util.ArrayList;
import java.util.Arrays;

public class SortApp {



    public static void mergeSort(int[] list) { //Hvorfor er alt static?
        if (list.length <= 1) {
            return;
        }
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        for (int i =0; i < first.length; i++) {
            first[i] = list[i];
        }
        for(int i =0; i < second.length; i++) {
            second[i] = list[first.length +i];
        }
        mergeSort(first);
        mergeSort(second);
        merge(first,second, list);

    }

    public static void merge(int[] first, int[] second, int[] list) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                list[j] = first[iFirst];
                iFirst++;
            } else {
                list[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        while (iFirst < first.length) {
            list[j] = first[iFirst];
            iFirst ++;
            j++;
        }

        while (iSecond < second.length) {
            list[j] = second[iSecond];
            iSecond ++;
            j++;
        }
    }

    public static void quickSort(int[] list, int from, int to) { //Kig paa mig
        if (from >= to) {
            return;
        }
        int p = partition(list, from, to); //java.lang.StackOVerflowError
        quickSort(list, from, to);
        quickSort(list, p+1, to);
    }

    private static int partition(int[] list, int from, int to) {
        int pivot = list[from];
        int i = from +1;
        int j = to -1;
        while (i < j) {
            i++;
            while (list[i] < pivot) {
                i++;
            }
            j--;
            while (list[j] > pivot) {
                j--;
            }
            if (j<=i) {
                SortApp.swap(list, i, j);
            }
            return j;
        }
        return -42; // FIX THIS
    }

    private static void swap(int[] list, int place1, int place2) {
        int temp = list[place1];
        list[place1] = list[place2];
        list[place2] = temp;
    }




    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.addAll(Arrays.asList(new Integer[]{98, 99, 123, 12, 56, 66637, 1, 12, 0, 4, 56, 107}));
        System.out.println(list);
        int[] array = {98, 99, 123, 12, 56, 66637, 1, 12, 0, 4, 56, 107};
        SortApp.quickSort(array, 0, array.length - 1);



        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        //mergeSort(array);


        /*for (int a : array) {
            System.out.print(a + " ");
        }*/

    }

}
