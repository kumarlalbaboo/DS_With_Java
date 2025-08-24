package Interview.Practice.Custom_Collection;

public class CustomStackUsingArray {
    
    private int[] stack;
    private int capacity;
    private int top;

    public CustomStackUsingArray(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }


    // Push Operation
    public void push(int data){

        if(isFull()){
            System.out.println("Stack is full...");
            return;
        }
        // stack[++top] = data;
        top++;
        stack[top] = data;
    }

    // Pop Operation
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
            return -1;
        }
        // return stack[top--];
        int popedElement = stack[top];
        top--;
        return popedElement;
    }

    // Reverse the stack
    public void reverse() {
        int left = 0;
        int right = top;

        while (left < right) {
            int temp = stack[left];
            stack[left] = stack[right];
            stack[right] = temp;
            left++;
            right--;
        }
    }

    // Peek Operation
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
            return -1;
        }
        return stack[top];
    }


    // Display Operation
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {

        CustomStackUsingArray stack1 = new CustomStackUsingArray(10);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.display();

        System.out.println(stack1.pop());

        stack1.display();

        System.out.println(stack1.peek());

        stack1.reverse();
        stack1.display();
    }
}
