import java.util.*;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int i=n;
		while(i/10!=0)
		{
			int sum=0;
			for(int j=i;j!=0;j/=10)
			{
				sum+=(j%10);
			}
			i=sum;
			
		}
		System.out.println("Sum of digits of "+n+" until the numbe is a single digit is "+i);
		sc.close();
	}

}
