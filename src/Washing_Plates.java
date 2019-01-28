import java.util.*;
public class Washing_Plates {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] P=new int[N];
		int[] D=new int[N];
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=P[i]=in.nextInt();
			D[i]=in.nextInt();
		}
		
		/*int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=P[i];
		}*/
		
		
		Arrays.sort(P);
		
		int pp[]=new int[K];
		
		for(int i=0;i<K;i++){
			pp[i]=P[N-i-1];
		}
		int[] s1=new int[K];
		int u=0;
		for(int i=0;i<K;i++){
			int s=pp[i];
			for(int j=0;j<N;j++){
				
				if(s!=A[j]){
					s1[u++]=A[j];
				}
				
			}
		}
		long sum=0;
		Arrays.sort(s1);
		for(int i=0;i<K;i++){
			sum+=(pp[i]-s1[i]);
		}
		
		
		System.out.println(sum);
		in.close();
	}

}
