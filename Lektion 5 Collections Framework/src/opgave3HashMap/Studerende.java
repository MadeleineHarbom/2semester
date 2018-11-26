package opgave3HashMap;

import java.util.LinkedList;
import java.util.List;

public class Studerende implements Comparable<Studerende>{
    private int studieNr;
    private String navn;
    private List<Integer> karakter;

    public Studerende(int studieNummer, String navn) {
        this.studieNr = studieNummer;
        this.navn = navn;
        this.karakter = new LinkedList<>();
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKaraker(int k) {
        karakter.add(k);
    }

    public List<Integer> getKarakter() {
        return new LinkedList<>(this.karakter);
    }

    @Override
    public int compareTo(Studerende o) {
        if (studieNr > o.studieNr) {
            return 1;
        }
        else if(studieNr < o.studieNr) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.navn + " (" + this.getStudieNr() + ")";
    }
}
