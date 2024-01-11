import java.util.Scanner;
class Primenumber
{
public static void main(String []args)
{
Scanner  kal=new Scanner (System.in);
System.out.println("enter the number b");
int b=kal.nextInt();
int c=0;
if(b==0||b==1)
{
System.out.println("not prime");
}
else
{
for (int i=2;i<b;i++)
{
if(b%i==0)
{
c++;
break;
}
}
if(c==0)
{
System.out.println(" It is a prime number");
}
else
{
System.out.println(" it is not prime number");
}
}
}
}
