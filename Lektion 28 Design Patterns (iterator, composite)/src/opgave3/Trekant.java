package opgave3;



public class Trekant implements FigurComponent {

    private int base;
    private int height;

    public Trekant(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Triangel");
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2.0;
    }
}
