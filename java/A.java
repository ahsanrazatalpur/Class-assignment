class A
{
    public void show()
    {
        for(int i=1; i<=10; i++)
        System.out.println("hi");
    }
}
class B
{
    public void show()
    {
        for(int i=0; i<=10; i++)
        System.out.println("Hello");
    }

}
public class Main
{
public static void main(String a[])
{
    A obj1= new A();
    B obj2= new B();

    obj1.show();
    obj2.show();
}
}