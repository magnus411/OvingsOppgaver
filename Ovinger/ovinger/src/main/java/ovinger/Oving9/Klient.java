package ovinger.Oving9;

import java.util.Scanner;

public class Klient {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Oppgaveoversikt oversikt = new Oppgaveoversikt();

        System.out.println(oversikt.getAntStud());
        while (true) {
            System.out.println("Hallo! Her får du milighet til en rekke ting:)");
            System.out.println("1: Finn antall studenter registrert");
            System.out.println("2: Finn antall oppgaver en spesifik student har løst");
            System.out.println("3: Registrer en ny student");
            System.out.println("4: Øk antall oppgaver til en spesifik student");
            System.out.println("5: Søk etter student");
            System.out.println("6: Exit");

            Scanner in = new Scanner(System.in);
            int input = in.nextInt();

            switch (input) {

                case 1:
                    System.out.println(oversikt.getAntStud());
                    break;
                case 2:
                    System.out.println("Skriv inn et navn");
                    Scanner in2 = new Scanner(System.in);
                    String inputNavn = in2.nextLine();
                    System.out
                            .println(inputNavn + " har gjort " + oversikt.finnAntallOppgaver(inputNavn) + " oppgaver");
                    break;
                case 3:
                    System.out.println("Ok så du vil registrere en ny student");
                    System.out.println("Hva er navnet til studenten?");

                    Scanner in3 = new Scanner(System.in);
                    String inputStudent = in3.nextLine();
                    System.out.println("Hvor mange oppgaver har " + inputStudent + " gjort?");

                    Scanner in4 = new Scanner(System.in);
                    int inputAntall = in4.nextInt();

                    oversikt.update(inputStudent, inputAntall);
                    System.out.println("Da er studenten registrert");

                    break;
                case 4:
                    System.out.println("Ok, så du vil øke antall oppgaver");
                    System.out.println("Hva er navnet til studenten?");

                    Scanner in5 = new Scanner(System.in);
                    String inputStudent2 = in5.nextLine();

                    System.out.println("Hvor mange oppgaver skal vi økte til?");
                    Scanner in6 = new Scanner(System.in);
                    int inputAntall2 = in6.nextInt();

                    oversikt.endreAntallOppgaver(inputStudent2, inputAntall2);

                    break;
                case 5:
                    System.out.println("Søk etter en spesifik student");
                    System.out.println("Skriv inn navnet til studenten");
                    Scanner in7 = new Scanner(System.in);
                    String inputStudent3 = in7.nextLine();
                    System.out.println("Info om studenten");
                    System.out.println(oversikt.getStudent(inputStudent3).toString());
                case 6:
                    System.exit(0);

            }
        }

    }
}
