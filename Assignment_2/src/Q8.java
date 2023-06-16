import java.util.Scanner;
interface DetailInfo 
{
	void display();
	void count();

}
class student implements DetailInfo 
{
	static int maxcount;
	String name;
	student(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("No. of characters in the namne is: "+maxcount );
	}
	public void count()
	{
		for(int i=0;i<name.length();i++)
			maxcount++;
	}
}

public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String s=sc.nextLine();
		student ob=new student(s);
		ob.count();
		ob.display();
		

	}

}
