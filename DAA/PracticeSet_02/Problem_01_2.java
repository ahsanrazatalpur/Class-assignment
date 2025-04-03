public class Problem_01_2{
    public static void main(String args []){
        String name = "Developer";
        char firstchar;
        char lastchar ;
        
        firstchar=name.charAt(0);
        lastchar=name.charAt(name.length()-1);
        System.out.println("The first char of string is :"+firstchar);
        System.out.println("The last char of string is :"+lastchar);
    }
}