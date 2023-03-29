package console;

import java.util.*;

import static java.util.List.of;

public class SortTest {
    public static void main(String[] args) {
        List list = of(1,2,3,4);

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(3);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(4);

        Collections.sort(integers);
        System.out.println(integers);


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        Collections.sort(integers,comparator);
        System.out.println(integers);


        Collections.sort(integers,Collections.reverseOrder(comparator));
        System.out.println(integers);

        integers.sort(comparator);



    }


}
