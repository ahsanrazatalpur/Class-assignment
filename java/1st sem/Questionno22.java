import java.util.Scanner;
class Questionno22
{
	public static void main(String [] arg)
	{
		int numbers,temp,reverse=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter any Numbers: ");
		numbers=obj.nextInt();
		while(numbers>0)
		{
			temp=numbers%10;
			numbers=numbers/10;
			reverse=(reverse*10)+temp;
			
		}
		System.out.print("Reverse is: "+reverse);
	}


}