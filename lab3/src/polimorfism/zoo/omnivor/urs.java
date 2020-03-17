package polimorfism.zoo.omnivor;

public class urs extends omnivor {
    public urs(String nume, int varsta)
    {
        super(nume, varsta);
        this.sunetSpecific = "va mormai";
    }
    @Override
    public void scoateSunet() {
        System.out.println("ursul" + this.sunetSpecific);
    }
}
