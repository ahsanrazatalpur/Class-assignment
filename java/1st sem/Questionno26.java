import java.util.Scanner;
class Questionno26
{
	public static void main(String arg[])
	{
		String name,reverse= "";
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		name=obj.nextLine();
		int length=name.length();
		for(int i=length-1;i>=0;i--)
		
			reverse=reverse+name.charAt(i);
			System.out.print("\n Reverse of the string: "+reverse);
				
	
	}


}