package Interview.Practice.Custom_Collection;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomStackUsingLinkedList {

    private Node top;
    private int size;

    public CustomStackUsingLinkedList() {
        top = null;
        size = 0;
    }

    // Push element onto stack
    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Reverse the stack
    public void reverse() {
        Node prev = null;
        Node current = top;
        Node next;

        while (current != null) {
            next = current.next;  // store next
            current.next = prev;  // reverse pointer
            prev = current;       // move prev forward
            current = next;       // move current forward
        }
        top = prev;
    }

    // Print stack elements
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get size of stack
    public int size() {
        return size;
    }

    public static void main(String[] args) {

        CustomStackUsingLinkedList stack = new CustomStackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();

        System.out.println(stack.pop());
        stack.display();

        System.out.println(stack.peek());
        stack.display();

        stack.reverse();
        stack.display();
    }

}
