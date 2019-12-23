import java.util.*;
public class array1
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
int a[],i,sum=0;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("sum :"+sum);
System.out.println("avg :"+(sum)/n);
}
}
