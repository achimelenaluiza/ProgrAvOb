import Ex2.Student;
import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        String[] aux = {"maria", "mihaela", "maria", "ana", "ioana", "ana"};
        for (String str : aux) {
            arr.add (new Student(str, 10.0f));
        }
        for (Student s1 : arr) {
            System.out.println(s1);
            for (Student s2 : arr) {
                System.out.println("\t" + s2 + " " + s1.equals(s2) + " " + ((Object) s1).equals(s2));
            }
        }
    }
}
