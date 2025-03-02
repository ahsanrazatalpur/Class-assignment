import java.util.*;
class Questionno1
{                                  
    public static void main(String ag[])
	{
	  int a=2,b=1,even=0,odd=0,i;
      System.out.print("\nEven Numbers\t\t Odd Numbers");
      for(i=1;i<=15;i++)
	  {
		even=even+a;
		odd=odd+b;
		System.out.print("\n "+a+"\t\t\t\t"+b);
		a=a+2;
		b=b+2;
	  }	
   	  System.out.print("\n___________________________________");
	  System.out.print("\n "+even+"\t\t\t\t"+odd);
		
	}	                                        
	
}