import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

public class Ex1 {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        String[] aux = {"maria", "mihaela", "maria", "ana", "ioana", "ana"};

        for (String str: aux) {
            try{
                if(s.contains(str)){
                    throw new RuntimeException("Duplicat: " + str);
                }
                else{
                    s.add(str);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println(s);
    }
}
