import java.util.Scanner;
class ex
{
public satic void main(String args[])
{
int n,i,j,c=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the no of value");
n=s.nextInt();
System.out.println("enter the values");
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]!=a[j])
c++;
}
if(c==1)
{
System.out.println(a[i]);
break;
}
continue;
}
}
}
