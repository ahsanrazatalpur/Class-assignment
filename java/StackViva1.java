public class StackViva1 {
    int top = -1;
    int[] stackArray;
    int capacity;

    public void StackViva(int capacity) { // Constructor name should match the class name
        this.capacity = capacity;
        this.stackArray = new int[capacity];
    }

    public boolean isEmpty() { // Corrected method name and fixed return type issue
        return top == -1;
    }

    public boolean isFull() { // Fixed typo and fixed return type issue
        return top == capacity - 1;
    }

    public int peek() { // Changed return type to int
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return stackArray[top];
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = data; // Corrected increment syntax
        }
    }

    public int pop() { // Changed return type to int and added return value
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        } else {
            return stackArray[top--]; // Corrected decrement syntax
        }
    }

    public int capacity() { // Changed return type to int and corrected method body
        return capacity;
    }

    public int size() { // Changed return type to int and fixed return value
        return top + 1;
    }

    public static void main(String[] args) {
        StackViva stack = new StackViva(5); // Corrected instantiation with capacity

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop(); // Corrected pop usage
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack size: " + stack.size()); // Added size output
        System.out.println("Stack capacity: " + stack.capacity()); // Added capacity output
    }
}