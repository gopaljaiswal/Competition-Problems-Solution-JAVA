import java.util.Scanner;
public class Confused_Gorila {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			get_vertex(N);
		}
	}
	public static void get_vertex(int N){
		for(int i=0;i<N;i++){
			for(int j=N;j>=i;j--){
				if(i+j==N && i==j){
					System.out.println(i+" "+j);
					break;
				}else if(i+j==N){
					System.out.println(i+" "+j);
					System.out.println(j+" "+i);
				}
			}
		}
	}
}
