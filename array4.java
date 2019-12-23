import java.util.*;
public class array4
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
int a[],i;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
System.out.print((char)a[i]+" ");
}
}
}
