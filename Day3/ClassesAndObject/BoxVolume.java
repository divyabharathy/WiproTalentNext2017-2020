/******************************************************************************
Create a class Box that uses a parameterized method to initialize the dimensions of a
box.(dimensions are width, height, depth of double type). The class should have a method that can
return volume. Obtain an object and print the corresponding volume in main() function. 
*******************************************************************************/

public class BoxVolume
{
    public double Volume(double w,double h,double d)
    {
        double v=w*h*d;
        return v;
    }
	public static void main(String[] args) {
	    BoxVolume obj=new BoxVolume();
	    double sol= obj.Volume(5.2,3.2,2.9);
	    System.out.println(sol);
	}
}
