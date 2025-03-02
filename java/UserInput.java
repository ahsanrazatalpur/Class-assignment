import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
	{

		String name,fname,caste;
		Scanner x = new Scanner(System.in);
		System.out.print("Enter Your Name :");
		name =x.nextLine();
		System.out.println("Father's name :");
		fname =x.nextLine();
		System.out.println("Enter your caste :");
		caste =x.nextLine();
		System.out.println("Name :"+name);
		System.out.println("Father's Name :"+fname);
		System.out.println("Caste :"+caste);



	}
}