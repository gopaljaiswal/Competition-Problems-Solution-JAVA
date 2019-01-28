//HackerEarth Even_Odd(correct)
import java.util.Scanner;
public class Matrix_Even_Odd{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int R=in.nextInt();
			int C=in.nextInt();
			check(R,C);
			//System.out.println(ckeck(R,C));
		}
	}
	static  void check(int R,int C){
		int[][] matrix=new int[R+1][C+1];
		int sum_e=0;
		int sum_o=0;
		for(int i=1;i<=R;i++){
			for(int j=1;j<=i && j<=C;j++){
				matrix[i][j]=i;
				if(i%2==0){
					sum_e+=1;
				}sum_o+=1;
			}
		}System.out.println(sum_e+" "+(sum_o-sum_e));
		/*else{
			for(int i=1;i<=R;i++){
				for(int j=1;j<=i && j<=C;j++){
					matrix[i][j]=i;
					if(i%2==0){
						sum_e+=1;
					}sum_o+=1;
				}
		}
	System.out.println(sum_e+" "+(sum_o-sum_e));}*/
	}
}
