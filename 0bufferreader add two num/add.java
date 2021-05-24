import java.io.*;

public class add 
{
public static void main(String args[]) throws IOException
{
int a,b,sum;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first number:");
String c = br.readLine();
a=Integer.parseInt(c);
System.out.println("Enter second number:");
String str = br.readLine();
b=Integer.parseInt(str);
sum =a+b;
System.out.println("Sum is:" +sum);
}
}