/**
 * It's a class that represents a menu, and it contains a list of dishes
 */
package ovinger.Oving10.op2;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Et klasse som for å lage menyer.
 * 
 * @author Magnus Gjerstad
 * @version 1.0
 * @magnus411
 */
public class Meny {

    public ArrayList<Rett> rett;
    String navn;

    /**
     * Konstruktør for menyen
     * 
     * @param navn Tar inn navn på menyen
     * @param rett Tar inn Rett objekt og legger den til i en ArrayList
     * 
     */
    public Meny(String navn, Rett rett) {
        this.navn = navn;
        this.rett = new ArrayList<Rett>();
        this.rett.add(rett);
    }

    /**
     * Denne metoden legger til en rett i menyen
     * {@link Rett}
     * 
     * @param rett Tar inn en Rett objektet som skal legges til
     */
    public void leggTilRett(Rett rett) {
        this.rett.add(rett);
    }

}
