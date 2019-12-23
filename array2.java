import java.util.*;
public class array2
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
int a[],i,max=0,min=999;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("maximum :"+max);
System.out.println("minimum :"+min);
}
}
