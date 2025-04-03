// array (non primative datataype)
// array is collection of same type of data 
// ex we have to store 50 student marks 
// you have two options
// 1 .create 50 different variable
// 2 . use an array   <-- i recomended
// array is an object in java
// accesing elemnt  in array is faster
// array start from 0 index in java
// 3 way to declare an array

public class arr{
    public static void main (String args[]){
       /*1.*/ int marks [] = new int [5]; //  0, 1, 2, 3, 4 ( declaration + memory allocation )
        marks[0] = 99;
        marks[1] = 88;
        marks[2] = 45;
        marks[3] = 77;
        marks[4] = 29;
        marks[4] = 90;
        // if i restore another value in same index the value will be rewrite new value will be shown
        // marks[5] = 90; throw an error bc we just made 5 digit array
        // array index = 0 to n-1

        System.out.println(marks[4]);
        System.out.println(marks[0]);

        /*2. */
        int [] marks1;  // declaration
        marks1 = new int[5]; // memory allocarion 

        /*3. */
        int marks2[] = {32,45,56,78,66}; // size is attomatic decided by java
        System.out.println(marks2.length);
        System.out.println(marks2[3]);


    }
}