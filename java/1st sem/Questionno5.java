import java.util.Scanner;
class Questionno5
{
	public static void main(String[] arg)
	{
		int length,breath,area=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Length of Rectangle: ");
		length=obj.nextInt();
		System.out.print("\nEnter the Breath of Rectangle: ");
		breath=obj.nextInt();
		int rectangle=length*breath;
		System.out.print("\n Area of Rectangle is : "+rectangle);
		
		
	}
}