import java.util.Scanner; 
class Numbercheck{ 
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.print("\nEnter a number :");
int num= input.nextInt();
if(num>=0){
System.out.println("It is Positive");
   }
 else System.out.println("It is Negative");
  }
}