import java.util.Scanner;
public class Problem_08_1{
    public static void main (String args []){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Length of rectangle");
    float length = in.nextFloat();
    System.out.println("Enter the Width of rectangle");
    float width = in.nextFloat();
    
    float areaOfRecatngle = length * width;
    System.out.print("The Area of rectangle is :"+areaOfRecatngle);
    


    }
}