package ovinger.Oving10.op1;

import java.util.ArrayList;

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

    public Arrangement(int nummer, String navn, String sted, Type type, String tidspunkt, String arrangør) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.type = type;
        this.tidspunkt = tidspunkt;

        this.dato = tidspunkt.substring(0, 8);
        this.arrangør = arrangør;

    }

    public Arrangement(Arrangement arrangement){
        this(arrangement.getArrangør(), )
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public void setArrangør(String arrangør) {
        this.arrangør = arrangør;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getDato() {
        return this.dato;
    }

    public String toString() {
        return "Arrangement [nummer=" + nummer + ", navn=" + navn + ", sted=" + sted + ", tidspunkt= " + tidspunkt
                + ", type=" + type + ", arrangør="
                + arrangør + "]";
    }

}
