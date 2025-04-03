public class problem_13_1{
    public static void main(String args []){
        int number = 12345;
        int digit = 0;
        
        while(number > 0){
            digit = number % 10;
            number /= 10;

        }
        System.out.print("The reverse of number is:"+digit);
    
    }
}