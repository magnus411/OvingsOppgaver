package ovinger.Oving10.op1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ovinger.Oving10.op1.Arrangement.Type;

/**
 * @author Magnus Gjerstad
 * @version 0.1
 * 
 */
public class ArrangementRegister {

    public ArrayList<Arrangement> Arr;

    public ArrangementRegister() {

        Arr = new ArrayList<Arrangement>();

        Arrangement arr1 = new Arrangement(1, "Sondre", "Oslo", Type.KONSERT, "202110141800", "Sondre");
        Arrangement arr2 = new Arrangement(2, "Sondre", "Oslo", Type.KONSERT, "202110121800", "Sondre");
        Arrangement arr3 = new Arrangement(3, "Sondre", "Oslo", Type.KONSERT, "202110131800", "Sondre");
        Arrangement arr4 = new Arrangement(1, "Sondre", "Oslo", Type.KONSERT, "202109121800", "Sondre");

        Arr.add(arr1);
        Arr.add(arr2);
        Arr.add(arr3);
        Arr.add(arr4);

    }

    /**
     * Denne metoden lager et nytt arrangement og legger det til i
     * ArrangementRegister.
     * 
     * @param nummer    nummeret til arrangementet
     * @param navn      navnet til arrangementet
     * @param sted      stedet til arrangementet
     * @param type
     * @param tidspunkt
     * @param arrangør
     */
    public void addArrangement(int nummer, String navn, String sted, String type, String tidspunkt, String arrangør) {
        Arrangement arrangement = new Arrangement(nummer, navn, sted, Type.valueOf(type), tidspunkt, arrangør);
        Arr.add(arrangement);

    }

    public void removeArrangement(Arrangement a) {
        Arr.remove(a);
    }

    public void finnArrangement() {
        // for (int i = 0; i < Arr.size(); i++) {
        // System.out.println(Arr.get(i));
        // }

        Arr.sort((e1, e2) -> e1.getDato().compareTo(e2.getDato()));
        Arr.forEach(e -> System.out.println(e));

    }

    /**
     * Denne metoden bruker {@link Arrangement#getArrangør()} for å finne arrangør
     * 
     * @param arrangør
     */
    public void finnArrangementArrangør(String arrangør) {
        Arr.stream().filter(e -> e.getArrangør().equals(arrangør)).forEach(e -> System.out.println(e));
    }

    public void finnArrangementDato(String dato) {
        Arr.stream().filter(e -> e.getDato().equals(dato)).forEach(e -> System.out.println(e));
    }

    public void finnArrangementSted(String sted) {
        Arr.stream().filter(e -> e.getSted().equals(sted)).forEach(e -> System.out.println(e));
    }

    public void finnArrangementType(String type) {
        Arr.stream().filter(e -> e.getType().equals(type)).forEach(e -> System.out.println(e));
    }

    public void finnArrangementNavn(String navn) {
        Arr.stream().filter(e -> e.getNavn().equals(navn)).forEach(e -> System.out.println(e));
    }

    public void finnArrangementMellom(String dato1, String dato2) {

        List<Arrangement> sorter = new ArrayList<Arrangement>();

        Arr.stream().filter(e -> e.getDato().compareTo(dato1) >= 0 && e.getDato().compareTo(dato2) <= 0)
                .forEach(e -> sorter.add(e));

        sorter.sort((e1, e2) -> e1.getDato().compareTo(e2.getDato()));
        sorter.forEach(e -> System.out.println(e));
    }

}
