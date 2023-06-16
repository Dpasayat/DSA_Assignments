//import java.util.Scanner;
class Person
{
	String name;int age;
	Person()
	{
		
	}
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
}
class Employee extends Person
{
	int Eid;int salary;
	Employee()
	{
		
	}
	Employee(String n,int a,int id,int s)
	{
		name=n;
		age=a;
		Eid=id;
		salary=s;
	}
	void empDisplay()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nEmployee ID: "+Eid+"\nSalary: "+salary);
	}
}
public class Q7 
{

	public static void main(String[] args) 
	{
		//Scanner sc= new Scanner(System.in);
		Employee ob=new Employee("Dhiraj",21,224101,50000);
		ob.empDisplay();

	}

}
