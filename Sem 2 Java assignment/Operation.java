import java.util.Scanner;
class Operation {
    public static void main(String args[])
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int sum = input1 + input2;
        int product = input1 * input2;
        int difference = input1 - input2;
        int quotient = input1 / input2 ;
        int remainder =  input1 % input2 ;

        System.out.println("Sum of " + input1 + " and " + input2 + " is          " + sum);
        System.out.println("Product of " + input1 + " and " + input2 + " is      " + product);
        System.out.println("Difference of " + input1 + " and " + input2 + " is   " + difference);
        System.out.println("Quotient of " + input1 + " and " + input2 + " is     " + quotient);
        System.out.println("Remainder of " + input1 + " and " + input2 + " is    " + remainder);

        int total = sum + product + difference + quotient + remainder;
        System.out.println("---------------------------------------");
        System.out.println("Total is :                 "+total);
    }
}


