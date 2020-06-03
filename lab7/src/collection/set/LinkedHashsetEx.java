package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

//similar to HashSet, but it preserves order of insertion

public class LinkedHashsetEx {
    public static void main(String[] args) {

        LinkedHashSet<Integer> ints = new LinkedHashSet<>(Arrays.asList(1, 3, 5, 6, 8, 9, 323, 12, 434 , 667));
        HashSet<Integer> hashSet = new HashSet<>(ints);

        System.out.println(hashSet);// doesn't preserve order
        System.out.println(ints);
    }
}
