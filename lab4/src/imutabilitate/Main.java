package imutabilitate;

public class Main {
    public static void main(String[] args) {

        Adresa domiciliu = new Adresa("Timis", "4A");
        persoana pers = new persoana(1,"teo", domiciliu);

        String numepers = pers.getNume().toUpperCase();
        System.out.println(pers);
        System.out.println(numepers);

        String aux = domiciliu.getStrada().toUpperCase();
        domiciliu.setStrada(aux);

        System.out.println(pers);
    }
}
