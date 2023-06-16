
public class Q4v2 
{

	public static void main(String[] args) 
	{
		String s[]= {"C","A","R","B","O","N"};
		for(int i=0;i<s.length;i++)
			for(int j=0;j<s.length;j++)
				for(int k=0;k<s.length;k++)
					for(int l=0;l<s.length;l++)
						for(int m=0;m<s.length;m++)
							for(int n=0;n<s.length;n++)
								if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n && l!=m && l!=n && m!=n  )
									System.out.println(s[i]+s[j]+s[k]+s[l]+s[m]+s[n]);

	}

}
