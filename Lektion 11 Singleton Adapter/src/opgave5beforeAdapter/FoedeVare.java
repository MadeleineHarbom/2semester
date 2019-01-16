package opgave5beforeAdapter;

public class FoedeVare extends Vare{
    private int moms = 5;

    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return (this.moms/100.0) * super.getPris();
    }
}
