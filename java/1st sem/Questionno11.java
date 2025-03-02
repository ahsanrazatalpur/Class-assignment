import java.util.Scanner;
class  Questionno11
{
	public static void main(String arg[])
	{
		int large=0;
		int small=Integer.MAX_VALUE;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		for(int i=1;i<=5;i++)
		{
		  int a=obj.nextInt();
		  if(a>large)
		  {
		  large=a;
		  
		  }
		  if(a<small)
		  {
		  small=a;
	
		  }
		
		
		}
	
	System.out.print("\n Large "+large+"\nSmall  "+small);
	
	}


}