import java.util.Scanner;
public class Q10 
{

	public static double sumColumn(double[][] m, int columnIndex)
	{
		double s=0;
		for(int i=0;i<3;i++)
		{
			s+=m[i][columnIndex];
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a[][]=new double[4][4];
		System.out.println("Enter a 3-by-4 matrix row by row");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			System.out.println("Sum of the elements at coulmn "+i+" is "+sumColumn(a,i));

		}
		sc.close();

	}

}
