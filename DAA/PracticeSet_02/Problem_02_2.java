public class Problem_02_2{
    public static void main(String args[]){
        String name = "Programmer";
        char secchar ;
        char seclastchar;
        
        secchar = name.charAt(1);
        seclastchar = name.charAt(name.length()-2);
        
        System.out.println("The Secound char of String is :"+secchar);
        System.out.println("The Secound last char of String is :"+seclastchar);
        
        
    }
}