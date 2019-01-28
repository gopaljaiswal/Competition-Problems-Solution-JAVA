import java.util.Scanner;
public class Test_Power_large {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int k=0;k<T;k++){
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			int d=in.nextInt();
			long A=get(a,b,1000000007);
			long B=get(c,d,1000000007);
			System.out.println(get(A,B,1000000007));
		}
		in.close();
	}	
	
	public static long get(long a,long b,int c){
			String e=Integer.toBinaryString((int) b);
			long sum=1L;
			int i=0;
			for(int j=e.length()-1;j>=0;j--){
			if(e.charAt(j)=='1'){
				i=e.length()-j-1;
				int q=(int) Math.pow(2,i);
				sum=(sum*powerit(a,q,c))%c;
				i++;
			}
		}
			return sum;	
	}
	
	
	public static long powerit(long a, int b, int c){
	    long x=1;
	    while(b!=0)
	    {
	        if((b&01)==1)
	        {
	            x*=a;
	            if(x>=c)
	                x%=c;
	        }
	        a=a*a;
	        if(a>=c)
	            a%=c;
	        b>>=1;
	    }
	    return x;
	}
}
