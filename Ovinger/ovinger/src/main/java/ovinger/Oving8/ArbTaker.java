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
    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    public int getFodselsaar() {
        return fodselsaar;
    }

    public int getMaanedslønn() {
        return maanedslønn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public int getAlder() {
        return aar - fodselsaar;
    }

    public String getNavn() {
        return person.eNavn + " " + person.fNavn;
    }

    public int getAntallAar() {
        return aar - ansettelsesår;
    }

    public double getSkatteTrekkPerMaaned() {
        return (maanedslønn * skatteprosent) / 100;
    }

    public double getBruttoLønnPerAar() {
        return maanedslønn * 12;
    }

    public double getSkatteTrekkPerAar() {
        return getSkatteTrekkPerMaaned() * 11.5;
    }

    public double getNettoLønnPerAar() {
        return getBruttoLønnPerAar() - getSkatteTrekkPerAar();
    }

    public boolean ansattMerEnn(int antallAar) {
        if (getAntallAar() > antallAar) {
            return true;
        } else {
            return false;
        }
    }

}
