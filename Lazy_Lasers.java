import java.util.Scanner;
public class Lazy_Lasers {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		int N=in.nextInt();
		int[] H=new int[N];
		for(int i=0;i<N;i++){
			H[i]=in.nextInt();
		}
		
		int n=in.nextInt();
		int[] tel=new int[n];
		for(int i=0;i<n;i++){
			tel[i]=in.nextInt();
		}
		
		long sum=0;
		
		int q=tel[0]-1;
		while(q>0){
			sum+=q;
			q--;
		}
		
		for(int i=1;i<n;i++){
			int q1=tel[i]-tel[i-1];
			while(q1>0){
				sum+=q1;
				q1--;
			}
		}
		//System.out.println(sum);
		
		int s=tel[n-1]-1;
		
		//System.out.println(s);
		
		if(s<N){
			for(int j=s;j<N;j++){
				sum+=H[j];
			}
		}
		
		System.out.println(sum);

		
			in.close();
	}
}



/*
5
3 1 4 5 1
2
3 5
*/