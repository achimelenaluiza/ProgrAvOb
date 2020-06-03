package Ex2;

import java.util.Objects;

public class Student {
    private String nume;
    private float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return this.nume + " - " + this.medie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, medie);
    }

    public boolean equals(Student s) {
        return false;
    }
}
