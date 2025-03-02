class CircularQueue {
    int front;
    int rear;
    int capicity;
    int queue[];
    int size;
    
    CircularQueue(int capicity) {
        this.capicity = capicity;
        queue = new int[capicity];
        this.rear=-1;
        this.size=0;
        this.front=0;
    }
    
    boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }
    
    boolean isFull() {
        if (size==capicity)
            return true;
        else
            return false;
    }
    void enQueueFront(int data){
        if(isFull()){
            System.out.println("Queue is Empty");
            return;
        } 
        rear=(rear+1)%capicity;
        queue[rear]=data;
        size++;
        System.out.println("Enqueue Element:"+data);
    }
    int deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return-1;
        }
        int data=queue[front];
        front=(front+1)%size;
        size--;
        return data;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is Empty Cannot peek.");
            return-1;
        }
        return queue[front];
    }
    int size(){
        return size;
    }
    int capicity(){
        return capicity;
    }
    public void clear(){
        rear=-1;
        front=0;
        size=0;
        System.out.println("Queue cleared.");
    }
    public class InnerCircularQueue {
        public static void main(String[] args) {
            CircularQueue object=new CircularQueue(3);
            System.out.println(object.isEmpty());
            System.out.println(object.isFull());
            object.enQueueFront(55);
            object.enQueueFront(56); 
            object.enQueueFront(57);
            System.out.println("Dequeue element is "+object.deQueue());
            System.out.println("Dequeue element is "+object.deQueue());
            object.enQueueFront(59);
            System.out.println("Peek element is"+object.peek());
            System.out.println("the size of queue is: "+object.size());
        }
    
        
    }
    
}