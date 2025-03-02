import java.util.Scanner;
class Questionno13
{
	public static void main(String arg[])
	{
		int binary;
		int remainder;
		int decimal=0;
		int octal=0;
		int i=1;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Binary Number (0-1): ");
		binary=obj.nextInt();
		while(binary!=0)
		{
			remainder=binary%10;
			decimal=decimal+(remainder*i);
			binary=binary/10;
			i=i*2;
			
			
		}
		
		i=1;
		while(decimal!=0)
		{
			remainder=decimal%8;
			octal=octal+(remainder*i);
			decimal=decimal/8;
			i=i*10;
		}
		
		System.out.print("octal Number : "+octal);
		
		
	
	}

}