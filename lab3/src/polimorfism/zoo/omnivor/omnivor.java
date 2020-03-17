package polimorfism.zoo.omnivor;

import polimorfism.zoo.animal;

public abstract class omnivor extends animal {

    public omnivor(String nume, int varsta)
    {
        super(nume, varsta);
        this.tipHrana = "orice";
    }

    @Override
    public void seHraneste() {
        System.out.println(this + "se hraneste cu" + tipHrana);
    }
}
