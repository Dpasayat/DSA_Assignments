import java.util.*;
public class Q6 
{
	boolean odd(int i)
	{
		int flag=i&1;
		if(flag==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Q6 obj=new Q6();
		System.out.println(n+" is odd: "+obj.odd(n));
		sc.close();

	}

}
