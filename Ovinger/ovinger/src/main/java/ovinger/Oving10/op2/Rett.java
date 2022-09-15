package ovinger.Oving10.op2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Rett {

    String navn;
    String beskrivelse;
    int pris;
    ArrayList<String> rets;
    String ingredienser;

    enum Type {
        FROKOST,
        MIDDAG,
        KVELDSMAT,
    }

    Type type;

    public Rett() {
    }

    public Rett(Type type, String navn, String beskrivelse, String ingredienser, int pris) {

        this.type = type;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.ingredienser = ingredienser;
        this.pris = pris;
    }

}
