package opgave5afterAdapter;

public class Main {
    public static void main(String[] args) {
        Spiritus s = new Spiritus(50, "Smager godt");
        SpiritusAdapter sa = new SpiritusAdapter(s, 50, "Oel");
        System.out.println(sa.getPris());
    }
}
