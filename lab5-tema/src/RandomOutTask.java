import java.util.Random;

public class RandomOutTask implements Task{

    private int rand;

    public RandomOutTask() {
        Random random = new Random();
        this.rand = random.nextInt();
    }

    @Override
    public void DoSomething() {
        System.out.println(rand);
    }
}
