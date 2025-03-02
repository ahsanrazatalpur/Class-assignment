class Elseif
{
    
    public static void main(String args[])
    {
        int marks=70;
        if(marks>=50 && marks<=59)
        {
            System.out.println("You got C grade");
        }
        else if(marks>=60 && marks <=69)
        {
            System.out.print("you got B grade");
        }
        else if (marks>=70 && marks <=79)
        {
            System.out.println("You got A grade");
        }
        else
        {
          System.out.println("You are Fail");

        }
    }
}