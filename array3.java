import java.util.*;
public class array3
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
int a[],i,key,flag=0;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
key=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==key)
{
 System.out.println(i+1);
 flag=1;
 break;
} 
}
if(flag==0)
{
System.out.println("-1");
}
}
}
