import java.util.Scanner;
class Questionno18
{
	public static void main(String arg[])
	{
	int n1=0,n2=0;
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter value of N1: ");
	n1=obj.nextInt();
	System.out.print("\nEnter value of N2: ");
	n2=obj.nextInt();
	int temp=n1;
	n1=n2;
	n2=temp;
	System.out.print("\nValue of N1 is: "+n1);
	System.out.print("\nValue of N2 is: "+n2);
}
}