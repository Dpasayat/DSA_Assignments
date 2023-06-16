import java.util.Scanner;
class Students
{
	int roll_number;String name;String course;
	void input_Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name roll number and Course of the student: ");
		name=sc.nextLine();
		roll_number=sc.nextInt();
		course=sc.next();
	}
	void display_Student()
	{
		System.out.println("Name: "+name+"\nRoll no.: "+roll_number+"\nCourse: "+course);
	}
}
class Exam extends Students
{
	int mark1,mark2,mark3;
	void input_marks()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects: ");
		mark1=sc1.nextInt();
		mark2=sc1.nextInt();
		mark3=sc1.nextInt();
	}
	void display_Result()
	{
		display_Student();
		System.out.println("Marks oblained: "+mark1+" , "+mark2+" , "+mark3);
	}
}
public class Q9 
{

	public static void main(String[] args) 
	{
		Exam a[]=new Exam[5];
		System.out.println("Enter details of 5 students: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Exam();
			a[i].input_Student();
			a[i].input_marks();
		}
		System.out.println("inputed data: ");
		for(int i=0;i<a.length;i++)
		{
			a[i].display_Result();
			System.out.println("------------------------------");
		}
			

	}

}
