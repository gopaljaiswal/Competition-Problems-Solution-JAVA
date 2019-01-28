import java.util.Arrays;
import java.util.Scanner;
public class Rat_Race {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] S=new int[N];
		int[] D=new int[N];
		for(int i=0;i<N;i++){
			S[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			D[i]=in.nextInt();
		}
		float[] T=new float[N];
		for(int i=0;i<N;i++){
			T[i]=(float)D[i]/S[i];
			System.out.println(T[i]);
		}
		float[] t=Arrays.copyOf(T,T.length);
		Arrays.sort(t);
		float q = t[0];
		for(int i=0;i<N;i++){
			if(q==T[i]){
				System.out.println(i+1);
			}
		}
	}

}
