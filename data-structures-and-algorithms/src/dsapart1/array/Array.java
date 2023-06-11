package dsapart1.array;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int length) {
        items = new int[length];
    }

    public Array(){
        items = new int[0];
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count + 5];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i])
                return i;
        }
        return -1;
    }

    public int max() {
        if (count == 0)
            throw new IllegalArgumentException();
        int max = items[0];
        for (int i = 1; i < count; i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
    }

    public Array intersect(Array array) {
        int[] anotherItems = array.items;
        int length;
        if (count <= anotherItems.length)
            length = count;
        else
            length = anotherItems.length;
        Array commonItems = new Array(length);
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < anotherItems.length; j++)
                if (items[i] == anotherItems[j]) {
                    commonItems.insert(items[i]);
                }
        }
        return commonItems;
    }

    public void reverse() {
        int[] reversedItems = new int[count];
        for (int i = count - 1; i >= 0; i--)
            reversedItems[count - 1 - i] = items[i];
        items = reversedItems;
    }

    public void insertAt(int index, int item){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        int [] newItems = new int[count+1];
        for(int i=0,j=0;i<newItems.length;i++,j++){
            if (i == index) {
                newItems[i++] = item;
                count++;
            }
            newItems[i] = items[j];
        }
        items = newItems;
    }
}
