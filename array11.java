import java.util.*;
import java.lang.Math;
public class MyClass
{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
int a[][],i,j,max=0;
n=sc.nextInt();
if(n<9||n>9)
{
 System.out.println("please enter only 9 integer numbers");
}
else
{
n=(int)(Math.sqrt(n));
a=new int[n][n];
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
a[i][j]=sc.nextInt();
if(a[i][j]>max)
    max=a[i][j]; 
}
}

System.out.println("The biggest number in the given array is "+max);
}
}
}
