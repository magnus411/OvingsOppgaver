package ovinger.Oving10.op2;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * En klasse for å lage retter
 * 
 * @author Magnus Gjerstad
 * 
 */
public class Rett {

    String navn;
    String beskrivelse;
    int pris;
    ArrayList<String> rets;
    String ingredienser;

    /**
     * Lager ulike typer retter
     */
    enum Type {
        FORRETT,
        HOVEDRETT,
        DESSERT,
    }

    Type type;

    public Rett() {
    }

    /**
     * Denne metoden lager en rett.
     * 
     * @param type         Typen til retten
     * @param navn         Navnet til retten
     * @param beskrivelse  Beskrivelse av retten
     * @param ingredienser Indigrensene til retten
     * @param pris         Prisen til retten
     */
    public Rett(Type type, String navn, String beskrivelse, String ingredienser, int pris) {

        this.type = type;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.ingredienser = ingredienser;
        this.pris = pris;
    }

    /**
     * ToString metode
     * 
     * @return String
     */
    public String toString() {
        return "Rett{" +
                "type=" + type +
                ", navn='" + navn + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", ingredienser='" + ingredienser + '\'' +
                ", pris=" + pris +
                '}';
    }

}
