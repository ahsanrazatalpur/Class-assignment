import java.util.Scanner;
class Paysilp
{
	public static void main(String args[])
	{

	Scanner sc =new Scanner(System.in);
	System.out.println("Please enter Basic pay ?");
	Double basicpay=sc.nextDouble();
	Double houserent =4.0*basicpay;
	Double medicalallounce = 18.0*basicpay;
	Double computerallounce = 15.0*basicpay;

	Double totalpay = basicpay+houserent+medicalallounce+computerallounce;

	System.out.println(" \t Paysilp");
	System.out.println("Basic pay                :"+basicpay);
	System.out.println("House Rent (40%)         :"+houserent);
	System.out.println("Medical Allounce (18%)   :" +medicalallounce);
	System.out.println("Computer Allounce (15%)  :"+computerallounce);
	System.out.println("--------------------------------------------");
	System.out.println("Total Pay :"+totalpay);
	}
}
