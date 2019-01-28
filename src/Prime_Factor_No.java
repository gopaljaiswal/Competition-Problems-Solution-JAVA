import java.util.Scanner;
public class Prime_Factor_No {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		get_no(N);
	}
	public static void get_no(int n){
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
	System.out.println(sum);
	}
}
