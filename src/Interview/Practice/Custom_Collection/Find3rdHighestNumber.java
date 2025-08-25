package Interview.Practice.Custom_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Find3rdHighestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(100);
        list.add(200);
        list.add(5);
        list.add(30);
        list.add(550);
        list.add(35);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.get(list.size()-3));

    }

}
