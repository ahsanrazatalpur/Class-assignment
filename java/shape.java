class shape
{
    public static void main(String args[])
    {
        int row=5;
        int columns=10;
        for(int i=1; i<=row ;i++)
        {
            for(int j=1 ;j<=columns ;j++)
        {
        if(i == 1 || i == row && j == 1 || j == columns){
        System.out.print("* ");}
        else{
        System.out.print(" ");
        }
    }
System.out.print();
    }
}