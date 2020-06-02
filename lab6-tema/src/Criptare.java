import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Criptare {
    private static final String BASE_PATH = "./lab6-tema/src";

    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "";
        int s = 4;

        //read file and encrypt
        try {
            File myObj = new File("./src/test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                text = text + encrypt(data, s) + "\n" ;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }

        //write ecrypted file
        try {
            FileWriter fw = new FileWriter("./src/criptat.txt");
            fw.write(text);
            fw.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
