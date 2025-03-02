import java.util.Scanner;
class Questionno15
{
	public static void main(String arg[])
	{
		int year,day,week;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enetr the number of days: ");
		day=obj.nextInt();
		year=day/365;
		day=day%365;
		System.out.print("No of Year: "+year);
		week=day/7;
		day=day%7;
		System.out.print("No of Week: "+week);
	int	temp=day;
		System.out.print("No of days: "+temp);
	
	
	}


}