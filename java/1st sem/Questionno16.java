import java.util.Scanner;
class Questionno16
{
	public static void main(String arg[])
	{
	int a=0,b=0,i;
	int sum1=0,sum2=0,sum3=0;
	Scanner obj=new Scanner(System.in);
	System.out.print("Start From:  ");
	a=obj.nextInt();
	System.out.println("Up To:  ");
	b=obj.nextInt();
	System.out.print(" Number \tSquare\tCube ");
	for(i=a;i<=b;i++)
	{
	int j=i*i;
	int k=i*i*i;
	System.out.print("\n  "+i+" \t\t"+j+" \t"+k);
	sum1=sum1+i;
	sum2=sum2+j;
	sum3=sum3+k;
	}
		System.out.print("\n____________________________");
		System.out.print("\nsum:"+sum1+" \t\t"+sum2+" \t"+sum3);
	}

}