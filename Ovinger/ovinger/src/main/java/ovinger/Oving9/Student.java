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

    /**
     * @param navn
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    /**
     * @param antOppg
     */
    public void setAntOppg(int antOppg) {
        this.antOppg = antOppg;
    }

    /**
     * @return String
     */
    public String getNavn() {
        return navn;
    }

    /**
     * @return int
     */
    public int getAntOppg() {
        return antOppg;
    }

    /**
     * @param økning
     */
    public void økAntOppg(int økning) {
        antOppg = antOppg + økning;

    }

    /**
     * @return String
     */
    public String toString() {
        return navn + " " + antOppg + " ";
    }

}
