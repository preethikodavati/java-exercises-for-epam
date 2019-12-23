import java.util.*;
public class array9
{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
int a[],i,flag=0,sum=0;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(flag==0&&a[i]!=6)
{
    sum=sum+a[i];
}
if(a[i]==6)
{
    flag=1;
}
if(a[i]==7)
{
    flag=0;
}
}
 System.out.print(sum);
}
}
