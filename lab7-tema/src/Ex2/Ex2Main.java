package Ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex2Main {
    public static void main(String[] args) {
        Set<Student> s = new TreeSet<>(new StudentCompar());
        String[] aux1 = {"maria", "mihaela", "maria", "ana", "ioana", "ana"};

        for (String str: aux1) {
            Student stud = new Student(str, 10.0f);
            try{
                if(s.contains(stud)){
                    throw new RuntimeException("Duplicat: " + str);
                }
                else{
                    s.add(stud);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }

        String[] aux2 = {"ion", "ion", "mihai", "george", "alex", "alex"};
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        for (String str: aux2) {
            Student stud = new Student(str, 10.0f);
            try{
                if(map.containsValue(stud)){
                    throw new RuntimeException("Duplicat: " + str);
                }
                else{
                    map.put(stud.hashCode(),stud);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println(s);
        System.out.println(map);
    }
}
