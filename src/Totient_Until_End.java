import java.util.Scanner;
public class Totient_Until_End {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		int e=in.nextInt();
		int f=in.nextInt();
		int g=in.nextInt();
		int h=in.nextInt();
		get_divisors(a,b,c,d,e,f,g,h);
		}
	}

	public static void get_divisors(int a,int b,int c,int d,int e,int f,int g,int h){
		int sum=0;
		sum+=b*get_no(a);
		sum+=d*get_no(c);
		sum+=f*get_no(e);
		sum+=h*get_no(g);
		System.out.println(sum);
	}
	public static int get_no(int n){
		int sum=0;
    while (n%2 == 0)
    {
        sum++;
    	n = n/2;
    }
    for (int i = 3; i <=(int)Math.sqrt(n); i = i+2)
    {
        while (n%i == 0)
        {
        	sum++;
            n = n/i;
        }
    }
    if (n > 2)
    	sum++;
	return sum;
	}
}
