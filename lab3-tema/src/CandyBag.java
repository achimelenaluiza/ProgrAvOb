public class CandyBag {
    private int Max_Nr_Of_Boxes;
    CandyBox[] Boxes;
    private int Curent_Index;

    public CandyBag(int max_Nr_Of_Boxes) {
        if (max_Nr_Of_Boxes > 0) {
            this.Max_Nr_Of_Boxes = max_Nr_Of_Boxes;
            this.Boxes = new CandyBox[max_Nr_Of_Boxes];
        }
        else throw new RuntimeException("nu ati introdus un intreg pozitiv");
    }

    public void Add_Box(CandyBox candybox) {
        if (Curent_Index < Boxes.length) {
            Boxes[Curent_Index] = candybox;
            System.out.println("Adaugat cutie " + CandyBox.class.getSimpleName() + " la pozitia " + Curent_Index++);
        }
    }
}
