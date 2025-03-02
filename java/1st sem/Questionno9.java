import java.util.Scanner;
class Questionno9
{
	public static void main(String arg[])
	{
		int no,start=0,up,b=0;
		int sum=0,c=0,d=0;
		Scanner  obj=new Scanner(System.in);
		System.out.print("Enter table No: ");
	    no=obj.nextInt();
		System.out.print("\n Start Fronm: ");
	   start=obj.nextInt();
	   System.out.print("\n  Up TO     : ");
	   up=obj.nextInt();
	   for(int i=start;i<=up;i++)
	   {
		  int a=i*no;
		   b=b+start;
			System.out.print("\n\t"+b+"x"+no+"="+a);
			sum=sum+no;
			c=c+a;
			d=d+b;
	   }
	   System.out.print("\n____________________________");
	System.out.print("\n Sum : "+d+" "+sum+" "+c);
	}


}