public class Stack
{

int stack=[5];
int top=-1;
{
    public boolean isEmpty()
    {
        if(top==-1)
        {
            System.out.println("under flow condition");
        }     
    }
    public boolean isFull()
    {
        if(top==stack-1)
        {
            System.out.println("over flow condition");
        }
    }
    public void  peek()
    {
    
     System.out.println(stack[top]);
        
    }
    
}