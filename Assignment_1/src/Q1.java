import java.util.Scanner;


public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number greater than 2 : ");
		int n= sc.nextInt();
		int c=0;
		if(n>2)
		{
			for(int i=n;i>2;i/=2)
			{
				c++;
			}
			System.out.println("The number of times one must repetedly divide this number by 2 before grtting a value less that 2 is "+c);
		}
		else
			System.out.println("Please enter a number greater than 2");
		sc.close();

	}

}
