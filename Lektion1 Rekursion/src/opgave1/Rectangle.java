package opgave1;

public class Rectangle {
    private int w;
    private int h;

    public Rectangle(int width, int height) {
        this.w = width;
        this.h = height;
    }

    //Find arealet paa reklangel rekusivt
    public int getArea() {
        int height = this.h;
        int width = this.w;
        if (height <= 0) {
            return 0;
        }
        else if (height == 1) {
            return width;
        }
        else {
            Rectangle r = new Rectangle(w, h -1 );
            return r.getArea() + width;
        }

    }

}
