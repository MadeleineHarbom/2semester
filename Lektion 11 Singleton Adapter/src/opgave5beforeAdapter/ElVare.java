package opgave5beforeAdapter;

public class ElVare extends Vare{

    private int moms = 30;

    public ElVare(String navn, int pris) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double m = (this.moms/100.0) * super.getPris();
        if (m >= 3.0) {
            return m;
        }
        else {
            return 3.0;
        }
    }
}
