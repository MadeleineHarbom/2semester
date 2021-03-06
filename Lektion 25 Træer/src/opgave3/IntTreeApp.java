package opgave3;

public class IntTreeApp {
    public static void main(String[] args) {

        //Left side
        //BinaryTree<Integer> test = new BinaryTree<>(42);
        BinaryTree<Integer> bt15 = new BinaryTree<>(15);
        BinaryTree<Integer> bt25 = new BinaryTree<>(25);
        BinaryTree<Integer> bt11 = new BinaryTree<>(11, null, bt15);
        BinaryTree<Integer> bt30 = new BinaryTree<>(30, bt25, null);
        BinaryTree<Integer> bt22 = new BinaryTree<>(22, bt11, bt30);

        //Right side
        BinaryTree<Integer> bt88 = new BinaryTree<>(88);
        BinaryTree<Integer> bt90 = new BinaryTree<>(90, bt88, null);
        BinaryTree<Integer> bt77 = new BinaryTree<>(77, null, bt90);

        //Root
        BinaryTree<Integer> bt45 = new BinaryTree<>(45, bt22, bt77);

        System.out.println("Height: " + bt45.height());

        //trivserse metoder er rekursive
        System.out.println("Preorder");
        System.out.println(bt45.preorder());
        System.out.println("Works");

        System.out.println("------");
        System.out.println("Postorder");
        System.out.println(bt45.postorder());
        System.out.println("Works");


        System.out.println("-------");

        System.out.println("Inorder");
        System.out.println(bt45.inorder());
        System.out.println("Works");


        System.out.println("Sum: " + bt45.sum());

        System.out.println("Averae: " + bt45.average());

    }
}
