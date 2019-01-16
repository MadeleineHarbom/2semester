package opgave5afterAdapter;

public class Spiritus {
    private int pris;
    private String betegnelse;

    public Spiritus(int pris, String betegnelse) {
        this.pris = pris;
        this.betegnelse = betegnelse;
    }

    public int getPrisen() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public void setBetegnelse(String betegnelse) {
        this.betegnelse = betegnelse;
    }

    public double hentMoms() {
        return pris * 1.25;
    }
}
