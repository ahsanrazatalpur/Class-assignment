import java.util.Scanner;
class AreaCircle{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		double raduis=in.nextDouble();
		double area =Math.PI*raduis*raduis;
		System.out.print("Area of circle is :"+area);

	}
}