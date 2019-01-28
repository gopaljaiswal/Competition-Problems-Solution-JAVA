import java.util.Scanner;
public class Twisty_Tuples {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<N-2;i++){
			int p=A[i];
			for(int j=i+1;j<N-1;j++){
				if(A[j]>p){
					int k=j+1;
					if(A[k]<p){
						count++;
						//System.out.println(A[i]+" "+A[j]+" "+A[k]);
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}
