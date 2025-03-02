import java.util.Scanner;
class Questionno30
{
	public static void main(String [] arg)
	{
		char ch;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Singe Character: ");
		ch=obj.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			{
			System.out.print("Vowel");
			break ;
			}
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			{
			System.out.print("Consonant");
			break ;
			}
			default :
			{
				System.out.print("Error");
}
}
}			}