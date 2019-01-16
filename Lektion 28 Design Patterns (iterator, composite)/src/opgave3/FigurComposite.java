package opgave3;

import java.util.ArrayList;

public class FigurComposite implements FigurComponent {

    private ArrayList<FigurComponent> comps = new ArrayList<>();

    @Override
    public void draw() {
        for (FigurComponent c :this.comps) {
            c.draw();
        }
    }

    @Override
    public double getArea() {
        double area = 0.0;
        for (FigurComponent c : this.comps) {
            area += c.getArea();
        }
        return area;
    }

    public void add(FigurComponent c) {
        this.comps.add(c);
    }

    //skal ha en remove

}
