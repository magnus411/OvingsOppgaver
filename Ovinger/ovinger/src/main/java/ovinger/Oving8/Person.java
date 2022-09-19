package ovinger.Oving8;

public class Person {

    public String fNavn;
    public String eNavn;
    public int fodselsaar;

    Person(String fNavn, String eNavn, int fodselsaar) {
        this.fNavn = fNavn;
        this.eNavn = eNavn;
        this.fodselsaar = fodselsaar;
    }

    /**
     * @return String
     */
    public String getfNavn() {
        return fNavn;
    }

    /**
     * @return String
     */
    public String geteNavn() {
        return eNavn;
    }

    /**
     * @return int
     */
    public int getFodselsaar() {
        return fodselsaar;
    }
}
