public class Problem_06_2{
    public static void main(String args[]){
        String name="iron man";
        int index = 2;
         if(index < name.length()-1){
        System.out.print("The char at "+index+" Index is :"+name.charAt(index));
         }
         else{
            System.out.print("Invalid Index");
         }
    }
}