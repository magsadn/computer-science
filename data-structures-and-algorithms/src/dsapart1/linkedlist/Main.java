package dsapart1.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        list.remove(2);
        list.remove(Integer.valueOf(10));
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(5));
        list.addLast(5);
        list.addLast(15);
        list.addLast(5);
        System.out.println(list);
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.indexOf(5));
        System.out.println(list.size());
        System.out.println(list.get(2));
        var array = list.toArray();
        System.out.println(Arrays.toString(array));*/
///////////////////////////////////////////////////
        var linkedList = new LinkedList();
        linkedList.addLast(10);
//        linkedList.addLast(20);
//        linkedList.addLast(30);
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(30));
        System.out.println(linkedList.indexOf(40));
        System.out.println(linkedList.contains(20));
        System.out.println(linkedList.contains(40));
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.addLast(11);
        System.out.println(linkedList);
        linkedList.addFirst(12);
        System.out.println(linkedList);
        linkedList.addFirst(12);
        System.out.println(linkedList);
        linkedList.addLast(13);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
//        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
//        System.out.println(linkedList);
//        System.out.println(linkedList.size());
//        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(70);
        linkedList.addLast(80);
//        linkedList.addLast(90);
        System.out.println(linkedList);
        System.out.println(linkedList.hasLoop());
//        linkedList.reverse();
        System.out.println(linkedList);
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.getKthFromTheEnd(3));
        linkedList.myPrintMiddle();
        linkedList.printMiddle();
        var listWithLoop = LinkedList.createWithLoop();
        System.out.println(listWithLoop.hasLoop());
    }
}
