class EvenOdd
{
	public static void main(String args[])
	{
	int even=0,odd=0;
	System.out.print("\tEven numbers   Odd numbers");
	System.out.println();
	for(int a=1;a<=30;a++)
	{
		if(a%2==0)
		{
			even+=a;
			System.out.println("\t\t"+a+"\t");
		}
	
	else 
	{
		odd+=a;
		System.out.print("\t "+a);
	    
	}
}
	System.out.println("------------------------------");
	System.out.println("Sum :"+  "\t"+even+" \t\t"+odd);
}
      }
