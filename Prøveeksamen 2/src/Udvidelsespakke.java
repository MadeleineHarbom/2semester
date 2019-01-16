public class Udvidelsespakke extends TimePakke {
    private double plusPris;

    public Udvidelsespakke(double mndPris, double minutPris, int frieTimer, double plusPris) {
        super(mndPris,minutPris, frieTimer);
        this.plusPris = plusPris;
    }

    @Override
    public double abopnentsPris() {
        return super.abopnentsPris() +  this.plusPris;
    }
}
