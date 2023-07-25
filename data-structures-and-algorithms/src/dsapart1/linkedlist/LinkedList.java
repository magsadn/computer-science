package dsapart1.linkedlist;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class LinkedList {
    Logger logger = Logger.getLogger("logger");

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        //[10 -> 20 -> 30]
        //[10    20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        //[10 -> 20 -> 30]
        //[10 -> 20    30]
        //previous = 20
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        //[10 -> 20 -> 30]
        //[10 <- 20 <- 30 <- 40]
        //  p     c    n
        //        p    c     n
        //             p     c    n
        if (isEmpty()) return;
        var current = first.next;
        var previous = first;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new NoSuchElementException();
        if (k > size || k < 0)
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", k, size));
        var current = first;
        int i = 0;
        while (i < size - k) {
            current = current.next;
            i++;
        }
        return current.value;
    }

    public void myPrintMiddle() {
        //Use two pointers
        if (isEmpty())
            throw new IllegalStateException();
        var fast = first;
        var slow = first;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null) {
                System.out.print(getPrevious(slow).value + ", ");
                break;
            }
        }
        System.out.println(slow.value);
    }

    public void printMiddle() {
        if (isEmpty())
            throw new IllegalStateException();
        //Use two pointers
        var fast = first;
        var slow = first;
        while (fast != last && fast.next != last) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == last)
            System.out.println(slow.value);
        else
            System.out.println(slow.value + ", " + slow.next.value);
    }

    public boolean hasLoop() {
        var fast = first;
        var slow = first;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public static LinkedList createWithLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        var node = list.last;

        list.addLast(40);
        list.addLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }

    public int[] toArray() {
        var array = new int[size];
        var current = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    @Override
    public String toString() {
        var current = first;
        String result = "[";
        while (current != null) {
            result += current.value;
            if (current.next != null)
                result += ", ";
            current = current.next;
        }
        result += "]";
        return result;
    }
}
