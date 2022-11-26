package inhetitance.arraylist;

import oothinking.Loan;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Double> listOfDoubles = new ArrayList<>();
        listOfDoubles.add(12.5);
        listOfDoubles.add(4.35);
        listOfDoubles.add(76.2);
        listOfDoubles.add(6.6);
        listOfDoubles.add(1.5);
        System.out.println(listOfDoubles);

        listOfDoubles.add(0,22.5);
        System.out.println(listOfDoubles);

        System.out.println(listOfDoubles.size());

        listOfDoubles.remove(4.35);
        System.out.println(listOfDoubles);

        listOfDoubles.remove(listOfDoubles.size()-1);
        System.out.println(listOfDoubles);

        System.out.println(listOfDoubles.contains(6.6));

        listOfDoubles.remove(3);
        System.out.println(listOfDoubles);

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        System.out.println(max(list));

    }

    public static Integer max(ArrayList<Integer> list) {
        return list.isEmpty() ? null : Collections.max(list);
    }

    public static void anyObject() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Loan());
    }


}
