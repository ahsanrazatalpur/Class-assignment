import java.util.Scanner;
class Questionno4
{
	public static void main(String arg[])
	{
		int length,area=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter area of lenth: ");
		length=obj.nextInt();
		area=length*length;
		System.out.print("\nArea of Square is: "+area);
	}
	
	
}