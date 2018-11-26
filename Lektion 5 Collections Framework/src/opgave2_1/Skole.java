package opgave2_1;

import java.util.LinkedList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studerende;

    public Skole(String navn) {
        this.navn = navn;
        this.studerende = new LinkedList();
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
        if (this.studerende.size() > 0) {
            s += ": ";
            if (this.studerende.size() == 1) {
                s += this.studerende.get(0).toString() + ".";
            }
            else {
                for (int i = 0; i < this.studerende.size(); i++) {
                    if (i == 0) {
                        s += this.studerende.get(0).toString();
                    }
                    else if(i == this.studerende.size() -1) {
                        s+= " og " + this.studerende.toString() + ".";
                    }
                    else {
                        s += ", " + this.studerende.get(i).toString();

                    }
                }
            }
        }

        return s;
    }
}