import java.util.Scanner;
class Notes
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter amount to cahnge to coin :");
		int amount=in.nextInt();
		int[]denominations = {1000,500,100,50,20,10,5,2,1};
		int[] counts = new int[denominations.length];
		for(int a=0;a<denominations.length;a++)
		{
			counts[a]=amount/denominations[a];
			amount % = denominations[a];

		}
		System.out.print("Output:");
		for(inta=0;a<denominations.length;i++)
		{
			System.out.print(denominations[a]+" ");
		}
		System.out.println();
		for(int a=0;a<counts.length;a++)
	{
		System.out.print(counts[a]+" ");
	}
	Scanner.close();

		}
	}
