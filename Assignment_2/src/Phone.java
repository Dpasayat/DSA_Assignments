import java.util.*;
public class Phone 
{
	int area_code,exchange,number;
	void input(int x,int y,int z)
	{
		area_code=x;
		exchange=y;
		number=z;
	}
	void display()
	{
		System.out.println("("+area_code+") "+exchange+"-"+number);
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter area code then exchange and lastly the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Phone ob1=new Phone();
		Phone ob2=new Phone();
		ob1.input(212, 767, 8900);
		ob2.input(a, b, c);
		System.out.print("My number is ");ob1.display();
		System.out.print("Your number is ");ob2.display();
		sc.close();

	}

}
