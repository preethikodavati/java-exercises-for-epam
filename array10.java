import java.util.*;
public class Main
{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
int a[][],i,j;
n=sc.nextInt();
if(n<4||n>4)
{
 System.out.println("please enter only 4 integer numbers");
}
a=new int[n/2][n/2];
for(i=0;i<n/2;i++)
{
    for(j=0;j<n/2;j++)
    {
a[i][j]=sc.nextInt();
}
}
for(i=0;i<n/2;i++)
{
    for(j=0;j<n/2;j++)
    {
System.out.print(a[(n/2)-1-i][(n/2)-1-j]+" ");
}
System.out.println();
}
}
}
