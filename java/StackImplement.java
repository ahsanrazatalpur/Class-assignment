import java.util.Scanner;

class StackImplement {
    int[] stack = new int[5];
    int top = -1;

    void push() {
        if (top == (stack.length - 1)) {
            System.out.println("Stack is full");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter data to add in stack: ");
            int data = in.nextInt();
            top = top + 1;
            stack[top] = data;
            System.out.println("Data inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top = top - 1;
            System.out.println("Data deleted");
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top data in stack is: " + stack[top]);
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    int getSize() {
        return top + 1;
    }

    void clear() {
        top = -1;
        System.out.println("Stack is cleared");
    }
}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StackImplement object = new StackImplement();

        System.out.println("Press 1 to push");
        System.out.println("Press 2 to pop");
        System.out.println("Press 3 to peek");
        System.out.println("Press 4 to display");
        System.out.println("Press 5 to get size");
        System.out.println("Press 6 to clear");
        System.out.println("Choose Operation");
        int add = in.nextInt();

        switch (add) {
            case 1:
                object.push();
                break;
            case 2:
                object.pop();
                break;
            case 3:
                object.peek();
                break;
            case 4:
                object.display();
                break;
            case 5:
                System.out.println("Size of the stack is: " + object.getSize());
                break;
            case 6:
                object.clear();
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    
}