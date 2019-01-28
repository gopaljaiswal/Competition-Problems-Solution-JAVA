//Both arrays are in sorted order
import java.util.Scanner;
public class Common_element_in_Array {
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int M=in.nextInt();
	int N=in.nextInt();
	int[] A=new int[M];
	int[] B=new int[N];
	for(int i=0;i<M;i++){
		A[i]=in.nextInt();
	}
	for(int j=0;j<N;j++){
		B[j]=in.nextInt();
	}
	int i=0,j=0;
	while(i<M && j<N){
		if(A[i]<B[j]){
			i++;
		}
		else if(A[i]>B[j]){
			j++;
		}else{
			System.out.println(A[i]);
			i++;
			j++;
		}
	}
}
}
