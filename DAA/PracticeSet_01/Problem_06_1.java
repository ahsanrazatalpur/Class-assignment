import java.util.Scanner;
public class Problem_06_1 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("please enter second number : ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int quo = num1 % num2;

        System.out.println("The Sum of two numbers is :"+sum);
        System.out.println("The difference of two numbers is :"+diff);
        System.out.println("The multiplication of two numbers is :"+mul);
        System.out.println("The Division of two numbers is :"+div);
        System.out.println("The Reminder of two numbers is :"+quo);
    }
    
}
