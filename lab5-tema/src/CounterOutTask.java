public class CounterOutTask implements Task{
    public static int contor = 0;

    @Override
    public void DoSomething() {
        contor = contor + 1;
        System.out.println(contor);
    }
}
