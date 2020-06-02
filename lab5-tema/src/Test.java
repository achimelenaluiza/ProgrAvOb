import java.sql.SQLOutput;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Task t1 = new OutTask("Buna");
        Task t2 = new RandomOutTask();
        Task t3 = new CounterOutTask();

        System.out.println("Start test:");
        t1.DoSomething();
        t2.DoSomething();
        t3.DoSomething();
        t3.DoSomething();
        System.out.println("End test");

        System.out.println("Test Queue:");
        Queue queue = new Queue();
        queue.add(t1);
        queue.add(t2);
        queue.add(t3);
        queue.add(new RandomOutTask());
        while (!queue.empty()) {
            queue.extract();
        }
        System.out.println("End test queue");
    }
}
