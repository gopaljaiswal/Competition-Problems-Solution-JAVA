import java.util.Scanner;
public class Angry_professor {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int K=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			canceal_calss(A,K);
		}
	}
	public static void canceal_calss(int[] A,int K){
		int  p=0;
		for(int i=0;i<A.length;i++){
				if(A[i]<=0){
					p++;
				}
			}
		if(p<K){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
