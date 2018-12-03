package opgave2;


/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
	public static void main(String[] args) {
	    testHashSetChaining();
	    //testHashSetLinearProbing();
	}
	
    public static void testHashSetChaining() {
        HashSetChaining names = new HashSetChaining(13);
      
        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        
        System.out.println(names);

        System.out.println("Size: "+names.size());
        System.out.println("Contains Romeo: " + names.contains("Romeo"));

        System.out.println("------------");


        //Husk at tjekke efter du dubletter
        //Hvis du proever att add Romeo igen skal den give false
        System.out.println("Contains Romeo: " + names.contains("Romeo"));
        System.out.println(names.add("Romeo")); //good
        System.out.println("Contains Romeo: " + names.contains("Romeo"));
        names.remove("Romeo");
        System.out.println("Contains Romeo: " + names.contains("Romeo"));
        System.out.println("Oh Romeo, oh Romeo, where art thou? DELETED BITCH!");
        System.out.println(names.remove("Romeo"));
        //Proev af remove Romeo igen
        // Skal give false, da der ikke er noget Romeo i listen mere
        names.remove("Nina");
        System.out.println("Contains Nina: " + names.contains("Nina"));
        System.out.println(names.size());
        System.out.println();
        System.out.println(names);
    }

}
