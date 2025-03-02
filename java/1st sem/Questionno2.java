import java.util.Scanner;
class Questionno2
{
	public static void main(String arg[])
	{
		int pay,HouseRent,MedicalAllounce,ComputerAllounce,total=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Basic Pay: ");
		pay=obj.nextInt();
		HouseRent=(pay*40)/100;
		MedicalAllounce=(pay*18)/100;
		ComputerAllounce=(pay*15)/100;
		System.out.print("\nBasic Pay   : "+pay);
		System.out.print("\nHouse Rent(40%)   : "+HouseRent);
		System.out.print("\nMedicalAllounce (18%) : "+MedicalAllounce);
		System.out.print("\nComputerAllounce(15%) :"+ComputerAllounce);
		System.out.print("\n___________________________");
		total=pay+HouseRent+MedicalAllounce+ComputerAllounce;
		System.out.print("\nTotal        		:"+total);
	}
	
}