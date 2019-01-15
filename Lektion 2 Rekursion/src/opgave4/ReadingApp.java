package opgave4;

import java.io.File;

public class ReadingApp {


    public static void scanDir(String path) {
        System.out.println("[DIR] " + path);

        File file = new File(path);
        String[] names = file.list();

        for (String name : names) {
            String newPath = path + "/" + name;
            if ((new File(newPath)).isDirectory()) {
                scanDir(newPath);
            }
        }

    }

    public static int countDir(String path) {
        File file = new File(path);
        String[] names = file.list();
        int count = 1;

        for (String name : names) {
            String newPath = path + "/" + name;
            if ((new File(newPath)).isDirectory()) {
                count += countDir(newPath);
            }

        }
        return count;
    }



    public static void main(String[] args) {
        scanDir("..");
        //System.out.println(countDir(".."));
        //countDir("..");

    }
}
