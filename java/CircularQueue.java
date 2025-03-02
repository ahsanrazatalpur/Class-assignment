import java.util.Scanner;

class CircularQueueImpliment {
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    Scanner in = new Scanner(System.in);

    void enqueue() {
        if ((rear + 1) % 5 == front) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Enter data to add in queue");
            int data = in.nextInt();
            rear = (rear + 1) % 5;
            queue[rear] = data;
            if (front == -1) {
                front = rear;
            }
            System.out.println("Data inserted");
        }
    }

    void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Data deleted: " + queue[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % 5;
            }
        }
    }

    void peek() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front data in queue is: " + queue[front]);
        }
    }

    void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            int i = front;
            while (i != rear) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % 5;
            }
            System.out.println(queue[rear]);
        }
    }

    void clear() {
        front = -1;
        rear = -1;
        System.out.println("Queue is cleared");
    }
}

class show {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        CircularQueueImpliment object = new CircularQueueImpliment();

        System.out.println("Press 1 to Enqueue");
        System.out.println("Press 2 to Dequeue");
        System.out.println("Press 3 to Peek");
        System.out.println("Press 4 to Display");
        System.out.println("Press 5 to Clear");
        System.out.println("Choose Operation");
        int add = in.nextInt();

        switch (add) {
            case 1:
                object.enqueue();
                break;
            case 2:
                object.dequeue();
                break;
            case 3:
                object.peek();
                break;
            case 4:
                object.display();
                break;
            case 5:
                object.clear();
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        in.close(); // Close the scanner after usage
    }
}