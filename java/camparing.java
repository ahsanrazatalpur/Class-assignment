import java.util.Scanner;
class camparing
{
public static void main(String args[])
{
    Scanner in = new Scanner (System.in);
    System.out.print("Enter 1st no");
    int a=in.nextInt();
    System.out.print("Enter 2nd no ");
    int b=in.nextInt();
    if(a>b)
    System.out.print("nuber is larger");
    if(a==b)
    System.out.print("The number is equal");
    else
    System.out.print("Out of recuirement");
}
}