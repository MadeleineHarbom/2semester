package opgave2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Boede {


    public int findeBoede(LocalDate due, LocalDate afl, int alder) {
        long antalDage = ChronoUnit.DAYS.between(due, afl);
        int pris;
        if (antalDage <= 7) {
            pris = 10;
        }
        else if (antalDage <= 14) {
            pris = 30;
        }
        else {
            pris = 45;
        }

        if (alder >= 18) {
            pris = pris*2;
        }



        return pris;
    }

}
