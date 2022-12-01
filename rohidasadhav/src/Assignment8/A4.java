package Assignment8;
class Circle // class
{
	private double pi;
	private int r;
	
	 public int getR() // getter method
	 {
		return r;
	}

	public void setR(int r) // setter method
	{
		this.r = r;
	}

	public Circle(int r) // parameterized constructor
	{
		super();
		this.r = r;
	}

	public void Area() // method
	{	
		 double pi=3.14;
		 double area=pi*r*r;  //calculate area of circle
		 System.out.println("Area of circle is :"+area);
		 
	}
}

public class A4 
{

	public static void main(String[] args) 
	{
		// constructor overloading
		Circle c = new Circle(4);  // parameter pass
		c.Area();
		Circle c1=new Circle(20);  // parameter pass
		c1.Area();
	}

}
