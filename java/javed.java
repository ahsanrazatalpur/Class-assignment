 class Demo {
 
 int mob =311312534;
 int nic = 4110;
 int rollno = 6;
}

class Demo1 {

String name     = "Ahsan raza";
String fname    = "Amir Ali";
String standard = "computer science";
}
class Demo2 {
public static void main(String args[])
{
Demo  obj1  = new Demo();
Demo1 obj2  = new Demo1();

System.out.println(obj1.mob+" "+obj2.name);
System.out.println(obj1.nic+" "+obj2.fname);
System.out.println(obj1.rollno+" "+obj2.standard);



}

}