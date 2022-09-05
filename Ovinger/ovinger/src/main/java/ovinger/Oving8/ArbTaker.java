package ovinger.Oving8;

public class ArbTaker {

    Person person;

    ArbTaker(String fNavn, String eNavn) {
        this.person = new Person(fNavn, eNavn);

    }

    ArbTaker(Person person) {
        this.person = person;
    }
}
