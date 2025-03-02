import java.util.Scanner;
class operaion
{
    public static void main(String args[])
    {
        
Scanner in = new Scanner(System.in);
System.out.print("Enter first integer :");
int a=in.nextInt();
System.out.print("Enter second integer :");
int b=in.nextInt();
System.out.println("Sum is   "+(a+b));
System.out.println("Product is  "+(a*b));
System.out.println("Difference is  "+(a-b));
System.out.println("Quotient is  "+(a/b));
    }
}