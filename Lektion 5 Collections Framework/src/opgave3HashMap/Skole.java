package opgave3HashMap;

import java.util.HashMap;

public class Skole {
    private String navn;
    private HashMap<Integer, Studerende> studerende;

    public Skole(String navn) {
        this.navn = navn;
        this.studerende = new HashMap();
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
        for (Studerende s : this.studerende.values()) {
           for (int ik : s.getKarakter()) {
               k += ik;
              i++;
           }
        }
        return k/i;

    }

    public Studerende findStuderende(int studienummer) {
        for (int snr : this.studerende.keySet()) {
            if (studienummer == snr) {
                return snr; //Hvordan retunerer jeg value?
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
                        s += this.studerende.get(i).toString();
                    }
                    else if(i == this.studerende.size() -1) {
                        s+= " og " + this.studerende.get(i).toString() + ".";
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