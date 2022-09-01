package ovinger.Oving5;



import java.util.Random;


public class MinRandom {


    Random ran = new Random();

    public int nesteHeltall(int nedre, int ovre) {

        //int next = ran.nextInt(nedre,ovre);
        int range = ovre - nedre + 1;
        int next = ran.nextInt(range) + nedre;

        return next;
    }

    public double nesteDesimaltall(double nedre, double ovre) {


        double next = nedre + (ovre-nedre) * ran.nextDouble();

        return next;

    }


    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();


        System.out.println("Printer random tall mellom 2 og 5");
        for (int i = 0; i < 10; i++) {
            int neste2 = minRandom.nesteHeltall(2, 5);

            if (neste2 > 5 || neste2 < 2) {
                System.out.println("FEIL FEIL FEIL");
            } else {
                System.out.println(neste2);

            }
            

        }

        System.out.println("Printer random desimaltall mellom 8 og 9");
        for (int i = 0; i < 10; i++) {
            double neste = minRandom.nesteDesimaltall(8, 10);


            if (neste > 10 || neste < 8) {
                System.out.println("FEIL FEIL FEIL");
            } else {
                System.out.println(neste);

            }
            System.out.println(neste);

        }

    }
}
