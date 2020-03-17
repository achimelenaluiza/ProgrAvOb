package polimorfism.zoo.carnivor;

public class leu extends carnivor {

    public leu(String nume, int varsta)
    {
        super(nume, varsta);
        this.sunetSpecific = "va rage";
    }

    @Override
    public void scoateSunet() {
        System.out.println("leul" + this.sunetSpecific);
    }
}
