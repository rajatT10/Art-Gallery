package EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

public class ForLoopRemovalFromArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));

        /*list.forEach(x-> {
            list.remove(new Integer(x));
        });*/

        System.out.println("list size= " + list.size());
        
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        System.out.println("list = " + list);
    }
}
