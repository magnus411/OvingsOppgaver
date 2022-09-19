package ovinger.Oving10.op2;

import java.util.ArrayList;
import java.util.stream.Collectors;

import ovinger.Oving10.op2.Rett.Type;

/**
 * Et klasse for å registrerer menyer og retter.
 * 
 * @author Magnus Gjerstad
 * @version 1.0
 * @magnus411
 */

public class MenyRegister {

    private ArrayList<Meny> meny;

    public MenyRegister() {

        this.meny = new ArrayList<Meny>();

        Rett Kylling = new Rett(Type.HOVEDRETT, "Kylling", "Kyllingfilet", "Kyllingfilet med potetmos og salat", 100);
        Meny m1 = new Meny("Meny1", Kylling);

        Rett Iskrem = new Rett(Type.DESSERT, "Iskrem", "God iskrem", "Iskrem med is", 100);
        Meny m2 = new Meny("Meny2", Iskrem);

        meny.add(m1);
        meny.add(m2);
    }

    /**
     * Denne metoden lager en meny
     * 
     * @param navn Navnet på menyen
     * @param rett Hvilken rett objekt som skal være i menyen. {@link Rett}
     */
    public void lagNyMeny(String navn, Rett rett) {
        Meny m = new Meny(navn, rett);
        this.meny.add(m);
    }

    /**
     * Denne metoden finner alle rettene
     */
    public void finnAlleRetter() {
        meny.stream().forEach((e) -> {
            e.rett.stream().forEach((f) -> {
                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);
            });
        });
    }

    /**
     * Denne metoden legger til en rett i en spesifik meny
     * 
     * @param menyNavn Navnet på menyen man skal legge til i.
     * @param rett     Retten som skal legge til i. {@link Meny}}
     */
    public void leggTilRettIMeny(String menyNavn, Rett rett) {
        this.meny.stream().filter(e -> e.navn.equals(menyNavn)).forEach(e -> e.leggTilRett(rett));
    }

    /**
     * Denne metoden lager en ny rett. {@link Rett}
     * 
     * @param type         Hvilken type rett det er.
     * @param navn         Navnet til retten.
     * @param beskrivelse  Beskrivelse av retten
     * @param ingredienser Indigrensene i retten
     * @param pris         prisen til retten
     * @return Returnerer den nye retten
     */
    public Rett lagNyRett(Type type, String navn, String beskrivelse, String ingredienser, int pris) {
        return new Rett(type, navn, beskrivelse, ingredienser, pris);

    }

    /**
     * Legger til en meny i meny listen
     * 
     * @param meny Menyen som skal legges til
     */
    public void leggTilMeny(Meny meny) {
        this.meny.add(meny);
    }

    /**
     * Skriver ut menyen
     */
    public void skrivUtMeny() {
        System.out.println("Menyer :");

        meny.stream().forEach((e) -> {
            System.out.println("");

            System.out.println(e.navn);
            e.rett.stream().forEach((f) -> {

                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);

            });
        });
    }

    /**
     * Finner alle retter gitt et navn
     * 
     * @param navn Tar inn retten som skal søkes etter
     */
    public void finnRettGittNavn(String navn) {

        meny.stream().forEach((e) -> {
            e.rett.stream().filter((f) -> f.navn.equals(navn)).forEach((f) -> {
                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);

            });
        });
    }

    /**
     * Finner alle retter gitt en type
     * 
     * @param type Tar inn typen som skal søkes etter
     */
    public void finnRettGittType(Type type) {

        meny.stream().forEach((e) -> {
            e.rett.stream().filter((f) -> f.type.equals(type)).forEach((f) -> {
                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);
            });
        });
    }

    /**
     * Finner alle menyene innen for en totalpris
     * 
     * @param interval Totalprisen på menyene som skal vises
     */
    public void menyTotalPris(int interval) {

        meny.stream().forEach((e) -> {
            if (e.rett.stream().mapToInt((f) -> f.pris).sum() <= interval) {
                System.out.println(e.navn + " pris: " + e.rett.stream().mapToInt((f) -> f.pris).sum());
            }
        });
    }

    /**
     * Lise over alle menyene sitt navn
     */
    public void listeOverMenyer() {
        meny.stream().forEach((e) -> {
            System.out.println(e.navn);
        });
    }

}
