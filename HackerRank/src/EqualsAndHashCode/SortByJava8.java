package EqualsAndHashCode;

import java.util.*;

public class SortByJava8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Rajat","Snehil","Priya","Loki"));
        //Collections.sort(names, Comparator.comparingInt(str -> str.charAt(str.length() - 1)));
        Collections.sort(names,new CustomComparator());
        System.out.println(names);
    }
}

class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String obj1, String obj2) {
        return obj1.compareTo(obj2);
    }
}
