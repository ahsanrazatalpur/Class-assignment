import java.util.Scanner;
class CircularQueueImpliment
{
int queue[]=5;
int front=-1;
int rear=-1;

void enqueue()
{
if((rear+1)%N==front)
{
    System.out.print("Stack if full");
}
else
{
    System.out.print("Enter data to add in stack");
    int data=in.nextInt();
    front=front+1;
    queue[rear]=data;
    System.out.print("Data inserted");
    
}}
void dequeue()
{
    if(front==-1 && rear ==-1)
    {
    front=rear=0;
        System.out.print("Stack is empty");
    }
    else
    {
        queue=front-1;
        System.out.print("Data deleted");
    }
}
void peek()
{
    if(front==-1 && rear==-1)
    {
        System.out.print("Stack is empty");
    }
    else
    {
        System.out.print("Top data in stack is"+queue[front]);
    }
}
void diplay()
{
    for(int i=front;i>=0;i--);
    {
        System.out.print(queue[i]);
    }
    }
}
void getsize()
{
    for(int j=front;j<=rear;j--)
    {
        System.out.print(j);
    }
    void clear()
    {
        front=-1;
        rear=-1;
        size=0;
        System.out.print("queue is cleared");
    }
}
class show
{   
     public static void main(String args[])
     {
    Scannner in = new Scanner(System.in);
    CircularQueue object = new CircularQueue();
    

    System.out.println("press 1 to Enqueue");
    System.out.println("press 2 to Dequeue");
    System.out.print("press 3 to peek");
    System.out.println("press 4 to display");
    System.out.println("Press 5 to getsize");
    System.out.println("press 6 to clear");
    System.out.println("Choose Operation");
    int add=in.nextInt();
switch(add){
case 1:{
       object.enqueue();
       break;}
case 2:{
       object.dequeue();
       break;}
case 3:{
       object.peek();
       break;}
case 4:{
       object.display();
       break;}
case 5:{
       object.getzize();
       break;
       }
case 6: {
    object.clear();
    break;}
default:
      System.out.println("invalid operation");
      break;

     }
    }
}
       
    

    



