import java.util.*;
public class Leonardo_Prime_Factors {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long N=in.nextLong();
			get_max(N);
		}
		in.close();
	}
	
	public static void get_max(long N){
		//int count=0;
		int max=Integer.MIN_VALUE;
		for(long i=1;i<=N;i++){
			Set<Long> s=Prime_Factor(i);
			int count=s.size();
			if(count>max){
				max=count;
			}
		}
		System.out.println(max);
		}
	
	
	public static Set<Long> Prime_Factor(long N){
		double p=N;
			Set<Long> s1=new HashSet<Long>();
			long i=N;
			long b=2;
			while(i%2==0){
				s1.add(b);
				i=i/2;
			}
			//System.out.println(s1);
			for(long j=3;j<=Math.sqrt(p);j+=2){
				while(i%j==0){
					s1.add(j);
					i=i/j;
				}
			}
			//System.out.println(s1);
			if(i>2){
				s1.add(i);
			}
			//s1.add(2);
			return s1;
		}
}