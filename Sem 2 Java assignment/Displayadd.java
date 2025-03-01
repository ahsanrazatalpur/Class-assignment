import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int input1;
        int input2;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter first number: ");
        input1 = scan.nextInt();
        System.out.print("Enter last number: ");
        input2 = scan.nextInt();
        System.out.print("sum is: ");
        for(int i = input1 ; i <= input2 ; i++)
            {if(i == input2){
                System.out.print(i + " = ");
                sum +=i;
            }
            else{
            System.out.print(i + " + ");
            sum += i;}
        }
        System.out.println(sum);
    }
}