import java.util.*;
public class Q9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a[][]=new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		double sum=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"   ");
				if(i==j)
					sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of elements in major diagonal is "+sum);
		sc.close();

	}

}
