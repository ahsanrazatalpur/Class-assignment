public class foreach {
    public static void main(String args[]){
        // for each loop used mainly to fetch the value from a collection like an array
        // it fetch value one by one of an array and store i its variable and print
        // for(datatype variable : collection)
        // Doesnot need to tell starting or ending index it by defaul strat from 0 and end till end
        int [] number = {23, 45, 56, 67, 76};
        String [] names = {"Ahsan","ALi","Ayaz","Gull"};
        int [] marks = {32, 45, 65, 56};
        for(int num : number){
        System.out.print(num+" ");
        }

        for(String cozns : names){
            System.out.print(cozns+" ");
        }

        for(int fmark : marks){
            System.out.print(fmark+" ");
        }


    
}
    
}
