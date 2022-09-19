package ovinger.Oving9;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Oppgaveoversikt {

    private Student studenter; // tabellen opprettes i konstruktøren
    private int antStud = 0; // økes med 1 for hver ny student
    public ArrayList<Student> students;

    public Oppgaveoversikt() {
        students = new ArrayList<Student>();

        Student s1 = new Student("Are", 2);
        Student s2 = new Student("Tom", 1);
        Student s3 = new Student("Ben", 1);

        students.add(s1);
        students.add(s2);
        students.add(s3);

    }

    /**
     * @return Student
     */
    public Student getStudenter() {
        return studenter;
    }

    /**
     * @param studenter
     */
    public void setStudenter(Student studenter) {
        this.studenter = studenter;
    }

    /**
     * @param navn
     * @param antOppg
     */
    public void update(String navn, int antOppg) {

        Student newStudent = new Student(navn, antOppg);
        students.add(newStudent);
        antStud++;

    }

    /**
     * @return int
     */
    public int getAntStud() {
        return students.size();
    }

    /**
     * @param navn
     * @param tall
     */
    public void endreAntallOppgaver(String navn, int tall) {
        students.stream().filter(e -> e.getNavn().equals(navn)).forEach(e -> e.setAntOppg(tall));
    }

    /**
     * @param navn
     * @return int
     */
    public int finnAntallOppgaver(String navn) {
        return students.stream().filter(e -> e.getNavn().equals(navn)).mapToInt(e -> e.getAntOppg()).sum();
    }

    /**
     * @param navn
     * @return Student
     */
    public Student getStudent(String navn) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNavn().equals(navn)) {
                return students.get(i);
            }
        }
        return null;

    }

}
