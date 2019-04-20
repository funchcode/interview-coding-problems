import Level99.Level1;
import Level99.Level2;
import Level99.Level3;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        /*int test3 = 123512;
        int test3_1 = 111110;
        int test3_2 = 1;
        //Level3.findRange(test3);
        Level3.findRange(test3_1);*/


        /*List<Integer> test2 = new ArrayList<>();
        test2.add(1);
        test2.add(4);
        test2.add(4);
        test2.add(8);
        Level2.reassignedPriorities(test2);*/



        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Level1.getMaxElementIndexes(list, list1);

    }
}
