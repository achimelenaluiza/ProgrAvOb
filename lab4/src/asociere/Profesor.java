package asociere;

public class Profesor {

    private String nume;
    private int id;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profesor(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                '}';
    }
}
