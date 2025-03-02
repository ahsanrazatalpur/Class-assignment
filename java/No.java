import java.util.Scanner;
class No{
	public static void main(String args[])
	{
		String name;
		long mobile;
		char grade;

		Scanner obj =new Scanner(System.in);

		System.out.print("Enter Your Name =");
		name=obj.nextLine();
		System.out.print("Enter Your Mobile Number =");
		mobile=obj.nextLong();
		System.out.print("Enter your Grade :");
		grade=obj.next().charAt(0);

		System.out.println("Name ="+name);
		System.out.println("Mobile ="+mobile);
		System.out.println("Grade ="+grade);

	}
}