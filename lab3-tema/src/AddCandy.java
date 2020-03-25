import java.util.Scanner;
import java.util.SortedMap;

public class AddCandy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati nr maxim cutii: ");
        int nrMaxCutii = scanner.nextInt();
        scanner.close();
        CandyBag bag = new CandyBag(nrMaxCutii);

        Heidi heidi = new Heidi(1.5f, "alune", "Elvetia");
        bag.Add_Box(heidi);
        Heidi heidi2 = new Heidi( 2.5f, "caramel" , "Belgia");
        bag.Add_Box(heidi2);
        Milka milka = new Milka(3f, 4.2f, "oreo", "Suedia");
        bag.Add_Box(milka);
        Milka milka2 = new Milka(4f, 1.5f, "lapte","Olanda");
        bag.Add_Box(milka2);
        Lindt lindt = new Lindt(1f,2f,3f, "cacao", "Norvegia");
        bag.Add_Box(lindt);
        Lindt lindt2 = new Lindt(1f,2f,3f, "cacao", "Norvegia");
        bag.Add_Box(lindt2);
        Lindt lindt3 = new Lindt(1f,3f,4f, "rom", "Canada");
        bag.Add_Box(lindt3);

        for(int i = 0; (i < bag.Boxes.length)
                && (bag.Boxes[i] != null); i++) {
            CandyBox candyBox = bag.Boxes[i];
            System.out.println(candyBox.toString());
            System.out.println("-------");
        }

        System.out.println("Test equals:");
        System.out.println(lindt == lindt2);
        System.out.println(lindt.equals(lindt2));

        heidi.printHeidiDim();
        lindt.printLindtDim();
        milka.printMilkaDim();
    }
}
