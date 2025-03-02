class A{
String name = "Ahsan Raza";
String fname = "Amir ali";
String gname = "G.nabi";
}
class B{
int age = 20;
int mobno = 3256266;
int nic = 652462444;
}
class C{
public static void main(String args[])
{
A obj1 = new A();
B obj2 = new B();

System.out.println(obj1.name +" "+ obj2.age);
System.out.println(obj1.fname +" "+ obj2.mobno);
System.out.println(obj1.gname +" "+ obj2.nic);
}
}
