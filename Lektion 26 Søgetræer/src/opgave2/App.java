package opgave2;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> weihnachtsSucheBaum = new BinarySearchTree<>();
        weihnachtsSucheBaum.add(45);
        weihnachtsSucheBaum.add(22);
        weihnachtsSucheBaum.add(77);
        weihnachtsSucheBaum.add(11);
        weihnachtsSucheBaum.add(30);
        weihnachtsSucheBaum.add(90);
        weihnachtsSucheBaum.add(15);
        weihnachtsSucheBaum.add(25);
        weihnachtsSucheBaum.add(88);

        weihnachtsSucheBaum.print();
        System.out.println("Preorder");
        System.out.println(weihnachtsSucheBaum.preorder());
        System.out.println();
        System.out.println("Postorder");
        System.out.println(weihnachtsSucheBaum.postorder());
        System.out.println();
        System.out.println("Inorder");
        System.out.println(weihnachtsSucheBaum.inorder());
        System.out.println();
        System.out.println("Stoerste: " + weihnachtsSucheBaum.findMax());
        System.out.println("Minste: " +weihnachtsSucheBaum.findMin());
        weihnachtsSucheBaum.print();
        System.out.println("Remobve 30");
        weihnachtsSucheBaum.remove(30);
        weihnachtsSucheBaum.print();
        System.out.println("Remove 88");
        weihnachtsSucheBaum.remove(88);
        weihnachtsSucheBaum.print();
        System.out.println("Remove 45");
        weihnachtsSucheBaum.remove(45);
        weihnachtsSucheBaum.print();
        System.out.println("Remove 80");
        weihnachtsSucheBaum.remove(80);
        weihnachtsSucheBaum.print();


        System.out.println("Find min");
        System.out.println(weihnachtsSucheBaum.findMin());
        System.out.println("Remove 90");
        weihnachtsSucheBaum.remove(90);
        weihnachtsSucheBaum.print();
        System.out.println("Find max");
        System.out.println(weihnachtsSucheBaum.findMax());

        System.out.println("-----NEW TREE-----");
        BinarySearchTree<Integer> weihnachtsSucheBaum1 = new BinarySearchTree<>();
        weihnachtsSucheBaum1.add(45);
        weihnachtsSucheBaum1.add(22);
        weihnachtsSucheBaum1.add(77);
        weihnachtsSucheBaum1.add(11);
        weihnachtsSucheBaum1.add(30);
        weihnachtsSucheBaum1.add(90);
        weihnachtsSucheBaum1.add(15);
        weihnachtsSucheBaum1.add(25);
        weihnachtsSucheBaum1.add(88);

        weihnachtsSucheBaum1.print();
        System.out.println("Remove min " + weihnachtsSucheBaum1.removeMin());
        //weihnachtsSucheBaum1.removeMin();
        weihnachtsSucheBaum1.print();

        System.out.println("Remove min " +  weihnachtsSucheBaum1.removeMin());
        //weihnachtsSucheBaum1.removeMin();
        weihnachtsSucheBaum1.print();
        System.out.println("Remove min " +  weihnachtsSucheBaum1.removeMin());
        //weihnachtsSucheBaum1.removeMin();
        weihnachtsSucheBaum1.print();


        System.out.println("-----");


    }




}
