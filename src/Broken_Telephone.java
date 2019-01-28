import java.util.Scanner;
public class Broken_Telephone {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			if(A[i]%2==0){
				int j=i;
				while(A[j]%2<1 && j<A.length){
					System.out.print(A[j]+" ");
					j++;
				}System.out.println();
			}
		}
	}
}