package opgave2;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {
        ArrayList<String> testlist = new ArrayList<>();
        testlist.add("Douglas");
        testlist.add("Patrick");
        testlist.add("Steffen");
        testlist.add("Made");
        testlist.add("Ann");


        SearchableList<String> searchlist = new SearchableList<>(testlist);

        System.out.println(searchlist.search("Douglas"));
        System.out.println(searchlist.search("Stine"));
        System.out.println("-----");

        String[] testarray = {"Douglas", "Patrick", "Steffen", "Made", "Ann"};
        SearchableArray<String> searcharray = new SearchableArray<>(testarray);
        System.out.println(searcharray.search("Douglas"));
        System.out.println(searcharray.search("Stine"));

    }
}
