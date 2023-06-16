import java.util.*;
class Deposit
{
	long principal;int time;double rate;
	double tot_amt;
	Deposit()
	{
		principal=0l;
		time=0;
		rate=0.0d;
	}
	Deposit(long x,int y,double z)
	{
		principal=x;
		time=y;
		rate=z;
	}
	Deposit(long x,int y)
	{
		principal=x;
		time=y;
	}
	Deposit(long x, double y)
	{
		principal=x;
		rate=y;
	}
	void display()
	{
		System.out.println("Principal: "+principal+"\nTime: "+time+"\nrate: "+rate+"\nTotl Amount: "+tot_amt);
	}
	void calc_amt()
	{
		tot_amt=principal+((principal*rate*time)/100);
	}
	
}
public class Q5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal time and rate");
		long x=sc.nextLong();
		int y=sc.nextInt();
		double z= sc.nextDouble();
		Deposit ob=new Deposit(x,y,z);
		ob.calc_amt();
		ob.display();
		sc.close();
	}

}
