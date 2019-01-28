import java.util.Scanner;
public class Prime
{
	public static void main(String[] arg)
	{
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int u=in.nextInt();
		for(int n=u;n>=l;n--)
			{
				boolean flag=true;
				for(int i=2;i<=(int)n/2;i++)
					{
						if(n%i==0)
							{
								flag=false;
								break;
							}
					}
				if(flag==true)
					System.out.print("\t" +n);
			}
	}
}