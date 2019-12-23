import java.util.*;
import java.util.Arrays;
public class array7
{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
int a[],i,j;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{
    for(j=i+1;j<n;j++)
    {
       if(a[i]==a[j])
       {
           a[j]=0;
       }
    }
}
for(i=0;i<n;i++)
{
    if(a[i]!=0)
    {
System.out.print(a[i]+" ");
}
}	}
}
