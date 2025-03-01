import  java.util.Scanner;
class Daysinyear
{
    public static void main (String args[])
    {
       
      Scanner in=new Scanner(System.in);
      System.out.println("Enter Number Of Days ");
      int  days= in.nextInt();
      int year = days/365;
      days = days%365;
      int month = days/30;
      days =days%30;
      int weak=days/7;
      days = days%7;
       
        System.out.println("Years    Months   weeks   Days");
         System.out.println(year+"        "+month+"         "+weak+"        "+days);
       
    }
}