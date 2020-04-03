package asociere;

public class Main {
    public static void main(String[] args) {
        Profesor profMate1 = new Profesor(1, "Popescu");
        Profesor profMate2 = new Profesor(2, "Ionescu");
        Profesor profInfo = new Profesor(3, "Anghel");
        Profesor profMateSiInfo = new Profesor(4, "Petrescu");
        Profesor profInfoSiMate = new Profesor(5, "Andrei");

        Departament depinfo = new Departament("info");
        depinfo.setProfesori(new Profesor[]{profInfo, profInfoSiMate, profMateSiInfo});

        Departament depmate = new Departament("mate");
        depmate.setProfesori(new Profesor[]{profMate1,profMate2,profInfoSiMate,profMateSiInfo});

        Universitate unibuc = new Universitate("UNIBUC", new Departament[]{depinfo,depmate});

        System.out.println(unibuc);

        depinfo = null;
        System.out.println(unibuc);

        System.out.println(depmate);
        depmate.getProfesori()[1] = null;
        System.out.println(depmate);
        System.out.println(profMate2);
    }

}
