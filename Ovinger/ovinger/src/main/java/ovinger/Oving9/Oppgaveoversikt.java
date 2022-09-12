package ovinger.Oving9;

import java.util.ArrayList;

public class Oppgaveoversikt {

    private Student studenter; // tabellen opprettes i konstruktøren
    private int antStud = 0; // økes med 1 for hver ny student
    public ArrayList<Student> students;

    public Oppgaveoversikt() {
        students = new ArrayList<Student>();

        Student s1 = new Student("Ben", 1);
        Student s2 = new Student("Ben", 1);
        Student s3 = new Student("Ben", 1);

        students.add(s1);
        students.add(s2);
        students.add(s3);

    }

    public Student getStudenter() {
        return studenter;
    }

    public void setStudenter(Student studenter) {
        this.studenter = studenter;
    }

    public void update(String navn, int antOppg) {

        Student newStudent = new Student(navn, antOppg);
        setStudenter(newStudent);
        students.add(getStudenter());

    }

    public int getAntStud() {
        return students.size();
    }

    public void endreAntallOppgaver(String navn, int tall) {
        students.stream().filter(e -> e.getNavn().equals(navn)).forEach(e -> e.setAntOppg(tall));
    }

    public int finnAntallOppgaver(String navn) {
        return students.stream().filter(e -> e.getNavn().equals(navn)).mapToInt(e -> e.getAntOppg()).sum();
    }

    public static void main(String[] args) {

        Oppgaveoversikt oversikt = new Oppgaveoversikt();

        oversikt.update("Are", 2);
        oversikt.update("Ben", 2);
        oversikt.update("Jon", 2);

        // System.out.println(oversikt.students.get(0));

        oversikt.endreAntallOppgaver("Are", 4);
        System.out.println(oversikt.finnAntallOppgaver("Are"));
        // System.out.println(oversikt.students.get(0));
    }
}
