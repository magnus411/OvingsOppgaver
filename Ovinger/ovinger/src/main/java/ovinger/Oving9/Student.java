package ovinger.Oving9;

public class Student {

    // antOppg holder orden på hvor mange av de oppgavene studenten har levert inn,
    // som er godkjent.
    private String navn;
    private int antOppg;

    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAntOppg(int antOppg) {
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void økAntOppg(int økning) {
        antOppg = antOppg + økning;

    }

    public String toString() {
        return navn + " " + antOppg + " ";
    }

}
