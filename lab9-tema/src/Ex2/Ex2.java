package Ex2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Persoana> persoane = Arrays.asList(
           new Persoana("ana","maria",20),
           new Persoana("alex","george", 23),
           new Persoana("Radu", "Mihai",65));

        Persoana.afisati(persoane);
        System.out.println("------");
        Persoana.sortPrenume(persoane);
        System.out.println("------");
        Persoana.afisCriteriu(persoane,'a');
        System.out.println("------");
        Persoana.sortVarsta(persoane);
        System.out.println("------");
        Persoana.afisMinVarsta(persoane);
    }
}
