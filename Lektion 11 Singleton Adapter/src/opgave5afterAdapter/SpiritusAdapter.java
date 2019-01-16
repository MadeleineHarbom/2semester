package opgave5afterAdapter;

public class SpiritusAdapter extends Vare {

    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus s, int pris, String navn) {
        super(pris, navn);
        this.spiritus = s;
    }

    public double beregnMoms() {
        return spiritus.hentMoms();
    }


    @Override
    public int getPris() {
        return spiritus.getPrisen();
    }

    @Override
    public void setPris(int pris) {
        super.setPris(pris);
    }

    @Override
    public String getNavn() {
        return super.getNavn();
    }

    @Override
    public void setNavn(String navn) {
        super.setNavn(navn);
    }
}
