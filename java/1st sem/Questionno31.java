import java.util.Scanner;
class Questionno31
{
	public static void main(String arg[])
	{
	 int i,j,n,k=1;
	 System.out.print("Input Numbers: ");
	 Scanner obj=new Scanner(System.in);
	 n=obj.nextInt();
	 for(i=1;i<=n;i++)
	 {
	 for(j=1;j<=i;j++)
	 System.out.print(k++);
	 System.out.println();
	 
	 }
}
}