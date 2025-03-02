import java.util.Scanner;
class Questionno23
{
	public static void main(String arg[])
	{
		int [] hexadecimal=new int[1000];
		int dec=0;
		int binary;
		int i=1;
		int j;
		int rem;
		System.out.print("Enter a Binary Number: ");
		binary=new Scanner(System.in).nextInt();
		
		while (binary>0)
		{
			rem=binary%2;
			dec=dec+(rem*i);
			binary=binary/10;
			i=i*2;
			
		}
		i=0;
		
		while(dec!=0)
		{
			hexadecimal[i]=dec%16;
			dec=dec/16;
			i++;
		}
		System.out.print("\nHexaDecimal value: ");
		for(j=i-1;j>=0;j--)
		{
			if(hexadecimal[j]>9)
			{
				System.out.print((char)(hexadecimal[j]+55));
				
			}
			else
			{
				System.out.print(hexadecimal[j]);
		}
		}
	
	}


}