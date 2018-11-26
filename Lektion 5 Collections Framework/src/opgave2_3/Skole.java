package opgave2_3;

import java.util.HashMap;
import java.util.Map;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studerende;

    public Skole(String navn) {
        this.navn = navn;
        this.studerende = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende s) {
        this.studerende.put(s.getStudieNr(), s);
    }

    public void removeStuderende(Studerende s) {
        this.studerende.remove(s);
    }

    public double gennemsnit() {
        double k = 0.0;
        int i = 0;
        for (Integer key : this.studerende.keySet()) {
            for (int ik : this.studerende.get(key).getKarakter()) {
                k += ik;
                i++;
            }
        }
        return k/i;

    }

    public Studerende findStuderende(int studienummer) {
        Studerende s = this.studerende.get(studienummer);
        return s;
    }

    @Override
    public String toString() {
        String s = this.navn;
        if (this.studerende.size() > 0) {
            s += ": \n";
            for(Integer key : this.studerende.keySet()) {
                s += this.studerende.get(key).toString() + "\n";
            }
        }

        return s;
    }
}