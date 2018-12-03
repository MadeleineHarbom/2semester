package opgave3;

import java.util.Objects;

public class Bil {

    private String registreringsnummer;
    private String maerke;
    private String model;
    private String farve;


    public Bil(String regnr, String maerke, String model, String farv) {
        this.registreringsnummer = regnr;
        this.maerke = maerke;
        this.model = model;
        this.farve = farv;
    }

    @Override
    public String toString() {
        return this.registreringsnummer +": " + this.maerke + " " + this.model + " " + this.farve;
    }

    public String getFarve() {
        return farve;
    }

    public String getMaerke() {
        return maerke;
    }

    public String getModel() {
        return model;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    @Override
    public boolean equals(Object obj) {
        Bil bil = (Bil) obj;
        if (this.maerke.equals(bil.maerke) && this.registreringsnummer.equals(bil.registreringsnummer)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(registreringsnummer, maerke));
        return Objects.hash(registreringsnummer, maerke);
    }


}
