package ovinger.Oving4;
import java.util.Random;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Terning {
    
    
    private String player;
    private int sum;

    Terning() {

    }

    Terning(String name) {
        this.player = name;
        this.sum = 0;
    }
    
    

    public String getPlayer() {
        return player;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private boolean erFerdig() {
        //System.out.println("sasdsd");
        if (this.sum >= 100) {
            return true;
        } else {
            return false;
        }
    }

    private void kastTerning() {
        Random random = new Random();
        int n = random.nextInt(1,6);
        if (n != 1) {
            this.sum += n;
        } else {
            this.sum = 0;
        }
        //System.out.println(n);
    }

    public static void main(String[] args) {

        
        Terning P1 = new Terning("magnus");
        Terning P2 = new Terning("Lars");

        int i = 0;
        do {
            i+= 1;
            P1.kastTerning();
            P2.kastTerning();
            
            
        } while (P1.erFerdig() == false || P2.erFerdig() == false);


        System.out.println(i + " antall iterasjoner");

        System.out.println(P1.getPlayer() + " sin sum " + P1.getSum());
        System.out.println(P2.getPlayer() + " sin sum " + P2.getSum());



    }
}
