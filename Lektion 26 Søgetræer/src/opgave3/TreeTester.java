package opgave3;



/**
 * This program tests the binary search tree class.
 */
public class TreeTester {

	//VIRKER IKKE
	public static void main(String[] args) {
		DictionaryBST<String, String> t = new DictionaryBST<>();
		t.put("Steffen", "Rudkjoebing");
		t.put("Madeleine", "Harbom");
		t.put("Lord", "Douglas");
		t.put("Sir", "Patrick");

		System.out.println(t.inorder());



	}
}
