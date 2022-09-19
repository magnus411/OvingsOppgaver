/**
 * It's a class that simulates a dice game between two players
 */
package ovinger.Oving4;

import java.util.Random;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Terning {

    private String player;
    private int sum;

    Terning() {
        this.sum = 0;
    }

    Terning(String name) {
        this.player = name;
        this.sum = 0;
    }

    /**
     * @return String
     */
    public String getPlayer() {
        return player;
    }

    /**
     * @return int
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum
     */
    public void setSum(int sum) {
        this.sum = sum;
    }

    /**
     * @return boolean
     */
    private boolean erFerdig() {

        return this.sum >= 100;

    }

    /**
     * If the random number is not 1, add it to the sum, otherwise set the sum to 0.
     */
    private void kastTerning() {
        // It creates a new object of the class Random.
        Random random = new Random();
        int n = random.nextInt(6);
        if (n == 1) {
            this.sum = 0;

        } else {
            this.sum += n;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        // It creates two new objects of the class Terning, and sets the name of the
        // player.
        Terning P1 = new Terning("Magnus");
        Terning P2 = new Terning("Lars");

        int i = 0;

        // It's a do while loop that runs until one of the players has a sum of 100 or
        // more.
        do {
            i++;
            P1.kastTerning();
            P2.kastTerning();

        } while (!P1.erFerdig() && !P2.erFerdig());

        System.out.println(i + " antall iterasjoner");

        System.out.println(P1.getPlayer() + " sin sum " + P1.getSum());
        System.out.println(P2.getPlayer() + " sin sum " + P2.getSum());

    }
}
