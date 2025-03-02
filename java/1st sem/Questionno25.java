import java.util.Scanner;
class Questionno25
{
	public static void main(String arg[])
	{
	long binary1,binary2;
	int i=0, j=0;
	
	int[] sum=new int[10];
	
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter firstBinary Number: ");
	binary1=obj.nextLong();
	System.out.print("Enter Second Binary Number: ");
    binary2=obj.nextLong();
	
	while(binary1 !=0|| binary2 !=0)
	{
		sum[i++]=(int)((binary1 % 10 + binary2 % 10 + j) % 2);
		j=(int)((binary1 % 10 + binary2 % 10 +j)/ 2);
		binary1=binary1 / 10;
		binary2=binary2 / 10;
	}
	if(j !=0)
	{
		sum[i++]=j;
	}
		i--;
		System.out.print("Outpuut : ");
		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
		System.out.print("\n");
}
}