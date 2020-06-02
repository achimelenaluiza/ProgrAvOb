public class OutTask implements Task {

    private String msg;

    public OutTask(String msg) {
        this.msg = msg;
    }

    @Override
    public void DoSomething() {
        System.out.println(msg);
    }
}

