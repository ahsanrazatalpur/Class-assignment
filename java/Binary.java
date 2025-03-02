class Binary
{
    public static void main(String args[])
    {
        int n,i,item,c=0,mid=0,beg=0;
        int a[];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number of item added to Array");
        n=in.nextInt();
        a = new int[n];

        System.out.print("Enter item");
        for(i=0; i<n; i++)
        a[i]=in.nextInt();

        System.out.println("Set Target");
        item=in.nextInt();
        mid=0;beg=n-1;
        while(item==a[mid])
        {
            mid=(beg+end)/2;
            System.out.println("item searched at"+mid);
        }
        else if(item>a[mid])
        {
        beg=mid+1;s

        }
    }
}