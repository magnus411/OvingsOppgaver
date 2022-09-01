package ovinger.Oving6;


import java.lang.ProcessHandle.Info;
import java.util.random.*;
public class RandomOppgave {

    java.util.Random random = new java.util.Random();

    public void gen(){

        int[] antall = new int[10];

        for (int i = 0; i < 10000; i++) {
            int tall = random.nextInt(10);

            antall[tall] = antall[tall] +1;
        }


        for (int i = 0; i < antall.length; i++) {
            System.out.println("antal ganger " + i);
            System.out.println(antall[i]);
        }
    }

    public static void main(String[] args) {
    
        RandomOppgave kjør = new RandomOppgave();

        kjør.gen();


    }
}
