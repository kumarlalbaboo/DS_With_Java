package Interview.Practice.Custom_Collection;

public class CustomLinkedList<E> {

    private class Node {
        E data;
        Node next;
        Node(E data) { this.data = data; }
    }

    private Node head;
    private int size = 0;

    // 1. add(E e) – add element at ends
    public void add(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Display LinkedList
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 11. reverseLinkedList()
    public void reverseLinkedList() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // 2. add(int index, E element) – insert at position
    public void add(int index, E element) {
        checkPositionIndex(index); // allows index == size
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    // 3. get(int index) – get element at index
    public E get(int index) {
        checkElementIndex(index);
        return getNode(index).data;
    }

    // 4. set(int index, E element) – replace element
    public E set(int index, E element) {
        checkElementIndex(index);
        Node node = getNode(index);
        E oldValue = node.data;
        node.data = element;
        return oldValue;
    }

    // 5. remove(int index) – remove at index
    public E remove(int index) {
        checkElementIndex(index);
        Node removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            Node prev = getNode(index - 1);
            removed = prev.next;
            prev.next = removed.next;
        }
        size--;
        return removed.data;
    }

    // 6. remove(Object o) – remove first occurrence
    public boolean remove(Object o) {
        if (head == null) return false;
        if ((o == null && head.data == null) || (o != null && o.equals(head.data))) {
            head = head.next;
            size--;
            return true;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if ((o == null && curr.data == null) || (o != null && o.equals(curr.data))) {
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    // 7. indexOf(Object o)
    public int indexOf(Object o) {
        Node curr = head;
        int index = 0;
        while (curr != null) {
            if ((o == null && curr.data == null) || (o != null && o.equals(curr.data))) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    // 8. lastIndexOf(Object o)
    public int lastIndexOf(Object o) {
        Node curr = head;
        int index = 0, lastIndex = -1;
        while (curr != null) {
            if ((o == null && curr.data == null) || (o != null && o.equals(curr.data))) {
                lastIndex = index;
            }
            curr = curr.next;
            index++;
        }
        return lastIndex;
    }

    // 9. size()
    public int size() {
        return size;
    }

    // 10. isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }


    // 12. contains(Object o)
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    // 13. clear()
    public void clear() {
        head = null;
        size = 0;
    }

    // Helper methods
    private Node getNode(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr;
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    // Main for testing
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        list.display();

        System.out.println("Get index 2: " + list.get(2));
        list.set(2, 25);
        list.display();

        list.remove((Integer)15);
        list.display();

        list.reverseLinkedList();
        list.display();

        System.out.println("Contains 25? " + list.contains(25));
        System.out.println("Index of 25: " + list.indexOf(25));
        System.out.println("Last index of 25: " + list.lastIndexOf(25));
        System.out.println("Size: " + list.size());
        list.clear();
        list.display();
    }
}
