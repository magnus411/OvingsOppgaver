/**
 * A class that represents an employee, with attributes for name, employee number, year of employment,
 * monthly salary and tax percentage
 */
package ovinger.Oving8;

import java.util.GregorianCalendar;

public class ArbTaker {
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);

    Person person;
    int fodselsaar;

    int arbeidstakernr;
    int ansettelsesår;
    int maanedslønn;
    double skatteprosent;

    /**
     * 
     * @param person         Tar inn person objektet med fornavn og etternavn
     * @param arbeidstakernr tar inn arbeidsnummeret
     * @param ansettelsesår  tar inn ansettelsesår
     * @param maanedslønn    tar inn månedslønn
     * @param skatteprosent  tar inn skatteprosent
     */
    ArbTaker(Person person, int arbeidstakernr, int ansettelsesår, int maanedslønn, int skatteprosent) {

        this.person = person;
        this.fodselsaar = person.fodselsaar;

        this.arbeidstakernr = arbeidstakernr;
        this.ansettelsesår = ansettelsesår;
        this.maanedslønn = maanedslønn;
        this.skatteprosent = skatteprosent;

    }

    /*
     * GET METODER
     */

    /**
     * 
     * @return arbeidstakernr
     */
    public int getArbeidstakernr() {
        return arbeidstakernr;
    }

    /**
     * 
     * @return ansettelsesår
     */
    public void setMaanedsLønn(int newLonn) {
        this.maanedslønn = newLonn;
    }

    /**
     * @param skatteprosent
     */
    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    /**
     * @return int
     */
    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    /**
     * @return int
     */
    public int getFodselsaar() {
        return fodselsaar;
    }

    /**
     * @return int
     */
    public int getMaanedslønn() {
        return maanedslønn;
    }

    /**
     * @return double
     */
    public double getSkatteprosent() {
        return skatteprosent;
    }

    /**
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return Person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @return int
     */
    public int getAlder() {
        return aar - fodselsaar;
    }

    /**
     * @return String
     */
    public String getNavn() {
        return person.eNavn + " " + person.fNavn;
    }

    /**
     * @return int
     */
    public int getAntallAar() {
        return aar - ansettelsesår;
    }

    /**
     * @return double
     */
    public double getSkatteTrekkPerMaaned() {
        return (maanedslønn * skatteprosent) / 100;
    }

    /**
     * @return double
     */
    public double getBruttoLønnPerAar() {
        return maanedslønn * 12;
    }

    /**
     * @return double
     */
    public double getSkatteTrekkPerAar() {
        return getSkatteTrekkPerMaaned() * 11.5;
    }

    /**
     * @return double
     */
    public double getNettoLønnPerAar() {
        return getBruttoLønnPerAar() - getSkatteTrekkPerAar();
    }

    /**
     * @param antallAar
     * @return boolean
     */
    public boolean ansattMerEnn(int antallAar) {
        return getAntallAar() > antallAar;

    }

}
