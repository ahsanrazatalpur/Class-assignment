class Abcc{
	
	String name;long mob;boolean b;

	Abcc(String a,long l, boolean d )
	{
		name = a; mob=l; b=d;

	}
	void Show()
	{
		System.out.print(name+" "+mob+" "+b);
	}

	public static void main(String args[])
	{

		Abcc obj = new Abcc ("Ahsan", 3113125335L, true);
		obj.Show();

	}
}