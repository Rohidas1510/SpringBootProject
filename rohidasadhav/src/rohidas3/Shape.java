package rohidas3;
class Circle extends Shape  //Circle is child class 
{
	public void getArea() // method
	{
		int r=7;
		double  pi = 3.14;
		double area =pi*r*r;    // calculate area of circle
		System.out.println(area);
		
	}
}
class Square extends Shape//Square is child class 
{
	public void getArea() // method
	{
		int a=2;
		double area=a*a;   // calculate area of Square 
		System.out.println(area);
	}
}

public class Shape  // parent class
{

	public static void main(String[] args)
	{
		Circle c = new Circle();  // create object
		System.out.println("Area of Circle :");
		c.getArea(); // method call
		System.out.println("Area of Square :");
		Square s = new Square ();  // create object
		s.getArea();   // method call

	}

}

