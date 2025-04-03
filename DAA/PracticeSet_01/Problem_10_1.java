import java.util.Scanner;
public class Problem_10_1{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temperature in Calcuis :");
        Float temInCalcuis = in.nextFloat();

        float farhenheit = (temInCalcuis*9/5)+32;

        System.out.println("The Tempertaure in Ferhenheit is :"+farhenheit);

    }
}