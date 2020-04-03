package imutabilitate;

public final class persoana {
    private final int id;
    private final String nume;
    private final Adresa adresa;

    public persoana(int id, String nume, Adresa adresa) {
        this.id = id;
        this.nume = nume;
        Adresa copie = new Adresa(adresa.getStrada(),adresa.getNr());
        this.adresa = copie;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        Adresa copie = new Adresa(adresa.getStrada(),adresa.getNr());
        return copie;
    }

    @Override
    public String toString() {
        return "persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}
