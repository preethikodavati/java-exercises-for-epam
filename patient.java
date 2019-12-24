import java.util.*;
import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        patient pt=new patient();
        pt.name=sc.next();
        pt.weight=sc.nextInt();
        pt.height=sc.nextInt();
      System.out.println(pt.BMI());
    }
}
class patient
{
    static String name;
    static int weight,height;
    
    static double BMI() 
    {
       double BMI = (weight/(height*height))*703;
       return BMI;
    }

}
