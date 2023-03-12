//write a function for fetch the details from program:
//write a function only return only name class

class student
{
	String name;
	int age;
	
void setdetails(String n,int a)
{
	name=n;
	age=a;
	
}
void displaydetails()
{
	System.out.println("Name is :"+name);
	System.out.println("Age is :"+age);
	
}
int getage()
{
return age;
}
String getname()
{
return name;
}
public static  void main(String []a)
{
student s = new student();
s.setdetails("Ajay",23);
int age=s.getage();
String name=s.getname();
s.displaydetails();
System.out.println("Name is:"+name + " And age is : "  +age);
}
}