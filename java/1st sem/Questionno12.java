import java.util.Scanner;
class Questionno12
{
public static void main(String args[])
{
int a,b,s,p,d,q,r,total;
System.out.print("ENTER TWO NUMBERS ?");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
s=a+b;
p=a*b;
d=a-b;
q=a/b;
r=a%b;
total=s+p+d+q+r;
System.out.println("SUM OF "+a+"and   "+b+"   IS "+s);
System.out.println("PRODUCT OF   "+a+"and     "+b+"   IS "+p);
System.out.println("DIFFERENCE OF   "+a+"and    "+b+"   IS "+d);
System.out.println("QUOTIENT OF   "+a+"and    "+b+"   IS "+q);
System.out.println("REMINDER OF  "+a+"and   "+b+"   IS "+r);
System.out.println("---------------------------------------------------------------------------------------------------------------");
System.out.println("Total is \t\t"+total);
}
}