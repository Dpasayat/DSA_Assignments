import java.util.Scanner;
public class Stud
{
	int Roll,DSA_Mark;
	String Name;
	void getdata(int r,String n, int m)
	{
		Roll=r;
		Name=n;
		DSA_Mark=m;
	}
	void showData()
	{
		System.out.println("Roll no: "+Roll+"\tName: "+Name+"\tDSA Marks: "+DSA_Mark);
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Stud s[]=new Stud[5];
		System.out.println("Enter roll number name and marks of the student");
		for(int i=0;i<5;i++)
		{
			int x=sc.nextInt();
			String y=sc.next();
			int z= sc.nextInt();
			s[i]=new Stud();
			s[i].getdata(x, y, z);
		}
		System.out.println("Roll number \t Name \t DSA marks");
		Stud max=new Stud();
		max=s[0];
		for(int i=0;i<5;i++)
		{
			s[i].showData();
			if(s[i].DSA_Mark>max.DSA_Mark)
				max=s[i];
		}
		System.out.println("Student with max marks:");
		System.out.println(max.Name+" Roll no: "+max.Roll+" marks: "+max.DSA_Mark);
		sc.close();
	}
}

