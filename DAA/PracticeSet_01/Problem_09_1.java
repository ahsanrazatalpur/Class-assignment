import java.util.Scanner;
public class Problem_09_1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length of Square :");
        Float length = in.nextFloat();
        
        float perimerter = 4*length;
        
        System.out.print("The perimter of square is :"+perimerter);


    }
}