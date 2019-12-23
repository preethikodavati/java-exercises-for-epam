import java.util.*;
import java.util.Arrays;
public class array6
{
public static void main(String[] args) {
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
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}	
}
}
