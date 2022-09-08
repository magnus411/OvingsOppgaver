/**
 * It's a program that asks for your name, age, salary, and tax rate, and then gives you the option to
 * print out your tax rate per month, per year, your age, how many years you've worked at the company,
 * and whether you've worked at the company for a certain number of years
 */
package ovinger.Oving8;

import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class

import javax.sql.rowset.spi.SyncResolver;

public class Client {

    public static void main(String[] args) {

        ArrayList<ArbTaker> database = new ArrayList<>();
        // System.out.println(personer.get(0).person.eNavn);
        // personer.add(taker1);
        // personer.add(taker2);

        // Person per2 = new Person("Magsdnus", "Gjersdstad");

        /*
         * Lager et ArbeidsTaker objekt som inneholder
         * Personen
         * Ansettelsesår
         * Månedslønn
         * Skatteprosent
         */
        // ArbTaker taker = new ArbTaker(per, 1, 2020, 10000, 10);

        // System.out.println(taker.getPerson().eNavn);
        System.out.println(
                "Hei på dei! 2I dette systemet får du muligheten til å finne informasjon om dine arbeidsforhold.");
        System.out.println("La oss starte med å legge inn litt info. Hva er ditt fornavn og etternavn?");

        System.out.println("Fornavn: ");
        Scanner input = new Scanner(System.in);
        String fornavn = input.nextLine();
        System.out.println("Etternavn: ");
        Scanner input2 = new Scanner(System.in);
        String etternavn = input2.nextLine();
        System.out.println("Fødselsår");
        Scanner input12 = new Scanner(System.in);
        int fodselsaar = input12.nextInt();

        Person per = new Person(fornavn, etternavn, fodselsaar);
        System.out.println("");

        System.out.println("Ok. Skriv så inn følgene info i denne rekkefølgen. Trykk enter for hver linje.");
        System.out.println("Arbeidsnummer");
        System.out.println("Ansettelsesår");
        System.out.println("Månedslønn");
        System.out.println("Skatteprosent");

        Scanner input3 = new Scanner(System.in);
        int arbeidstakernr = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        int ansettelsesår = input4.nextInt();
        Scanner input5 = new Scanner(System.in);
        int maanedslønn = input5.nextInt();
        Scanner input6 = new Scanner(System.in);
        int skatteprosent = input6.nextInt();

        ArbTaker taker1 = new ArbTaker(per, arbeidstakernr, ansettelsesår, maanedslønn, skatteprosent);
        System.out.println("");

        System.out.println("Perfekt!!! Godt å se deg " + taker1.getNavn() + "!!!");

        // While exit == 1
        int sjekk = 1;
        do {
            System.out.println("");
            System.out.println("Nå, hva vil du gjøre? Du får følgene valg");
            System.out.println("1: Se Skattetrekk per måned");
            System.out.println("2: Se Skattetrekk per år");
            System.out.println("3: Se Alder");
            System.out.println("4: Se Antall år i bedriften");
            System.out.println("5: Sjekk om du har vært ansatt i x antall år");
            System.out.println("6: Se all info om deg selv");
            System.out.println("7: Exit");
            System.out.println("");

            Scanner input7 = new Scanner(System.in);
            int valg = input7.nextInt();

            switch (valg) {

                case 1:
                    System.out.println("Du har kr" + taker1.getSkatteTrekkPerMaaned() + "i skattetrekk per måned");
                    break;

                case 2:
                    System.out.println("Du trekkes" + taker1.getSkatteTrekkPerAar() + "Kr i skatt per år");
                    break;
                case 3:
                    System.out.println("Du er " + taker1.getAlder() + "år gammel");
                    break;

                case 4:
                    System.out.println("Du har vært ansatt i " + taker1.getAntallAar() + "år");
                    break;
                case 5:
                    System.out.println("Hvor mange år tror du at du har vært ansatt?");
                    Scanner input8 = new Scanner(System.in);
                    int antallAar = input8.nextInt();
                    if (taker1.ansattMerEnn(antallAar)) {
                        System.out.println("Du har vært ansatt i " + antallAar + "år");
                    } else {
                        System.out.println("Du har ikke vært ansatt i " + antallAar + "år");
                    }
                    break;
                case 6:
                    System.out.println("Her er masse info om deg selv");
                    System.out.println("Navn: " + taker1.getNavn());
                    System.out.println("Alder: " + taker1.getAlder());
                    System.out.println("Antall år i bedriften: " + taker1.getAntallAar());
                    System.out.println("Ansattnr: ");
                    System.out.println(taker1.getArbeidstakernr());
                    System.out.println("Månedslønn: " + taker1.getMaanedslønn());

                    System.out.println("Skatteprosent: " + taker1.getSkatteprosent() + "%");
                    System.out.println("Fødselsår: " + taker1.getFodselsaar());
                    break;
                case 7:
                    System.out.println("Lukker programmet");
                    System.exit(0);

            }

        } while (sjekk == 1);

    }
}
