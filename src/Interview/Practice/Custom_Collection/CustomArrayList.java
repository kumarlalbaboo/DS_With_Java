package Interview.Practice.Custom_Collection;

import java.util.Arrays;

public class CustomArrayList {

    private static final int INITIAL_CAPACITY=10;
    private Object[] array = new Object[INITIAL_CAPACITY];
    int size=0;

    public void add(Object element){
        if(size == array.length){
            array = Arrays.copyOf(array, (array.length)*2);
        }
        array[size++] = element;
    }

    public void display(){
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
    }

    public void clear() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) return true;
        }
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();   // 10 20 30 40
        list.remove(0);   // 10
        list.display();   // 20 30 40
        System.out.println(list.get(2));  //30
        System.out.println(list.contains(20));   //true
        System.out.println(list.size());  //3
        list.clear();
        list.display();  // empty
    }

}
