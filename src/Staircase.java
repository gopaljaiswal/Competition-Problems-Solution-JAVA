import java.util.Scanner;
public class Staircase {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N-i;j++){
				System.out.print(" ");
			}
			for(int j=N-i+1;j<=N;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
