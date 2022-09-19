
package ovinger.Oving10.op1;

import java.util.Scanner;

public class Klient {

    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();

        while (true) {
            System.out.println("");
            System.out.println("Du får følgene valg:");

            System.out.println("1: Legg til arrangement");
            System.out.println("2: Finn arrangement med dato");
            System.out.println("3: Finn arrangement med sted");
            System.out.println("4: Finn arrangement mellom to datoer");
            System.out.println("5: Se alle arrangement");
            System.out.println("6: Exit");
            System.out.println("");

            Scanner in = new Scanner(System.in);
            int input = in.nextInt();

            switch (input) {

                case 1:
                    System.out.println("Skriv inn følgene informasjon:");

                    System.out.println("Nummer:");
                    System.out.println("Navn:");
                    System.out.println("Sted:");
                    System.out.println("Type:");
                    System.out.println("Tidspunkt:");
                    System.out.println("Arrangør:");

                    Scanner in2 = new Scanner(System.in);
                    int nummer = in2.nextInt();

                    Scanner in3 = new Scanner(System.in);
                    String navn = in3.nextLine();

                    Scanner in4 = new Scanner(System.in);
                    String sted = in4.nextLine();

                    Scanner in5 = new Scanner(System.in);
                    String type = in5.nextLine();

                    Scanner in6 = new Scanner(System.in);
                    String tidspunkt = in6.nextLine();

                    Scanner in7 = new Scanner(System.in);
                    String arrangor = in7.nextLine();

                    register.addArrangement(nummer, navn, sted, type, tidspunkt, arrangor);

                    System.out.println("Arrangementet er lagt til");

                    break;
                case 2:
                    System.out.println("Skriv inn dato på arrangementet");

                    Scanner in8 = new Scanner(System.in);
                    String dato = in8.nextLine();

                    register.finnArrangementDato(dato);
                    break;

                case 3:
                    System.out.println("Skriv inn sted på arrangementet");

                    Scanner in9 = new Scanner(System.in);
                    String sted2 = in9.nextLine();

                    register.finnArrangementSted(sted2);
                    break;

                case 4:
                    System.out.println("Skriv inn startdato på arrangementet");
                    System.out.println("Skriv inn sluttdato på arrangementet");

                    Scanner in10 = new Scanner(System.in);
                    String startdato = in10.nextLine();

                    Scanner in11 = new Scanner(System.in);
                    String sluttdato = in11.nextLine();

                    register.finnArrangementMellom(startdato, sluttdato);
                    break;

                case 5:
                    System.out.println("Her er alle arrangementene");

                    register.finnArrangement();
                    break;

                case 6:
                    System.out.println("Avslutter programmet");
                    System.exit(0);

            }
        }

    }
}
