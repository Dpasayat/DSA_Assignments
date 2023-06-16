import java.util.*;
public class Q7 
{

	static int occur(int x[],int n)
	{
		int c=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==n)
				c++;
		}
		return c;
	}
	static int firstOccur(int x[],int n)
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==n)
				return (i+1);
		}
		return -1;
	}
	static int lastOccur(int x[],int n)
	{
		int pos=-1;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==n)
				pos=i;
		}
		return (pos+1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of the array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum element of the array is "+max+" and occurs "+occur(arr,max)+" times");
		System.out.println("Minimum element of the array is "+min+" and occurs "+occur(arr,min)+" times");
		System.out.println("First occurence of maximum element is at position "+firstOccur(arr,max));
		System.out.println("Last occurence of minimum element is at position "+lastOccur(arr,min));
		sc.close();

	}

}
