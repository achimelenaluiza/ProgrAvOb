package polimorfism.zoo.carnivor;

import polimorfism.zoo.animal;

public abstract class carnivor extends animal {

    public carnivor(String nume, int varsta){
        super(nume,varsta);
        this.tipHrana = "carne";
    }

    @Override
    public void seHraneste() {
        System.out.println(this + "se hraneste cu" + tipHrana);
    }
}
