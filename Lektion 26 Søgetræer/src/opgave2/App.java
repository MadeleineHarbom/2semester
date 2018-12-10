package opgave2;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> yggdrasil = new BinarySearchTree<>();
        yggdrasil.add(45);
        yggdrasil.add(22);
        yggdrasil.add(77);
        yggdrasil.add(11);
        yggdrasil.add(30);
        yggdrasil.add(90);
        yggdrasil.add(15);
        yggdrasil.add(25);
        yggdrasil.add(88);

        yggdrasil.print();
        System.out.println("Preorder");
        System.out.println(yggdrasil.preorder());
        System.out.println();
        System.out.println("Postorder");
        System.out.println(yggdrasil.postorder());
        System.out.println();
        System.out.println("Inorder");
        System.out.println(yggdrasil.inorder());
        System.out.println();
        System.out.println("Stoerste: " + yggdrasil.findMax());
        System.out.println("Minste: " +yggdrasil.findMin());
        yggdrasil.print();
        System.out.println("Remobve 30");
        yggdrasil.remove(30);
        yggdrasil.print();
        System.out.println("Remove 88");
        yggdrasil.remove(88);
        yggdrasil.print();
        System.out.println("Remove 45");
        yggdrasil.remove(45);
        yggdrasil.print();
        System.out.println("Remove 80");
        yggdrasil.remove(80);
        yggdrasil.print();


        System.out.println("Find min");
        System.out.println(yggdrasil.findMin());
        System.out.println("Remove 90");
        yggdrasil.remove(90);
        yggdrasil.print();
        System.out.println("Find max");
        System.out.println(yggdrasil.findMax());

        System.out.println("-----NEW TREE-----");
        BinarySearchTree<Integer> treeBeard = new BinarySearchTree<>();
        treeBeard.add(45);
        treeBeard.add(22);
        treeBeard.add(77);
        treeBeard.add(11);
        treeBeard.add(30);
        treeBeard.add(90);
        treeBeard.add(15);
        treeBeard.add(25);
        treeBeard.add(88);

        treeBeard.print();
        System.out.println("Remove min " + treeBeard.removeMin());
        treeBeard.print();

        System.out.println("Remove min " +  treeBeard.removeMin());

        treeBeard.print();
        System.out.println("Remove min " +  treeBeard.removeMin());

        treeBeard.print();


        System.out.println("-----");


    }




}
