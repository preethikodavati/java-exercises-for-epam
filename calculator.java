import java.util.*;
import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
      System.out.println(calculator.powerInt(2,4));
      System.out.println(calculator.powerDouble(2,4));
    }
}
class calculator
{
    static int powerInt(int num1,int num2) 
    {
        return (int)Math.pow(num1,num2);
    }
    static double powerDouble(double num1,double num2) 
    {
        return Math.pow(num1,num2);
    }
}
