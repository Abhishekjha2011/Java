class Demo1 
{
public static void main(String args[])
{
    Student s= new Student ();
    s.name ="Abhishek";
    s.age =23;
    s.PrintDetails();
}


}

/*
Create a student class having  attributes :name and age and a method: printdetails().The Purpose of print Details() method is to print the details of student.
*/

class Student
{
String name  ;
int age;
void PrintDetails()
{
System.out.println("Name"+name);
System.out.println("Age"+age);
}}


