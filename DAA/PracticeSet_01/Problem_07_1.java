import java.util.Scanner;
public class Problem_07_1{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int a = in.nextInt();
        System.out.println("Please enter second number :");
        int b = in.nextInt();
        System.out.println("Please enter third number :");
        int c = in.nextInt();

        int average = (a + b + c)/3;
        System.out.print("The average of three numbers are :"+average); 

    }
}