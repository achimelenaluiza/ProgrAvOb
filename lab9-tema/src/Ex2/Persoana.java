package Ex2;

import java.util.List;

public class Persoana {
    private String nume;
    private String prenume;
    int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    static void afisati (List<Persoana> pers) {
        pers.stream().forEach(System.out::println);
    }

    static void sortPrenume(List<Persoana> pers) {
        pers.stream().sorted((o1,o2) -> o1.prenume.compareToIgnoreCase(o2.prenume)).forEach(System.out::println);
    }

    static void afisCriteriu(List<Persoana> pers, Character c) {
        pers.stream().filter(p -> Character.toLowerCase(p.nume.charAt(0))==Character.toLowerCase(c)).forEach(System.out::println);
    }

    static void sortVarsta(List<Persoana> pers) {
        pers.stream().sorted((o1,o2) -> Integer.compare(o1.varsta,o2.varsta)).forEach(System.out::println);
    }

    static void afisMinVarsta(List<Persoana> pers) {
        System.out.println(pers.stream().min((o1,o2) -> Integer.compare(o1.varsta,o2.varsta)).get());
    }
}
