import java.util.Scanner;
class Marksheet
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter Your Roll number :");
		String rollno=in.nextLine();

		// subject name
		System.out.print("Enter subject1  :");
		String sub1=in.nextLine();
		System.out.print("Enter subject2  :");
		String sub2=in.nextLine();
		System.out.print("Enter subject3  :");
		String sub3=in.nextLine();
		System.out.print("Enter subject4  :");
		String sub4=in.nextLine();
		System.out.print("Enter subject5  :");
		String sub5=in.nextLine();
	
		// subject marks
		
		System.out.print("Enter"+" "+sub1+" "+"marks :");
		int mark1=in.nextInt();
		System.out.print("Enter"+" "+sub2+" "+"marks :");
		int mark2=in.nextInt();
		System.out.print("Enter"+" "+sub3+" "+"marks :");
		int mark3=in.nextInt();
		System.out.print("Enter"+" "+sub4+" "+"marks :");
		int mark4=in.nextInt();
		System.out.print("Enter"+" "+sub5+" "+"marks :");
		int mark5=in.nextInt();

		int totalmarks=mark1+mark2+mark3+mark4+mark5;
		float percentage =100*totalmarks/500;

		//output
		System.out.println("		M A R K S H E E t");
		System.out.println("Roll No       Subjects           Marks");
		System.out.println(rollno+"         "+sub1+"					"+mark1);
		System.out.println(rollno+"         "+sub2+"					"+mark2);
		System.out.println(rollno+"         "+sub3+"					"+mark3);
		System.out.println(rollno+"         "+sub4+"					"+mark4);
		System.out.println(rollno+"         "+sub5+"					"+mark5);
		System.out.println("			"+"Total Marks  :"+totalmarks);
		System.out.println("			"+"Percentage % :"+percentage);
	}}



	