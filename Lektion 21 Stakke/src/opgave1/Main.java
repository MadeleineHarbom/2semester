package opgave1;

public class Main {
    public static void main(String[] args) {
        Stack ass = new ArrayStack<String>(10);
        ass.push("Made");
        ass.push("Steffen");
        System.out.println(ass.toStirng());
        ass.pop();
        System.out.println(ass.toStirng());
    }
}
