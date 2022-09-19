package ovinger.Oving10.op2;

import java.util.ArrayList;
import java.util.stream.Collectors;

import ovinger.Oving10.op2.Rett.Type;

public class MenyRegister {

    public ArrayList<Meny> meny;

    public MenyRegister() {

        this.meny = new ArrayList<Meny>();

        Rett Kylling = new Rett(Type.HOVEDRETT, "Kylling", "Kyllingfilet", "Kyllingfilet med potetmos og salat", 100);
        Meny m1 = new Meny("Meny1", Kylling);

        Rett Iskrem = new Rett(Type.DESSERT, "Iskrem", "God iskrem", "Iskrem med is", 100);
        Meny m2 = new Meny("Meny2", Iskrem);

        meny.add(m1);
        meny.add(m2);
    }

    public void lagNyMeny(String navn, Rett rett) {
        Meny m = new Meny(navn, rett);
        this.meny.add(m);
    }

    public void finnAlleRetter() {
        meny.stream().forEach((e) -> {
            e.rett.stream().forEach((f) -> {
                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);
            });
        });
    }

    public void leggTilRettIMeny(String menyNavn, Rett rett) {
        this.meny.stream().filter(e -> e.navn.equals(menyNavn)).forEach(e -> e.leggTilRett(rett));
    }

    public Rett lagNyRett(Type type, String navn, String beskrivelse, String ingredienser, int pris) {
        return new Rett(type, navn, beskrivelse, ingredienser, pris);

    }

    public void leggTilMeny(Meny meny) {
        this.meny.add(meny);
    }

    public void skrivUtMeny() {
        System.out.println("Menyer :");

        meny.stream().forEach((e) -> {
            System.out.println("");

            System.out.println(e.navn);
            e.rett.stream().forEach((f) -> {

                // Bruk en get to string etterepå!!!!!!!!

                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);

            });
        });
    }

    public void finnRettGittNavn(String navn) {

        meny.stream().forEach((e) -> {
            e.rett.stream().filter((f) -> f.navn.equals(navn)).forEach((f) -> {
                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);

            });
        });
    }

    public void finnRettGittType(Type type) {

        meny.stream().forEach((e) -> {
            e.rett.stream().filter((f) -> f.type.equals(type)).forEach((f) -> {
                System.out.println(f.type + " " + f.navn + " " + f.beskrivelse + " " + f.ingredienser + " " + f.pris);
            });
        });
    }

    public void menyTotalPris(int interval) {

        meny.stream().forEach((e) -> {
            if (e.rett.stream().mapToInt((f) -> f.pris).sum() <= interval) {
                System.out.println(e.navn + " pris: " + e.rett.stream().mapToInt((f) -> f.pris).sum());
            }
        });
    }

    public void listeOverMenyer() {
        meny.stream().forEach((e) -> {
            System.out.println(e.navn);
        });
    }

    // public static void main(String[] args) {
    // MenyRegister menyRegister = new MenyRegister();

    // Rett r2 = new Rett(Type.FORRETT, "Iskrem", "Kyllingfilet", "Kyllingfilet med
    // potetmos og salat", 100);
    // Rett r7 = new Rett(Type.HOVEDRETT, "fffffff", "dsd", "Kyllingfilet med
    // potetmos og salat", 100);

    // menyRegister.leggTilRettIMeny("Meny1", r7);
    // menyRegister.leggTilRettIMeny("Meny1", r7);

    // menyRegister.lagNyMeny("Meny3", r2);

    // menyRegister.leggTilRettIMeny("Meny3", r2);

    // // menyRegister.skrivUtMeny();

    // // menyRegister.finnRettGittNavn("fffffff");
    // // menyRegister.finnRettGittType(Type.FROKOST);

    // menyRegister.menyTotalPris(200);

    // }
}
