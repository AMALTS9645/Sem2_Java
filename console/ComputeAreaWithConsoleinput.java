import java.io.*;
import java.util.*;
public class ComputeAreaWithConsoleinput
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter the value of radius:");
double radius=input.nextDouble();
double area=radius*radius*3.14159;
System.out.println("the area of circle of radius"+radius+"is"+area);
}
}