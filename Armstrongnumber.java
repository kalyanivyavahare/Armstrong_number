
import java.util.Scanner;
class Armstrongnumber 
{
public static void main(String [] args)
{
Scanner kal=new Scanner(System.in);
System.out.println("Enter the number a");
int a= kal.nextInt();
int a1=a;
int a2=a;
int c=0;
int sum=0;

while(a1>0)
{
int rem=a1%10;
c++;
a1=a1/10;
}

while(a2>0)
{
int rem1=a2%10;
int result=1;


for(int i=1;i<=c;i++)
{
result=result*rem1;
}

sum=sum+result;
a2=a2/10;
}

if(sum==a)
{
System.out.println(" It is an armstrong number");
}
else
{
System.out.println(" It is not an armstrong number");
}
}
}
