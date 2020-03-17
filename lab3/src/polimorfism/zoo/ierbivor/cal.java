package polimorfism.zoo.ierbivor;

public class cal extends ierbivor {

    public cal(String nume, int varsta)
    {
        super(nume, varsta);
        this.sunetSpecific = "va necheza";
    }
    @Override
    public void scoateSunet() {
        System.out.println("call" + this.sunetSpecific);
    }
}
