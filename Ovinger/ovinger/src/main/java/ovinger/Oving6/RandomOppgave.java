package ovinger.Oving6;

import java.util.Random;

public class RandomOppgave {

    Random random = new Random();

    /**
     * It generates 10000 random numbers between 0 and 9, and then counts how many
     * times each number
     * appears
     */
    public void gen() {

        int[] antall = new int[10];

        for (int i = 0; i < 10000; i++) {
            int tall = random.nextInt(10);

            antall[tall] = antall[tall] + 1;
        }

        for (int i = 0; i < antall.length; i++) {
            System.out.println("antal ganger " + i);
            System.out.println(antall[i]);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        // It creates a new object of the class RandomOppgave.
        RandomOppgave kjør = new RandomOppgave();

        kjør.gen();

    }
}
