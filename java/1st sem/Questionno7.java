import java.util.Scanner;
class Questionno7
{
	public static void main(String arg[])
	{
   int eng,basic,ic,math,cp,sum=0;
   float per;
   Scanner obj=new Scanner(System.in);
   System.out.print("\n.....................MARKSHEET...................... ");
   System.out.print("\nROLL NO\t\tSUBJECT\t\tMARKS ");
   System.out.print("\n2K20/BLCS/01\tENGLISH  : ");
   eng=obj.nextInt();
   System.out.print("\n2K20/BLCS/02\tBASIC ELECTRONI : ");
   basic=obj.nextInt();
   System.out.print("\n2K20/BLCS/03\tINTRODUCTION C : ");
   ic=obj.nextInt();
   System.out.print("\n2K20/BLCS/04\tMATHAMATIC  : ");
   math=obj.nextInt();
   System.out.print("\n2K20/BLCS/05\tC PROGRAMMING : ");
   cp=obj.nextInt();
  System.out.print("......................................................... ") ;  
  System.out.print("\n...................................................... ");
  sum=eng+basic+ic+math+cp;
  System.out.print("\n                                    Total:"+sum);
 per=(sum*100)/500;
 System.out.print("\n                              Percentage%:"+per);
	
	}
}