package opgave2_3;

public class TestApp {

    public static void main(String[] args) {
        Skole skole1 = new Skole("Chrisiansberg skole");
        Skole skole2 = new Skole("Aarhus Univeritet");
        Skole skole3 =new Skole("Tierp Gymnasium");

        Studerende s1 = new Studerende(456789, "Lisa Simpson");
        Studerende s2 = new Studerende(4567, "Bart Simpson");
        Studerende s3 = new Studerende(789, "Finn the Human");
        Studerende s4 = new Studerende(4569, "Jake the Dog");
        Studerende s5 = new Studerende(43830, "Philip J Fry");
        Studerende s6 = new Studerende(74905, "Dorky McJerkFace");

        skole1.addStuderende(s1);
        skole1.addStuderende(s2);
        skole2.addStuderende(s3);
        skole2.addStuderende(s4);
        skole2.addStuderende(s5);

        System.out.println(skole1.toString());
        System.out.println(skole2.toString());
        System.out.println(skole3.toString());

        Studerende found = skole1.findStuderende(456789);
        if (found != null) {
            System.out.println(found.toString());
        }

        found = skole2.findStuderende(789);
        if (found != null) {
            System.out.println(found.toString());
        }

        found = skole1.findStuderende(1337);
        if (found != null) {
            System.out.println(found.toString());
        }


        s1.addKaraker(12);
        s1.addKaraker(12);
        s1.addKaraker(12);
        s2.addKaraker(0);
        s2.addKaraker(-3);
        s2.addKaraker(0);
        s2.addKaraker(2);
        s2.addKaraker(2);

        System.out.println(skole1.gennemsnit());
    }
}
