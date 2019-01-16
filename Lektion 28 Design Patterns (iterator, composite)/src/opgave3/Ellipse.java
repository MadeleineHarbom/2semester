package opgave3;

public class Ellipse implements FigurComponent {

    private int height;
    private int width;

    public Ellipse(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Ellipse");
    }

    @Override
    public double getArea() {
        return height * width - 10;
    }
}
