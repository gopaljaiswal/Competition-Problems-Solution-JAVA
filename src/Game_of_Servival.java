import java.util.*;
public class Game_of_Servival {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] A=new int[N];
			int[] B=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			for(int j=0;j<N;j++){
				B[j]=in.nextInt();
			}
			get_result(A,B);
		}
	} 
	public static void get_result(int[] A,int[] B){
		Arrays.sort(A);
		Arrays.sort(B);
		boolean flag=true;
		for(int i=0;i<A.length;i++){
			if(A[i]<B[i]){
				flag=false;
			}
		}
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
