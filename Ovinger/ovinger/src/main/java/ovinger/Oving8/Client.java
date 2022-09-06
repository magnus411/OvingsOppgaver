package ovinger.Oving8;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList<ArbTaker> personer = new ArrayList<>();

        Person per = new Person("Magnus", "Gjerstad");
        Person per2 = new Person("Magsdnus", "Gjersdstad");

        ArbTaker taker1 = new ArbTaker(per);
        ArbTaker taker2 = new ArbTaker(per2);

        personer.add(taker1);
        personer.add(taker2);

        System.out.println(personer.get(0).person.eNavn);

    }
}
