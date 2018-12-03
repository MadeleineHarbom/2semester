package opgave4;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary dictionary = new DictionaryHashMap();
		System.out.println("Is empty: " + dictionary.isEmpty());
		System.out.println("Size: " + dictionary.size());

		dictionary.put(8, "Hans");
		System.out.println("8: Hans added");
		dictionary.put(3, "Viggo");
		System.out.println("3: Viggo added");
		System.out.println("Is empthy: "+ dictionary.isEmpty());
		System.out.println("Size:" + dictionary.size());

		System.out.println("Get key 8");
		System.out.println(dictionary.get(8));

		dictionary.put(7, "Bent");
		System.out.println("7: Bent added");
		dictionary.put(2, "Lene");
		System.out.println("2: Lene added");
		System.out.println("Is empty: " + dictionary.isEmpty());
		System.out.println("Size: " + dictionary.size());
		System.out.println("Remove 3:" + dictionary.remove(3));

		System.out.println("size:" + dictionary.size());

		System.out.println(dictionary.put(8, "Ida"));
		System.out.println("8: Ida added");
		System.out.println("Get key 8");
		System.out.println(dictionary.get(8));

        System.out.println("REHASH TEST");
        dictionary = new DictionaryHashMap();
        dictionary.put(1, "Madeleine");
        dictionary.put(2, "Steffen");
        dictionary.put(3, "Douglas");
        dictionary.put(4, "Patrick");
        dictionary.put(5, "Bertil");
        dictionary.put(6, "Thomas");
        dictionary.put(7, "Milla");
        dictionary.put(8, "Maja");
        dictionary.put(9, "Linnea");
        dictionary.put(10, "Sander");
        System.out.println("Size: " + dictionary.size());
        System.out.println(dictionary.toString());
        dictionary.put(11, "Lill-Nalle");
        System.out.println("Size:" + dictionary.size());
        System.out.println(dictionary.toString());

	}
	
}
