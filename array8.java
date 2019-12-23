import java.util.*;
public class array8
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
int max=0,maxi=0;
for (i=0;i<n-1;i++) {
       int c=0;
       for (j=i+1;j<n;j++) {
         if (a[i]==a[j])
             c++;
   }
  if (c>=max)
      maxi=a[i];
 }
 System.out.print(a[i]);
}
}

