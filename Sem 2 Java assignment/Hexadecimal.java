 import java.util.Scanner;

class Hexadecimal{
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
int hexa=0, base=1;
System.out.print("\n\tEnter any binary number? ");
int binary = input.nextInt();
while (binary>0) {
int  reminder = binary % 10;
hexa = hexa + reminder * base;
base = base * 2;
binary = binary / 10;
        }
System.out.println("\tHexaDecimal Number is:"+hexa);
    }
}