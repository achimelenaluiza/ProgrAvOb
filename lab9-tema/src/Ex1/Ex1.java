package Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static String makeString(List<Integer> list){
        return list.stream().map(i -> (i%2==0?"p":"i")+i).collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(makeString(list));
    }
}
