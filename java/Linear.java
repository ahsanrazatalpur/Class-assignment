import java .util.Scanner;
public class Linear{
    public static void main(String args[])
    {
        int n,item,i,c=0;
        int []a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of element");
        n=sc.nextInt();
        a=new int[n];

        System.out.print("Enter Elements");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println("ENter Item to find ");
        item=sc.nextInt();

        for(i=0;i<a.length;i++)
        if(a[i]==item)
        {
            c++;
            break;
        }
        if(c>0)
        {
            System.out.print("item find "+i);
            
        }
else{
    System.out.println("item cannot find");
}



    }
}