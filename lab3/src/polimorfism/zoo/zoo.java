package polimorfism.zoo;

public class zoo {

    private final int nrMaximAnimale;
    animal[] animaleZoo;
    private int indexCurent;

    public zoo(int nrMaximAnimale){
        if(nrMaximAnimale > 0) {
            this.nrMaximAnimale = nrMaximAnimale;
            this.animaleZoo = new animal[nrMaximAnimale];
        }else{
            throw new RuntimeException("nu ati introdus un nr intreg pozitiv");
        }
    }

    public void adaugaAnimal(animal a) {
        if(indexCurent < animaleZoo.length){
            animaleZoo[indexCurent ++] = a;

            System.out.println("Adaugat alt animal" + a.getClass() + "la pozitia" + indexCurent);
        }
    }
}
