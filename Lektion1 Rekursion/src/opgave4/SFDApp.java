package opgave4;

public class SFDApp {

    //Finder det stoerste heltal der kan dele baade a og b
    public static int sfd(int a, int b) {
        if (a < 0 || b < 0) { //tjekker saa tallene er possitive
            return 0;
        }
        int i;
        //Counter saettes til at vaere det minste af de to tal, da det det er det hoejeste bud
        if ( a > b) {
            i = b;
        }
        else {
            i = a;
        }
        return sfd(a,b, i);



    }

    private static int sfd(int a, int b, int i) {
        if (i <= 0) {
            return 0;
        }
        else if (a%i == 0 && b%i == 0){ //hvis modulus giver 0 paa begge, saa kan tallet dividere baegge tal
            return i; //Da vi taeller opfra, saa er det foerste tal det hoejeste
        }
        else {
            return sfd(a, b, i-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(sfd(10,80));


    }

}
