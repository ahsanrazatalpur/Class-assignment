public class Problem_12_1{
    public static void main(String args []){
        int number = 234;
        int digit = 0;
        int product = 1;
        
        while (number > 0){
        digit = number % 10;
        product *= digit;
        number /= 10;
    
    }
    System.out.print("The product of digits are :"+product);
}
}