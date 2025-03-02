import java.util.Scanner;
class Questionno10
{
	public static void main(String arg[])
	{
		int seconds;
		Scanner obj=new Scanner(System.in);
		System.out.print("Input Seconds: ");
		seconds=obj.nextInt();
	int	a=seconds/3600;
	int	a1=seconds%3600;
	int b=seconds/60;
	int b1=seconds%60;
		System.out.print(" Hours: "+a+" Minutes: "+b+" Seconds: "+seconds);
	
	}

}