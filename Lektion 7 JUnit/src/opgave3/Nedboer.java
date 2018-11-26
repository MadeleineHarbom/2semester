package opgave3;

public class Nedboer {
    private int[] nedboerPrUge = { // 52 uger i alt
            20, 10, 12, 12, 13, 14, 15, 10,  8, 7,
            13, 15, 10,  9,  6,  8, 12, 22, 14, 16,
            16, 18, 23, 12,  0,  2,  0,  0, 78,  0,
            0,  0,  34, 12, 34, 23, 23, 12, 44, 23,
            12, 34, 22, 22, 22, 22, 18, 19, 21, 32,
            24, 13 };

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     */
    public int besteTreFerieUger() {
        double best = 90000;
        int week =0;
        int current;
        for (int i = 0; i < nedboerPrUge.length; i++) {
            if (i == 50) {
                current = nedboerPrUge[50] + nedboerPrUge[51] + nedboerPrUge[0];
            }
            else if (i == 51) {
                current = nedboerPrUge[51] + nedboerPrUge[0] + nedboerPrUge[1];
            }
            else {
                current = nedboerPrUge[i] + nedboerPrUge[i+1] + nedboerPrUge[i+2];
            }
            if (current <best) {
                best = current;
                week = i+1;
            }
        }
        return week;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det antal uger, der er
     * angivet i parameteren
     * @param antal antal uger man gerne vil holde ferie
     */
    public int bedsteFerieUgerStart(int antal) {
        double best = 90000;
        int week =0;
        int current;
        for (int i = 0; i < nedboerPrUge.length; i++) {
            current = 0;
            for (int j =i; j <i+antal; j++) {
                if (j > 51) {
                    current += nedboerPrUge[j-51];
                }
                else {
                    current += nedboerPrUge[j];
                }
            }
            if (current< best) {
                best = current;
                week = i+1;
            }
        }
        return week;

    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     */
    public int mestEnsNedboer() {
        int streak;
        int week =0;
        int maxsteak=0;

        for (int i = 0; i < nedboerPrUge.length; i++) {
            streak = 0;
            int j = i;
            while (j < 50 &&nedboerPrUge[j] == nedboerPrUge[j+1]) {
                streak ++;
                j++;
            }
            if (streak > maxsteak) {
                maxsteak = streak;
                week = i;
                if (nedboerPrUge.length < i + maxsteak) {
                    return week;
                }

            }
        }
        return week;
    }
}
