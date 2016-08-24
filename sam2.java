import java.util.*;
import java.io.*;
class sam2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter no of values");
int n=s.nextInt();
a a1=new a();
System.out.println(a1.fun(n));
}
}
class a
{
int fun(int n)
{
int a[]=new int[n];
int i=0;
while(i<n)
{
a[i]=s.nextInt();
i++;
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(a[i]==i)
{
return a[i];
}
}
}
}
