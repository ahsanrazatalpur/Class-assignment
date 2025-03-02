class Pcon
{

String a,b,c;	

Pcon(String x,String y,String z)
{
	a=x; b=y; c=z;

}
void Show()
{
	
	System.out.println(a+" "+b+" "+c);
}
	
	public static void main (String args[])
	{
   
      Pcon obj = new  Pcon("Ali" ,"raza" ,"Talpur");
      obj.Show();


	}
}