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
        weihnachtsSucheBaum.remove(30);
        weihnachtsSucheBaum.print();
        weihnachtsSucheBaum.remove(88);
        weihnachtsSucheBaum.print();
        weihnachtsSucheBaum.remove(45);
        weihnachtsSucheBaum.print();
        weihnachtsSucheBaum.removeMin();
        weihnachtsSucheBaum.print();
        weihnachtsSucheBaum.removeMin();
        weihnachtsSucheBaum.print();
        System.out.println(weihnachtsSucheBaum.findMin());
        weihnachtsSucheBaum.remove(90);
        weihnachtsSucheBaum.print();
        System.out.println(weihnachtsSucheBaum.findMax());


    }




}
