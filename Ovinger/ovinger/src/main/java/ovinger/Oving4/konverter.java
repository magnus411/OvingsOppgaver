
package ovinger.Oving4;

import java.util.Scanner; // Import the Scanner class

public class konverter {

    // Creating new objects of the class Valuta.
    Valuta dollar = new Valuta(9.70);
    Valuta euro = new Valuta(9.76);
    Valuta sek = new Valuta(0.92);

    /**
     * The function takes∏ an input from the user, and then converts the input to
     * the
     * currency the user
     * wants
     */
    public void valg() {

        String valg = "hei";

        Scanner scan = new Scanner(System.in);
        System.out.println("Hvilken valuta vil du konvertere fra / til?");

        System.out.println("1: dollar");
        System.out.println("2: euro");
        System.out.println("3: sek");
        System.out.println("4:avslutt");
        int input = scan.nextInt();

        System.out.println("Hvor mye penger ønsker de å konvertere?");
        int cash = scan.nextInt();

        // close();

        if (input == 1) {
            System.out.println(cash + " dollar er:");
            System.out.println(dollar.toNOK(cash));
            System.out.println("Norske Kroner");

            System.out.println("-------");
            System.out.println("og " + cash + " Norske Kroner er: ");
            System.out.println(sek.fromNOK(cash));
            System.out.println("Dollar");

        } else if (input == 2) {
            System.out.println(cash + " euro er:");
            System.out.println(euro.toNOK(cash));
            System.out.println("Norske Kroner");

            System.out.println("-------");
            System.out.println("og " + cash + " Norske Kroner er: ");
            System.out.println(sek.fromNOK(cash));
            System.out.println("Euro");

        } else if (input == 3) {
            System.out.println(cash + " Svenske Kroner er:");
            System.out.println(sek.toNOK(cash));
            System.out.println("Norske Kroner");

            System.out.println("-------");
            System.out.println("og " + cash + " Norske Kroner er: ");
            System.out.println(sek.fromNOK(cash));
            System.out.println("Norske Kroner");

        } else if (input == 4) {

            System.exit(0);
        } else {
            System.out.println("Feil input!");
        }

    }

    /**
     * The main function is the starting point of the program
     */
    public static void main(String[] args) {

        // It creates a new object of the class konverter.
        konverter start = new konverter();

        start.valg();

    }
}
