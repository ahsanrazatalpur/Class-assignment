import java.util.Scanner;
class Questionno6
{
	public static void main(String arg[])
	{
	int amount,a=0,a1=0,b=0,b1,c=0,c1,d=0,d1,e=0,e1,f=0,f1,g=0,g1,h=0,h1,i=0,i1;
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter any Amount: ");
	amount=obj.nextInt();
	a=amount/1000;
	a1=amount%1000;
	b=a1/500;
	b1=a1%500;
	c=b1/100;
	c1=b1%100;
	d=c1/50;
	d1=c1%50;
	e=d1/20;
	e1=d1%20;
	f=d1/10;
	f1=d1%10;
	g=f1/5;
	g1=f1%5;
	h=g1/2;
	h1=g1%2;
	i=h1/1;
	i1=h1%1;
	System.out.print("\n\t1000\t500\t100\t50\t20\t10\t5\t2\t1");
	System.out.print("\n\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+g+"\t"+h+"\t"+i);
	}
	
}