package collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 ArrayList = list implementation using a dynamically resizeable, uni-dimensional array
 it is ordered, but unsorted (can be sorted)
 use it for read-intensive ops ( O(1) complexity, elements are referred by exact index)
 O(n) complexity for finding, deleting, adding (at specified position) an element (and even adding at the end if current capacity is exceeded)
**/
public class ArrayListEx {
    public static void main(String[] args) {
        // EX1:

        // without generics
        List bulkList = new ArrayList();
        bulkList.add(1);
        bulkList.add("another element");
        bulkList.add(new Object());
        System.out.println(bulkList);

        // no args constructor
        List<String> list1 = new ArrayList<>(); // implicit size = 10
        // isEmpty is defined in List interface
        System.out.println(list1.isEmpty());
        // add at the end
        list1.add("1");
        list1.add("2");
        // add at a particular index
        list1.add(0, "3");
        // index must be <= current size
        list1.add(3, "5");
        // size inherited from Collection
        System.out.printf("size is %d", list1.size());
        System.out.println();

        if (list1.contains("2")) {
            // pay attention to overloaded method
            System.out.println(list1.remove(1)); // returns the element at specified index
            System.out.println(list1.remove("2")); // returns boolean
            // throws exception
//			System.out.println(list1.remove(1));
        }
        System.out.println(list1); // overrides toString

        //constructor accepting another collection
        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);

        // add the content of another collection at the end
        list2.addAll(list1);
        System.out.println("list2: " + list2);

        // add the content of another collection starting at a specific index
        list2.addAll(1, list1);
        System.out.println(list2);

        // removes from list2 all the values also found in list1
        list2.removeAll(list1);
        System.out.println("list2 after removeAll: " + list2);

        // clears all the content, returns void
        list1.clear();
        System.out.println("list1 after clear: " + list1);

        //EX2:

        //constructor with initial capacity of underlying array
        ArrayList<Integer> ints = new ArrayList<>(20); // implicit is 10
        ints.add(1);
        ints.add(3);
        ints.add(5);
        ints.add(7);

        //replaces value at index, returns value
        ints.set(2, 10);

        // returns element by index
        System.out.println(ints.get(0));
        System.out.println(ints);
        ints.addAll(ints);
        System.out.println(ints);

        //first occurrence
        System.out.println(ints.indexOf(3));

        // last occurrence
        System.out.println(ints.lastIndexOf(3));

        // get a sublist between [2, 4), backed by the initial list
        List<Integer> sublist = ints.subList(2, 4);
        System.out.println("sublist: " + sublist);
        // box the int value to wrapper class in order to use the method with this signature: boolean remove(Object o)
        ints.remove(Integer.valueOf(10));
//		System.out.println(sublist); // cannot use sublist after modifying initial list

        //EX3:
        // convert an array to a list
        List<String> list = Arrays.asList("def", "ade", "a", "f", "ef", "e5");

        //toArray without array param returns an Object[]
        Object[] array = list.toArray();

        String[] strings = new String[10];
        // toArray with array param puts the values in that array and returns it
        System.out.println(Arrays.toString(list.toArray(strings)));

        // use static methods from Collections class to perform diff ops on collections
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "f"));
        System.out.println(Collections.binarySearch(list, "ff"));
    }
}
