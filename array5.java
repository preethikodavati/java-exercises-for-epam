import java.util.*;
import java.util.Arrays;
public class array5
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
}
Arrays.sort(a);
System.out.println("first and second largest elements :"+a[n-1]+" "+a[n-2]);
System.out.println("first and second smallest elements :"+a[0]+" "+a[1]);
}
}
