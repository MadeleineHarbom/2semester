package opgave3HashSet;

import java.util.HashSet;

public class Skole {
    private String navn;
    private HashSet<Studerende> studerende;

    public Skole(String navn) {
        this.navn = navn;
        this.studerende = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende s) {
        this.studerende.add(s);
    }

    public void removeStuderende(Studerende s) {
        this.studerende.remove(s);
    }

    public double gennemsnit() {
        double k = 0.0;
        int i = 0;
        for (Studerende s : this.studerende) {
            for (int ik : s.getKarakter()) {
                k += ik;
                i++;
            }
        }
        return k/i;

    }

    public Studerende findStuderende(int studienummer) {
        for (Studerende s : this.studerende) {
            if (studienummer == s.getStudieNr()) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String s = this.navn;
        for (Studerende st : this.studerende) {
            s+= "\n" + st.toString();
        }

        return s;
    }
}