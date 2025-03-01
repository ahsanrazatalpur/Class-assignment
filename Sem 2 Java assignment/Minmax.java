import java.util.Scanner;
class Minmax {
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print("Enter any 10 integers: ");
    
        for (int i = 0; i < 10; i++) 
            {
              int num = in.nextInt();

             if (num > max)
              {
                max = num;
              }
             if (num < min)
              {
                min = num;
              }
        }
        System.out.println("largest number : " + max);
        System.out.println("Smallest number: " + min);
    }
}