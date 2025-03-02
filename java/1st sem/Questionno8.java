import java.util.Scanner;
class Questionno8
{
    public static void main(String arg[])
	{
		int radius;
		double Circle;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Radius: ");
		radius=obj.nextInt();
		Circle=3.14*(radius*radius);
		System.out.print("\n Area of Circle is : "+Circle);
	}
   

}