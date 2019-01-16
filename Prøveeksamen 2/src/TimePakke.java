public class TimePakke extends Abonnement {
    private int frieTimer;

    public TimePakke(double mndPris, double minutPris, int frietimer) {
        super(mndPris, minutPris);
        this.frieTimer = frietimer;
    }
}
