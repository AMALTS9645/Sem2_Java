import java.util.Scanner;
public class Product
{
int price;
String pname,pcode;
public static void low(int a,int b,int c)
{
int p1=a;
int p2=b;
int p3=c;
float lowest;
if(p1<p2 && p1<p3)
{
System.out.print("product 1 has the lowest price ="+p1 );
}
else if(p2<p1 && p2<p3)
{
System.out.print("product 2 has the lowest price ="+p2 );
}
else
{
System.out.print("product 3 has the lowest price ="+p3 );
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Product p1= new Product();
Product p2= new Product();
Product p3= new Product();
System.out.println("____________FIRST PRODUCT DETAILS____________");
System.out.print("Enter the CODE : ");
p1.pcode =sc.next();
System.out.print("Enter the NAME : ");
p1.pname = sc.next();
System.out.print("Enter the PRICE : ");
p1.price=sc.nextInt();

System.out.println("_____________SECOND PRODUCT DETAILS__________");
System.out.print("Enter the CODE : ");
p2.pcode =sc.next();
System.out.print("Enter the NAME : ");
p2.pname = sc.next();
System.out.print("Enter the PRICE : ");
p2.price = sc.nextInt();

System.out.println("___________THIRD PRODUCT DETAILS____________");
System.out.print("Enter the CODE : ");
p3.pcode =sc.next();
System.out.print("Enter the NAME : ");
p3.pname = sc.next();
System.out.print("Enter the PRICE : ");
p3.price = sc.nextInt();
Product.low(p1.price,p2.price,p3.price);
}
}