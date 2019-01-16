package opgave3;

import com.sun.tools.corba.se.idl.ForwardGen;

public class Main {

    public static void main(String[] args) {
        FigurComponent r  = new Rekangel(10, 10);
        FigurComponent t = new Trekant(10, 10);
        FigurComponent e = new Ellipse(10, 10);
        FigurComposite comp = new FigurComposite();
        comp.add(r);
        comp.add(t);
        comp.add(e);

        comp.draw();
        System.out.println(comp.getArea());
    }



}
