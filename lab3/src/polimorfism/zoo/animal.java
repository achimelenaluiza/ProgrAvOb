package polimorfism.zoo;

public abstract class animal {
    private int nrIdentificare;
    private String nume;
    private int varsta;
    protected String tipHrana;
    protected String sunetSpecific;

    public animal(String nume,int varsta){
        this.nume = nume;
        this.varsta = varsta;
        nrIdentificare = hashCode();
    }

    public animal(){
    }

    public abstract void seHraneste();
    public abstract void scoateSunet();

    public void afiseazaDetalii(){
        System.out.println("Acesta este " + this.toString());
    }
    public String toString(){
        return "animal din categoria" + this.getClass().getSimpleName() +
                " din specia ";
    }
}
