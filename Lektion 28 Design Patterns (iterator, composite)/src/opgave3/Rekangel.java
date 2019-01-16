package opgave3;

public class Rekangel implements FigurComponent {

    private int lenght;
    private int height;

    public Rekangel (int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rekangel");
    }

    @Override
    public double getArea() {
        return this.lenght * this.height;
    }
}
