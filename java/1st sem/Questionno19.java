import java.util.Scanner;
class Questionno19
{
	public static void main(String arg[])
	{
		int i=0;
		int j;
		int dnum;
		int [] bArr=new int[20];
		System.out.print("Enter Decimal no: ");
		dnum=new Scanner(System.in).nextInt();
		if(dnum==0)
		{
			System.out.print("\nBinary string is 0");
			System.exit(0);
		}
		while(dnum>0)
		{
			
			bArr[i]=dnum%2;
			dnum=dnum/2;
			i++;
			
		}
		System.out.print("Binary string is : ");
		for(j=i-1;j>=0;j--)
		{
			System.out.print(bArr[j]);
			
		}
		
	}


}