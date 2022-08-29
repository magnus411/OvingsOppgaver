package ovinger.Oving3;

import java.util.Scanner;  // Import the Scanner class


public class Lokke {
    


    private void loop(int[] mellom) {

        int b = 0;
        do {
            System.out.println("-----Starttall-----");
            do {
                b++;
                System.out.println(mellom[0]*b);


            } while(b<=10);
            mellom[0]++;
            b = 0;

        } while(mellom[0]<=mellom[1]);
        

    }






    static public void main(String[] args) {


        Scanner scan = new Scanner(System.in);  
        System.out.println("Skriv inn et tall");
        int mellomA = scan.nextInt();
        System.out.println("Skriv inn et annet tall");
        int mellomB = scan.nextInt();
        

        Lokke kjør = new Lokke();

        int[] m = new int[]{mellomA,mellomB};


        kjør.loop(m);

        
        



    }
}
