import java.util.Scanner;
class Table
{
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Table no ?");
    int a=in.nextInt();
    System.out.print("Start from ?");
    int b=in.nextInt();
    System.out.print("upto ?");
    int c=in.nextInt();
    
    System.out.println("Enter table no?"+" "+a);
    System.out.println("Start from ?"+" "+b);
    System.out.println("Up to ?"+" "+c);
    int sum=0;int n=0;int ressum=0;
    for(int i=b;i<=c;i++)
    {
    	int result=i*a;
    	System.out.println("     "+i+"  "+"x"+" "+a+" "+result);
    	sum +=i;
    	//sum+=a;
    	n+=a;
    	ressum+=a*i;
    }
    System.out.println("--------------------------");
    System.out.print("Sum :"+sum+" "+n+" "+ressum);
    in.close();

	}
}