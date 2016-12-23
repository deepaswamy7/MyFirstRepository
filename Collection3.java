package pkge1;

import java.util.Hashtable;
import java.util.Map;
import java.util.*;
import java.io.*;

public class Collection3 
{

public static void main(String args[]) throws IOException
{
String str;
int maxmarks=0;
Hashtable<String,Integer> student = new Hashtable<String,Integer>();
Enumeration<String> names;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number of many Records ");
int n=Integer.parseInt(br.readLine());

for (int i=1;i<=n;i++)
{
System.out.println("Enter Name Of "+ i +" Student");
str=br.readLine();
System.out.println("Enter Marks Of "+ i +" Student");
int marks=Integer.parseInt(br.readLine());
student.put(str, marks);
}

//reading keys of hash table into enumeration
names = student.keys();

while(names.hasMoreElements())
{
str = (String) names.nextElement();
System.out.println(str + ":" + student.get(str));

if(maxmarks<student.get(str))
{
maxmarks=student.get(str);
}
}
System.out.println("Maximum Marks Is "+maxmarks);
}
}
