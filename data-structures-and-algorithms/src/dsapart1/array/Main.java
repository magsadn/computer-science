package dsapart1.array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] numbersInit1 = new int[3];
        numbersInit1[0] = 10;
        numbersInit1[1] = 20;
        numbersInit1[2] = 30;
        System.out.println(Arrays.toString(numbersInit1));

        int[] numbersInit2 = {10, 20, 30};
        System.out.println(numbersInit2.length);
        System.out.println(Arrays.toString(numbersInit2));

        System.out.println();
        Array numbersArray = new Array();
        numbersArray.print();
        numbersArray.insert(3);
        numbersArray.insert(4);
        numbersArray.insert(8);
        numbersArray.insert(9);
        numbersArray.print();
        numbersArray.removeAt(0);
        numbersArray.removeAt(2);
        System.out.println();
        numbersArray.print();
        System.out.println();
        System.out.println(numbersArray.indexOf(8));
        numbersArray.insert(23);
        numbersArray.insert(36);
        numbersArray.insert(11);
        numbersArray.insert(100);
        Array anotherItems = new Array(5);
        anotherItems.insert(2);
        anotherItems.insert(3);
        anotherItems.insert(1);
        System.out.println("max: " + numbersArray.max());
        numbersArray.intersect(anotherItems).print();
        numbersArray.print();
        numbersArray.reverse();
        numbersArray.print();
        numbersArray.insertAt(1,99);
        numbersArray.print();
        numbersArray.insertAt(6,101);
        numbersArray.print();

        List<Integer> arrayList = new ArrayList<>(10);
        arrayList.addAll(List.of(1,2,4));
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        var array = arrayList.toArray();
        System.out.println(Arrays.toString(array));

        Vector<Integer> vector = new Vector<>(3);
        vector.add(3);
        vector.add(5);
        vector.add(8);
        System.out.println(vector);
    }
}
