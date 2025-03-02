import java.util.Scanner;
class Questionno14
{
	public static void main(String arg[])
	{
		int a,b;
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		a=obj.nextInt();
	    System.out.print("Enter 2nd Number: ");
	    b=obj.nextInt();
	    for(int i=a;i<=b;i++)
		{
		System.out.print(i+"+");
		sum=sum+i;
		}
		System.out.print("\b="+sum);
	}


}