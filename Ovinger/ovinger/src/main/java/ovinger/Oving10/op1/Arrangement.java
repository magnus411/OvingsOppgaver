
package ovinger.Oving10.op1;

/**
 * 
 * 881 LINJER MED KODE BBY!!!!!!!!
 * 2482 antall ord!!!!
 */

import java.util.ArrayList;

/**
 * En klasse for å arrangement
 * 
 * @author Magnus Gjerstad
 * @version 0.1
 * @description En klasse for å arrangement
 */
public class Arrangement {

    int nummer;
    String navn;
    String sted;
    String arrangør;

    enum Type {
        KONSERT,
        BARNETEATER,
        TEATER,
        FOREDRAG,
    }

    Type type;
    String tidspunkt;
    String dato;

    public Arrangement() {

    }

    /**
     * Denne metoden lager et nytt arrangement og legger det til i
     * ArrangementRegister.
     * 
     * @param nummer    nummeret til arrangementet
     * @param navn      navnet til arrangementet
     * @param sted      stedet til arrangementet
     * @param type      typen til arrangementet
     * @param tidspunkt tidspunktet til arrangementet
     * @param arrangør  Arrangør til arrangementet
     * @param date      Datoen til arrangemen
     */

    public Arrangement(int nummer, String navn, String sted, Type type, String tidspunkt, String arrangør) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.type = type;
        this.tidspunkt = tidspunkt;

        this.dato = tidspunkt.substring(0, 8);
        this.arrangør = arrangør;

    }

    public Arrangement(Arrangement arrangement) {
        arrangement.getArrangør();
    }

    /**
     * Henter nummeret til arrangementet
     * 
     * @return int
     */
    public int getNummer() {
        return nummer;
    }

    /**
     * Setter nummeret til arrangementet
     * 
     * @param nummer
     * 
     */
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    /**
     * Henter navnet til Arrangement
     * 
     * @return String
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Setter navnet til arrangementet
     * 
     * @param navn
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    /**
     * Henter stedet til arrangementet
     * 
     * @return String
     */
    public String getSted() {
        return sted;
    }

    /**
     * Setter stedet til arrangementet
     * 
     * @param sted
     */
    public void setSted(String sted) {
        this.sted = sted;
    }

    /**
     * Henter arrangør til arrangementet
     * 
     * @return String
     */
    public String getArrangør() {
        return arrangør;
    }

    /**
     * Setter arrangør til arrangementet
     * 
     * @param arrangør
     */
    public void setArrangør(String arrangør) {
        this.arrangør = arrangør;
    }

    /**
     * Henter hvilken type arrangement det er
     * 
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * Setter hvilken type arrangement det er
     * 
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Henter tidspunktet til arrangementet
     * 
     * @return String
     */
    public String getTidspunkt() {
        return tidspunkt;
    }

    /**
     * Setter tidspunktet til arrangementet
     * 
     * @param tidspunkt
     */
    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    /**
     * Henter datoen til arrangementet
     * 
     * @return String
     */
    public String getDato() {
        return this.dato;
    }

    /**
     * @return String
     */
    public String toString() {
        return "Arrangement [nummer=" + nummer + ", navn=" + navn + ", sted=" + sted + ", tidspunkt= " + tidspunkt
                + ", type=" + type + ", arrangør="
                + arrangør + "]";
    }

}
