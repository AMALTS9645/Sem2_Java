class Student
{
private int id;
private String name;
Student()
{
id=1;
name="Arun";
}
void display()
{
System.out.println(id+" "+name);
}
void disp()  //just added one more method
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.display();
s2.display();
s1.disp();
s2.disp();
}
}