public class DEQueue {
    int rear;
    int front;
    int capacity;
    int[] queue;

    DEQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    void add_Front(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add element.");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else
            front = front - 1;
        queue[front] = data;
        System.out.println("Added front element: " + data);
    }

    void add_Rear(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add element.");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else
            rear = rear + 1;
        queue[rear] = data;
        System.out.println("Added rear element: " + data);
    }

    int remove_Front() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return -1;
        }
        int data = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else
            front = front + 1;
        return data;
    }

    int remove_Rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return -1;
        }
        int data = queue[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else
            rear = rear - 1;
        return data;
    }

    int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    int peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[rear];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("DEQueue is Empty.");
            return;
        }
        System.out.println("DEQueue (Front to rear): ");
        int current = front;
        while (true) {
            System.out.print(queue[current] + " ");
            if (current == rear) {
                break;
            }
            current = (current + 1) % capacity;
        }
        System.out.println();
    }

    int get_size() {
        if (isEmpty()) {
            System.out.println("The queue is Empty.");
            return 0;
        }
        if (front <= rear) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }

    int get_capacity() {
        return capacity;
    }

    public void clear() {
        rear = -1;
        front = -1;
        System.out.println("Queue cleared.");
    }

    public static void main(String[] args) {
        DEQueue dq = new DEQueue(6);
        System.out.println(dq.isEmpty());
        System.out.println(dq.isFull());
        dq.add_Front(1);
        dq.add_Front(2);
        dq.add_Rear(3);
        dq.add_Rear(4);
        dq.display();
        System.out.println("The capacity of Queue is:" + dq.get_capacity());
        System.out.println("Remove rear is:" + dq.remove_Rear());
        System.out.println("Remove rear is:" + dq.remove_Rear());
        System.out.println("Remove front is:" + dq.remove_Front());
        dq.display();
        dq.clear();
    }
}