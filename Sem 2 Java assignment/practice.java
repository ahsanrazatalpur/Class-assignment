class Evenodd
{
	public static void main(String args[])
	{
		int number,even=0,odd=0;
		System.out.print("Even  odd");
		for(number=1; number<=30; number++)
		{
			if(number%2==0)
			{
				even+=number;
				System.out.print("\t\t"+number+"\t");
			}
			else
			{
				odd+=number	;			
				System.out.println("\t"+number);
			}
		}
		System.out.println("________________________");
		System.out.println("Sum:"+"\t"+even+"\t\t"+odd);
	}
}