package Ex4;

import java.util.Comparator;


public class StudentCompar implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getNume().compareToIgnoreCase(s2.getNume());
    }
}
