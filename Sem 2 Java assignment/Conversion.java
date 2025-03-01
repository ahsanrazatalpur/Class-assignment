import java.util.Scanner;
class Conversion
{
    public static void main(String[] args)
     {
        long input,bin,deci=0,remain;
        long []octal = new long[1000];
        long power = 0;
        int i;
        int j;

        System.out.print("Enter any binary number: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLong();
        bin = input;
        for( i = 0 ; bin != 0 ; i++)
             {
              remain = bin % 10;
              deci += (long)(remain * Math.pow(2,power));
              bin = bin /10;
              power++;
        }

        for( i = 0 ; deci != 0 ; i++){
                remain = deci % 8;
                octal[i] = remain;
                deci = deci / 8;
        }

        System.out.print("octal number is : ");

        for(j = i -1 ; j >= 0 ; j--){
            System.out.print(octal[j]);
        }
    }
}