import java.util.Scanner;
public class Addition
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1=in.nextInt();

        System.out.println("Enter Secound number ");
        int num2=in.nextInt();

        int result=num1+num2;
        System.out.println(result);

    }

}