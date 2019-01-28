import java.util.Arrays;


public class Swap_in_array {
	public static void main(String[] args){
		int[] A={1,4,2,3,5};
		int[] B=Arrays.copyOf(A,5);
		for(int i=0;i<5;i++){
			System.out.print(A[i]+" ");
		}
		Arrays.sort(B);
		for(int i=0;i<5;i++){
			System.out.print(A[i]+" ");
		}
	}
}
