import java.util.Scanner;
abstract class Shape
{
	double area;
	Shape(){}
	abstract void set_area();
	abstract double get_area();
	public void disp_area()
	{
		System.out.println("Area is: "+area);
	}
	
}
class Square extends Shape
{
	float side;
	Square(float s)
	{
		side=s;
	}
	void setSquare(float s)
	{
		side=s;
	}
	void set_area()
	{
		area= side*side;
	}
	double get_area()
	{
		return area;
	}
}
class Triangle extends Shape
{
	double base,height;
	Triangle(){}
	Triangle(double b,double h)
	{
		base=b;height=h;
	}
	void setTriangle(double b,double h)
	{
		base=b;height=h;
	}
	void set_area()
	{
		area=0.5*base*height ;
	}
	double get_area()
	{
		return area;
	}
}
class Circle extends Shape
{
	double radius;
	Circle(){}
	Circle(double r)
	{
		radius=r;
	}
	void setCircle(double r)
	{
		radius=r;
	}
	void set_area()
	{
		area= Math.PI*radius*radius;
	}
	double get_area()
	{
		return area;
	}
}
public class Q6 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 for Square, 2 for Triangle and 3 for Circle");
		int c=sc.nextInt();
		switch (c)
		{
		case 1:
			System.out.println("Enter the side: ");
			float s=sc.nextFloat();
			Square ob1=new Square(s);
			ob1.set_area();
			ob1.disp_area();
			break;
		case 2:
			System.out.println("Enter base and height: ");
			double b=sc.nextDouble();
			double h=sc.nextDouble();
			Triangle ob2=new Triangle(b,h);
			ob2.set_area();
			ob2.disp_area();
			break;
		case 3:
			System.out.println("Enter radius: ");
			double r=sc.nextDouble();
			Circle ob3 =new Circle(r);
			ob3.set_area();
			ob3.disp_area();
			break;
		default:
			System.out.println("Invalid input");
		}
		sc.close();
		

	}

}
