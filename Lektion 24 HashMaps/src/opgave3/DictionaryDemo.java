package opgave3;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary dictionary = new DictionaryLinked();
		System.out.println(dictionary.isEmpty());
		System.out.println(dictionary.size());

		dictionary.put(8, "Hans");
		System.out.println("8 : Hans added");
		dictionary.put(3, "Viggo");
		System.out.println("3 : viggo added");
		System.out.println(dictionary.isEmpty());
		System.out.println(dictionary.size());

		System.out.println(dictionary.get(8));

		dictionary.put(7, "Bent");
		System.out.println("7 : Bent added");
		dictionary.put(2, "Lene");
		System.out.println("2 : Lene added");
		System.out.println(dictionary.isEmpty());
		System.out.println(dictionary.size());
		System.out.println(dictionary.remove(3).toString()); // gaar galt
		System.out.println("Object removed?");

		System.out.println(dictionary.size());

		System.out.println(dictionary.put(8, "Ida"));
		System.out.println("8 : Ida added");
		System.out.println(dictionary.get(8));

		Dictionary cardic = new DictionaryLinked();

        Bil b1 = new Bil("AB12345", "Volkswagen", "Polo", "Blaa");
        Bil b2 = new Bil("ZX67892", "Volkswagen", "up!", "Hvid");
        Bil b3 = new Bil("TR74743", "Volkswagen", "Golf", "Gul");
        Bil b4 = new Bil("AB12345", "Volkswagen", "Polo", "Blaa");


        System.out.println(cardic.put("AB12345", b1));
        System.out.println(cardic.put("ZX67892", b2));
        System.out.println(cardic.put("TR74743", b3));
        System.out.println(cardic.put("AB12345", b4));


	}
	
}
