public class PriorityQueue {
    int capacity;
    int front;
    int rear;
    int queue[];
    int priorityqueue[];
    int size;

    PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.priorityqueue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    void enQueue(int data, int priority) {
        if (isFull()) {
            System.out.println("The queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        priorityqueue[rear] = priority;
        size++;
        System.out.println("Enqueued " + data + " Priority " + priority);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty. Cannot dequeue.");
            return -1;
        }
        int highestPriority = front;
        for (int i = front + 1; i <= rear; i++) {
            if (priorityqueue[i] < priorityqueue[highestPriority]) {
                highestPriority = i;
            }
        }
        int dequeuedData = queue[highestPriority];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            for (int i = highestPriority; i < rear; i++) {
                queue[i] = queue[i + 1];
                priorityqueue[i] = priorityqueue[i + 1];
            }
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        System.out.println("Dequeued " + dequeuedData);
        return dequeuedData;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty. Cannot peek.");
            return -1;
        }
        int highestPriority = front;
        for (int i = front + 1; i <= rear; i++) {
            if (priorityqueue[i] < priorityqueue[highestPriority]) {
                highestPriority = i;
            }
        }
        return queue[highestPriority];
    }

    int size() {
        return size;
    }

    int capacity() {
        return capacity;
    }

    void clear() {
        front = -1;
        rear = -1;
        size = 0;
        System.out.println("Priority queue is cleared");
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(4);
        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("Is full? " + queue.isFull());
        queue.enQueue(12, 2);
        queue.enQueue(13, 3);
        queue.enQueue(14, 1);
        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}