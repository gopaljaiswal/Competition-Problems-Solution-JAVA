import java.util.Scanner;
public class play_with_rank_list{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			long S=in.nextLong();
			get_rank_list(N,S);
		}
	} 

	public static void get_rank_list(int N,long S){
		int p=0;
		int[] A=new int[N];
		int i=0;
		while(i<N){
			if(p<S){
				p++;
				A[i]=p;
				S=S-p;
			}else if(p>S){
				A[i]=(int)S;
			}else{
				A[i]=p;
				p--;S--;
			}
			i++;
		}
		for(int j=0;j<N;j++){
			System.out.println(A[j]);
		}
	}

}
