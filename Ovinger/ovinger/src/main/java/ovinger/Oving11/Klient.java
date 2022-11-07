package ovinger.Oving11;

import java.util.Scanner;

public class Klient {

    private static int menuChoice;

    /**
     * Presents the menu for the user, and awaits input from the user. The menu *
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1. *
     *         If 0 is returned, the user has entered a wrong value
     */

    public static void main(String[] args) {
        RealEstateRegister eiendomsRegister = new RealEstateRegister();
        System.out.println("You have chosen to add a property");

        /**
         * Presents the menu for the user, and awaits input from the user. The menu *
         * choice selected by the user is being returned.
         *
         * @return the menu choice by the user as a positive number starting from 1. *
         *         If 0 is returned, the user has entered a wrong value
         */
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        System.out.println("5. Get unique IDs");
        System.out.println("6. Get number of real estates");
        System.out.println("7. Remove property");
        System.out.println("9. Quit");
        System.out.println("\nPlease enter a number between 1 and 9.\n");
        Scanner sc = new Scanner(System.in);
        int menuChoice = sc.nextInt();

        switch (menuChoice) {
            case 1:
                System.out.println("You have chosen to add a property");
                System.out.println("Please enter the following information");
                System.out.println("");
                System.out.println("municipality name: ");
                System.out.println("municipality number: ");
                System.out.println("lot number: ");
                System.out.println("section number: ");
                System.out.println("Name: ");
                System.out.println("Area: ");
                System.out.println("Owner: ");

                Scanner sc1 = new Scanner(System.in);
                String municipalityName = sc1.nextLine();
                Scanner sc2 = new Scanner(System.in);
                int municipalityNumber = sc2.nextInt();
                Scanner sc3 = new Scanner(System.in);
                int lotNumber = sc3.nextInt();
                Scanner sc4 = new Scanner(System.in);
                int sectionNumber = sc4.nextInt();
                Scanner sc5 = new Scanner(System.in);
                String name = sc5.nextLine();
                Scanner sc6 = new Scanner(System.in);
                int area = sc6.nextInt();
                Scanner sc7 = new Scanner(System.in);
                String owner = sc7.nextLine();

                eiendomsRegister.createRealEstate(municipalityName, municipalityNumber, lotNumber, sectionNumber, name,
                        area, owner);
                break;

            case 2:
                System.out.println("You have chosen to list all properties");
                System.out.println(eiendomsRegister.printRealEstate());
                break;
            case 3:
                System.out.println("You have chosen to search for a property");
                System.out.println("Please enter the following information");
                System.out.println("");
                System.out.println("Municipality number:");
                System.out.println("Lot number: ");
                System.out.println("Section number: ");
                System.out.println("");

                Scanner sc8 = new Scanner(System.in);
                int municipalityNumber1 = sc8.nextInt();
                Scanner sc9 = new Scanner(System.in);
                int LotNr1 = sc9.nextInt();
                Scanner sc10 = new Scanner(System.in);
                int SectionNr1 = sc10.nextInt();
                System.out.println(eiendomsRegister.getRealEstateByMLS(municipalityNumber1, LotNr1, SectionNr1));
                break;

            case 4:
                System.out.println("You have chosen to calculate the average area");
                System.out.println(eiendomsRegister.getRealEstateAvrArea());
                break;
            case 5:
                System.out.println("You have chosen to get unique IDs");
                System.out.println(eiendomsRegister.getUniqueIDforAll());
                break;
            case 6:
                System.out.println("You have chosen to get number of real estates");
                System.out.println(eiendomsRegister.getNumberOfRealEstate());
                break;
            case 7:
                System.out.println("You have chosen to remove a property");
                System.out.println("Please enter the following information");
                System.out.println("");
                System.out.println("Municipality name:");
                System.out.println("Municipality number: ");
                System.out.println("");

                sc11 = new Scanner(System.in);
                String municipalityName2 = sc11.nextLine();
                sc12 = new Scanner(System.in);
                int municipalityNumber2 = sc12.nextInt();
                System.out.println();

                System.out.println("Is this the property you want to remove?");
                System.out.println(getRealEstateByMunicipality(municipalityName2, municipalityNumber2));

                System.out.println("Please enter Y or N");
                Scanner sc13 = new Scanner(System.in);
                String answer = sc13.nextLine();
                if (answer.equals("Y")) {
                    eiendomsRegister.deleteRealEstate(municipalityName2, municipalityNumber2);
                } else {
                    System.out.println("You have chosen to not remove the property");
                }
                break;
        }
    }
}