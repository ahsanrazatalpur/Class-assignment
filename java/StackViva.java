public class StackViva
{
    int top=-1;
    int []=stackArray;
    int capacity;
    
    public void stack(int capacity)
    {
        this.capacity=capacity;
        this.stackArray=new int[capacity];
    }
    public boolean isEmplty()
    {
        if(top == -1)
        return true;
    }
    public boolean isFull()
    {
        if(top == capaciyy-1)
        {
            return true;
        }
    }
    public void peek()
    {
        return stackArray[top];
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else
        {
         stackArray(top++);
        }
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            stackArray(top--);
        }
    }
    public void capacity()
    {
        return capacity;
    }
    public void size()
    {
        return capacity-1;
    }
    
    public static void main(String args[])
    {
        Stack object = new Stack(5u);

        object.push(10);
        object.push(20);
        object.push(30);
        object.push(40);
        object.push(50);
    
       object.pop(10);
       object.pop(20);
       object.pop(30);
       object.pop(40);
       object.pop(50);
       

    
}
}