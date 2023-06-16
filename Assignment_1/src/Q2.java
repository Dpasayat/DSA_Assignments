import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight in kg and height in meters");
		float wt=sc.nextFloat();
		float ht=sc.nextFloat();
		float BMI=wt/(ht*ht);
		if(BMI<18.5)
			System.out.println("UnderWeight");
		else if(BMI>=18.5 && BMI<=24.9)
			System.out.println("Normal Weight");
		else if(BMI>24.9 && BMI<=29.9)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		sc.close();

	}

}
