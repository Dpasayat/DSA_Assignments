import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int s=0,p=1;
		for(int i= n;i!=0;i/=10)
		{
			int r=i%10;
			s+=r;
			p*=r;
		}
		if(s==p)
			System.out.println(n+" is a spy number ");
		else
			System.out.println(n+" is not a spy number");
		sc.close();

	}

}
