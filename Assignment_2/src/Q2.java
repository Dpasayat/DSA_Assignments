import java.util.Scanner;
class Comp
{
	double real,img;
	void setData(double r,double i)
	{
		real=r;img=i;
	}
	void display()
	{
		System.out.println(real+" +i"+img);
	}
	public Comp add(Comp c2)
	{
		Comp sum=new Comp();
		sum.real=real+c2.real;
		sum.img=img+c2.img;
		return sum;
	}
}//end of complex class
public class Q2
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Comp c1=new Comp();
		Comp c2=new Comp();
		Comp res=new Comp();
		double r,i;
		System.out.println("Enter real and complex part for c1: ");
		r=sc.nextDouble();
		i=sc.nextDouble();
		c1.setData(r, i);
		System.out.println("Enter real and complex part for c2: ");
		r=sc.nextDouble();
		i=sc.nextDouble();
		c2.setData(r, i);
		System.out.println("C1 is :");
		c1.display();
		System.out.println("C2 is :");
		c2.display();
		System.out.println("Sum is :");
		res=c1.add(c2);
		res.display();
		sc.close();
		
	}
	
	
}
