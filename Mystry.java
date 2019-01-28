import java.util.Scanner;
public class Mystry {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
			}
			int gcd = A[0];
			for(int s = 1; s < N; s++){ 
				gcd = gcd1(gcd, A[s]);
			}
			System.out.println(gcd);
		}
	}
	
	
	
	
	public static int gcd1(int a, int b) {
        if (b == 0){
            return a;
        } 
        return gcd1(b, a % b); 
    }
}
