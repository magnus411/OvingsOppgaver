package ovinger.Oving10.op2;

import ovinger.Oving10.op2.Rett.Type;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Main er et klientprogrammet
 * 
 * Se: {@link Rett} og {@link Meny}
 * 
 * 
 * 
 */
public class Klient {

    public static void main(String[] args) {

        MenyRegister menyRegister = new MenyRegister();

        while (true) {

            System.out.println("------MENY PROGRAM----------");
            System.out.println("Du får følgene valg:");
            System.out.println("1: Registrer en ny rett");
            System.out.println("2: Finn rett basert på navn");
            System.out.println("3: Finn alle retter basert på type");
            System.out.println("4: Registrer en ny meny");
            System.out.println("5: Finn alle menyer innen en gitt totalpris");
            System.out.println("6: Print alt");
            System.out.println("7: Exit");

            Scanner scanner = new Scanner(System.in);
            int valg = scanner.nextInt();

            switch (valg) {

                case 1:
                    System.out.println("Registrer en ny rett");
                    System.out.println("Hvilken rett vil du registrere?");
                    System.out.println("Skriv inn følgende:");
                    System.out.println("Type:");
                    System.out.println("Navn:");
                    System.out.println("Beskrivelse:");
                    System.out.println("Ingredienser:");
                    System.out.println("Pris");
                    System.out.println("--------------------");

                    Scanner scanner11 = new Scanner(System.in);
                    String type5 = scanner11.nextLine();

                    Scanner scanner12 = new Scanner(System.in);
                    String navn5 = scanner12.nextLine();

                    Scanner scanner13 = new Scanner(System.in);
                    String beskrivelse5 = scanner13.nextLine();

                    Scanner scanner14 = new Scanner(System.in);
                    String ingredienser5 = scanner14.nextLine();

                    Scanner scanner15 = new Scanner(System.in);
                    int pris5 = scanner15.nextInt();

                    Rett rett2 = new Rett(Type.valueOf(type5), navn5, beskrivelse5, ingredienser5, pris5);

                    System.out.println("Da er retten lagd!");
                    System.out.println(rett2.toString());
                    System.out.println("--------------------");
                    System.out.println("Hvilken meny vil du legge den til i?");
                    menyRegister.listeOverMenyer();

                    Scanner input8 = new Scanner(System.in);
                    String menyer5 = input8.nextLine();

                    menyRegister.leggTilRettIMeny(menyer5, rett2);
                    System.out.println("Rett lagt til i menyen!");
                    System.out.println("--------------------");
                    break;
                case 2:
                    System.out.println("Finn rett basert på navn");
                    System.out.println("Skriv inn navn på retten:");
                    Scanner scanner2 = new Scanner(System.in);
                    String navn = scanner2.nextLine();
                    System.out.println("--------------------");
                    menyRegister.finnRettGittNavn(navn);
                    break;

                case 3:
                    System.out.println("Finn alle retter basert på type");
                    System.out.println("Skriv inn type på retten:");
                    Scanner scanner3 = new Scanner(System.in);
                    String type = scanner3.nextLine();
                    System.out.println("--------------------");
                    menyRegister.finnRettGittType(Type.valueOf(type));
                    break;

                case 4:
                    System.out.println("Registrer en ny meny");
                    System.out.println("Skriv inn navn på menyen:");
                    Scanner scanner4 = new Scanner(System.in);
                    String navn2 = scanner4.nextLine();
                    System.out.println("--------------------");
                    System.out.println("Kult! Nå kan du legge til en rett i den nye menyen");
                    System.out.println("Start med å lag en rett");
                    System.out.println("Skriv inn følgende:");
                    System.out.println("Type:");
                    System.out.println("Navn:");
                    System.out.println("Beskrivelse:");
                    System.out.println("Ingredienser:");
                    System.out.println("Pris");
                    System.out.println("--------------------");

                    Scanner scanner5 = new Scanner(System.in);
                    String type3 = scanner5.nextLine();

                    Scanner scanner6 = new Scanner(System.in);
                    String navn3 = scanner6.nextLine();

                    Scanner scanner7 = new Scanner(System.in);
                    String beskrivelse = scanner7.nextLine();

                    Scanner scanner8 = new Scanner(System.in);
                    String ingredienser = scanner8.nextLine();

                    Scanner scanner9 = new Scanner(System.in);
                    int pris = scanner9.nextInt();

                    Rett rett = new Rett(Type.valueOf(type3), navn3, beskrivelse, ingredienser, pris);

                    menyRegister.lagNyMeny(navn2, rett);
                    System.out.println("Da er menyen og retten registrert");
                    break;

                case 5:
                    System.out.println("Finn alle menyer innen en gitt totalpris");
                    System.out.println("Skriv inn en totalpris:");
                    Scanner scanner10 = new Scanner(System.in);
                    int total = scanner10.nextInt();

                    menyRegister.menyTotalPris(total);
                    break;
                case 6:
                    System.out.println("Print alt");
                    menyRegister.skrivUtMeny();

                    break;
                case 7:
                    System.exit(0);
                    break;
            }

        }

    }
}
