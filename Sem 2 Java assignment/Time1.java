import java.util.Scanner;
class Time1
{
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Secounds :");
	int seconds=in.nextInt();
	System.out.println("Hour  Minutes  Seconds");
	int hour=seconds/3600;
	int min=(seconds%3600)/60;
	int sec=(seconds%3600)%60;
	System.out.print(hour+"      "+min+"       "+sec);
}
}