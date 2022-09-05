package ovinger.Oving8;

public class Client {

    public static void main(String[] args) {

        Person per = new Person("Magnus", "Gjerstad");
        ArbTaker taker = new ArbTaker(per);

        System.out.println(taker.person.eNavn);
    }
}
