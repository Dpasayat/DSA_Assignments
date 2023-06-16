import java.util.*; 
class product
 {
	 int pid;
	 float price;
	 static float tot_price=0;
	 product(int id,float pr)
	 {
		 pid=id;
		 price=pr;
	 }
	 void display()
	 {
		 System.out.println(pid+"\t\t"+price);
	 }
 }
public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		product bill[]=new product[5];
		System.out.println("Enter the product id and then its price: ");
		for(int i=0;i<5;i++)
		{
			int x= sc.nextInt();
			float y=sc.nextFloat();
			bill[i]=new product(x,y);
		}
		System.out.println("product id\tprice");
		for(int i=0;i<5;i++)
		{
			bill[i].display();
			product.tot_price+=bill[i].price;
		}
		System.out.println("Total plice: "+product.tot_price);
		sc.close();

	}

}
