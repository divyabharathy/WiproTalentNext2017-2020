/******************************************************************************
Create a new class called “Calculator” which contains the following:
1. A static method called powerInt(int num1,int num2) that accepts two integers and returns
num1 to the power of num2 (num1 power num2).
2. A static method called powerDouble(double num1,int num2) that accepts one double and one
integer and returns num1 to the power of num2 (num1 power num2).
3. Call your method from another class without instantiating the class (i.e. call it like
Calculator.powerInt(12,10) since your methods are defined to be static)
Hint: Use Math.pow(double,double) to calculate the power. 
*******************************************************************************/
class Calculator
{
    public static int powerInt(int num1,int num2)
    {
        int pow=1;
        for(int i=0;i<num2;i++)
        {
            pow*=num1;
        }
        return pow;
    }
    public static double powerDouble(double num1,int num2)
    {
        double pow=1;
        for(int i=0;i<num2;i++)
        {
            pow*=num1;
        }
        return pow;
    }
}
public class PowerCalc
{
	public static void main(String[] args) {
	    int pow=Calculator.powerInt(5,3);
	    System.out.println(pow);
	    double power=Calculator.powerDouble(3.4,5);
	    System.out.println(power);
	}
}
