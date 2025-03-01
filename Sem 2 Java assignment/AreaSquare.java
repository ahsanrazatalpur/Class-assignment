import java.util.Scanner;
class AreaSquare
{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter number of square :");
	int area=in.nextInt();
	double areasquare=area*area;
	System.out.println("Area of Square is      :"+areasquare);
   }
}