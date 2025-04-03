import java.util.Scanner;
public class Array{
    public static void main (String args[]){
// Array in java (collection of same typeof data)
// type [] arrayName = new type [size];

// [] mean array in java
// we use new keyword to take new space in memory 
// when we want to declare non-primitive variable we use new keyword
// array index start from 0  thts why array in java is zero-indexed
       /*  String city [] = new String[5];
       city[0] = "Badin";
       city[1] = "Hyderabad";
       city[2] = "Karachi";
       city[3] = "Lahore";
       city[4] = "islamabad";
       
       System.out.println(city[0]);
       System.out.println(city[1]);
       System.out.println(city[2]);
       System.out.println(city[3]);
       System.out.println(city[4]); */
    
    //    int [] marks = new int [5];
       // or  int marks [] = new int [5];
    //    marks[0] = 34;
    //    marks[1] = 45;
    //    marks[2] = 67;
    //    marks[3] = 56;
    //    marks[4] = 78;

   /*   System.out.println (marks[4]);
     System.out.println (marks[3]);
     System.out.println (marks[2]);
     System.out.println (marks[1]);
     System.out.println (marks[0]);

     
     for(int i=0; i<marks.length; i++ ){
        System.out.println(marks[i]);
    }*/
     
     /*for(int i=marks.length; i<0; i--){
     System.out.print(marks[i]);
     } */
 
     // if we know the size 
    //  int marks1 [] = {34,56,67,45};
    Scanner in = new Scanner (System.in);
    int [] number = new int [5];
        number = in.nextInt();
        for(int i=0; i<number.length; i++);

    }}
    