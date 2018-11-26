package opgave3;

public class PrefixGennemsnit {

    public static double[] prefixAverage(int[] array) {
        double[] prefix = new double[array.length];
        int result=0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            double average = Double.valueOf(result)/(i+1);
            prefix[i] = average;
        }
        return prefix;

    }


    public static void main(String[] args) {
        int[] list1 = {5, 10, 5, 6, 4, 9, 8};
        for (double d : prefixAverage(list1)) {
            System.out.println(d);
        }

    }

}
