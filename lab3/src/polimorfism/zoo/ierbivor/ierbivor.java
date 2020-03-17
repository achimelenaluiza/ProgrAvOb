package polimorfism.zoo.ierbivor;

import polimorfism.zoo.animal;

public abstract class ierbivor extends animal {

    public ierbivor(String nume, int varsta)
    {
        super(nume, varsta);
        this.tipHrana = "iarba";
    }

    @Override
    public void seHraneste() {
        System.out.println(this + "se hraneste cu" + tipHrana);
    }
}
