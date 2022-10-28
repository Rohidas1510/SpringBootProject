package rohidas1;
import java.util.*;
		 class Shape
		 {
		 	void Display() 
		 	{
		 		System.out.println("Shape...");
		 	} 	
		 }
		 class Circle extends Shape
		 {
		 	void area( )
		 		{
		 		double p = 3.14;
		 		int r = 4;
		 		double a = p*r*r;
		 		System.out.println("Area of Circle= "+a+" sq.m");
		 		}
		 	
		 }
		 class Triangle extends Circle
		 {
		 	void area1( )
		 	{
		 		int h = 4;
		 		int b = 6;
		 		double a = h*b/2;
		 		System.out.println("Area of Triangle= " +a +"sq.m");
		 	
		 	}
		 	public static void main(String[] args) 
		 	{
		 		Triangle t = new Triangle();
		 		t.area();
		 		t.area1();
		 	}
		 }
		 



