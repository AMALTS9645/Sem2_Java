import java.io.*;

public class addminimalsteps 
{
public static void main(String args[]) throws IOException
{
int a,b;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first number:");
a=Integer.parseInt(br.readLine());
System.out.println("Enter second number:");
b=Integer.parseInt(br.readLine());
System.out.println("Sum is:" +(a+b));
}
}