import java.util.Scanner;
class payroll //main class
{
    public static void main(String args[])//main method
    {
 Scanner in=new Scanner(System.in);
 System.out.print("Enter employee name : ");//taking input of employee name
 String name=in.nextLine();
 System.out.print("Enter numbe of hours worked  :");//taking input of number of hour he worked
 double h=in.nextDouble();
 System.out.print("Enter hour charge : ");//taking input he charge per hour
 double c=in.nextDouble();
double grosspay=h*c;//making grosspay by mutipling hour work to hour charge
//printing payroll calculation
System.out.println("Name :"+name);
System.out.print("Number of hour worked"+h);
System.out.println("Per hour charge:"+c);
System.out.println("Total earned :"+grosspay);

    }
}