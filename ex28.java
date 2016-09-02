import java.util.*;
class ex28
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer s1=new StringBuffer("");
System.out.println("enter string");
string s=sc.next();
char c[]=s.toCharArray();
Set<charcter> a=new TreeSet<charcter>();
for(int i=0;i<s.length();i++)
a.add(c[i]);
for(char d:a)
s1.append(d);
System.out.println(s1.toString());
}
}


