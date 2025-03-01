import java.util.Scanner;
class AreaRectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width of rectangle  :");
		double width=sc.nextDouble();
		System.out.print("Enter length of rectangle :");
		double length=sc.nextDouble();
		double arearectangle =width*length;
		System.out.print("Area of Rectangle is      :"+arearectangle);

	}
}