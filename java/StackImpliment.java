import java.util.Scanner;
class StackImpliment
{
int stack[]=5;
int top=-1;

void push()
{
if(top==(stack-1))
{
    System.out.print("Stack if full");
}
else
{
    System.out.print("Enter data to add in stack");
    int data=in.nextInt();
    top=top+1;
    stack[top]=data;
    System.out.print("Data inserted");
    
}}
void pop()
{
    if(top==-1)
    {
        System.out.print("Stack is empty");
    }
    else
    {
        top=top-1;
        System.out.print("Data deleted");
    }
}
void peek()
{
    if(top==-1)
    {
        System.out.print("Stack is empty");
    }
    else
    {
        System.out.print("Top data in stack is"+stack[top]);
    }
}
void diplay()
{
    for(int i=top;i>=0;i--);
    {
        System.out.print(stack[i]);
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
    Stackimpliment object = new Stackimpliment();
    

    System.out.println("press 1 to push");
    System.out.println("press 2 to pop");
    System.out.print("press 3 to peek");
    System.out.println("press 4 to display");
    System.out.println("Press 5 to getsize");
    System.out.println("press 6 to clear");
    System.out.println("Choose Operation");
    int add=in.nextInt();
switch(add){
case 1:{
       object.push();
       break;}
case 2:{
       object.pop();
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
       
    

    



