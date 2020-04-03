package Strings;

public class Main {
    public static void main(String[] args) {

        String s1 = ""; //empty string
        //default e null
        String s2 = " ";//blank- string pull
        //intern
        s2 = "abc";
        String s3 = new String("abc");
        //heap;
        System.out.println(s2 == s3); //false
        String s4 = "abc";
        System.out.println(s2 == s4); //true
        System.out.println(s2.equals(s3)); //true pt ca ia doar valoarea
        s3 = s3.intern(); //chiar dc e dinamic, ajunge in string pull
        StringBuilder sb = new StringBuilder("abcd");//f rapid dar nu e imutabil
        sb.append(1234);
        System.out.println(sb);
        StringBuffer sbuf = new StringBuffer("abcd");//imutabil
        
    }
}
