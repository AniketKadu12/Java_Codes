import java.util.Scanner;
class nenon_no
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no");
int a=sc.nextInt();
int sum=0;
int rem=0;
int sq=a*a;
while (a<0)
{
rem=a/10;
sum=sum+a;
a=a/10;
}
if (a==sum)
{
System.out.println("This is nenon no");
}
else
System.out.println("nenon no");
}
}