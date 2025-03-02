class A
{
 int a=10;
 int b=20;	
 int c=30;
}
class B
{

int x=100;
int y=200;
int z=300;
}		
class C
	{
		
public static void main(string args[])
{

 A obj1 = A();
 B obj2 = B();

 System.out.println(obj1.a+" "+ obj2.x);
 System.out.println(obj1.b+" "+ obj2.y);
 System.out.println(obj1.c+" "+ obj2.z);

}
}
