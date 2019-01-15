package opgave1;

public class App {

    public static void main(String[] args) {
        BinaryTree<String> t1 = new BinaryTree<>("2");
        BinaryTree<String> t2 = new BinaryTree<>("4");
        BinaryTree<String> t3 = new BinaryTree<>("+", t1, t2);
        BinaryTree<String> t4 = new BinaryTree<>("7");
        BinaryTree<String> t5 = new BinaryTree<>("*", t3, t4);
        BinaryTree<String> t6 = new BinaryTree<>("3");
        BinaryTree<String> t7 = new BinaryTree<>("8");
        BinaryTree<String> t8 = new BinaryTree<>("+", t6, t7);
        BinaryTree<String> theTreeOfLife = new BinaryTree<>("+", t5, t8);


        System.out.println(theTreeOfLife.countElements("+"));
        System.out.println(theTreeOfLife.value());
        System.out.println(theTreeOfLife.inorder());
    }
}
