import java.util.*;
public class box
{
    void volume(double a,double b,double c)
    {
        System.out.println(a*b*c);
    }
       public static void main(String[] args) {
           
      box bx = new box();
      Scanner sc=new Scanner(System.in);
      double l,b,h;
      l=sc.nextDouble();
      b=sc.nextDouble();
      h=sc.nextDouble();
      bx.volume(l,b,h);
   }
}

