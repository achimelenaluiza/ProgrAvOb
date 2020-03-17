package polimorfism.zoo;
import polimorfism.zoo.carnivor.leu;
import polimorfism.zoo.ierbivor.cal;
import polimorfism.zoo.omnivor.urs;

import java.util.Scanner;
//java.lang import default

public class zootest {
    public static void main(String[] args) {

        //  Integer nrAnimaleZoo = Integer.valueOf(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati nr maxim de animale ce vor fi introduse:");
        int nrAnimaleZoo = scanner.nextInt();
        scanner.close();
        zoo zoobuc = new zoo(nrAnimaleZoo);
        adanimale(zoobuc);
        for(int i = 0; (i < zoobuc.animaleZoo.length && zoobuc.animaleZoo[i]!=null);i ++)
        {
            animal a = zoobuc.animaleZoo[i];
            a.afiseazaDetalii();
            a.seHraneste();
            a.scoateSunet();
        }
    }
    public static void adanimale(zoo zooBuc) {
        leu l = new leu("leo",7);
        zooBuc.adaugaAnimal(l);
        cal c = new cal("thunder", 3);
        zooBuc.adaugaAnimal(c);
        urs u = new urs("bear", 20);
        zooBuc.adaugaAnimal(u);
    }
}
