import java.util.Scanner;
public class Passcounting
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int passcount=0;

        System.out.prinln("Enter number of student in the class :");
        int number=input.nextInt();

       for(int i=1; i<=number; i++)
        System.out.println("Enter"+i+"Student marks");
        int marks=input.nextInt();
        if (marks>50)
        passcount=passcount+1;
        System.out.println("Pass Student are"+passcount);
    }
}