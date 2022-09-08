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

    public String getfNavn() {
        return fNavn;
    }

    public String geteNavn() {
        return eNavn;
    }

    public int getFodselsaar() {
        return fodselsaar;
    }
}
