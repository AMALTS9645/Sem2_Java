import java.io.Console;
import java.util.Scanner;
public class cmdtest2
{
public static void main(String args[])
{
Console c=System.console();
System.out.println("enter your name :");
String n=c.readLine();
System.out.println("welcome"+n);
System.out.println("enter your password:");
char[] ch=c.readPassword();
String pass=String.valueOf(ch);//converting char array into string
System.out.println("passwrod is :"+pass);
}
}