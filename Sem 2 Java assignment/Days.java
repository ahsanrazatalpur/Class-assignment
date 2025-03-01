import java.util.Scanner;
class Days
{

public static void main(String args[])
{
	Scanner in =new Scanner(System.in);
	System.out.println("Enter number of days");
	int days =in.nextInt();
	int year = days / 365;
	days = days % 365;
	int month = days / 30;
	days = days % 30;
	int weak = days / 7;
	days = days %7;
	System.out.println("Years\tmonths\t weaks\t Days");
	System.out.println(year+"         "+month+"       "+weak+"      "+days);

}
}

