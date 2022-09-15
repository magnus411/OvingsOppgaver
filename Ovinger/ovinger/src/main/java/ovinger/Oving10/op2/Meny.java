package ovinger.Oving10.op2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Meny {

    // public Rett rett;
    public ArrayList<Rett> rett;
    String navn;

    public Meny(String navn, Rett rett) {
        this.navn = navn;
        this.rett = new ArrayList<Rett>();
        this.rett.add(rett);
    }

    public void leggTilRett(Rett rett) {
        this.rett.add(rett);
    }

}
