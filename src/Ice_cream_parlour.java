import java.util.Scanner;
public class Ice_cream_parlour {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int M=in.nextInt();
			int N=in.nextInt();
			int[] cost=new int[N];
			for(int j=0;j<N;j++){
				cost[j]=in.nextInt();
			}
			display(M,cost);
		}
	}
		public static void display(int M,int[] cost){
			for(int i=0;i<cost.length;i++){
				int t=cost[i];
				for(int k=i+1;k<cost.length;k++){
					if(t+cost[k]==M){
						System.out.println((i+1)+" "+(k+1));
					}
				}
			}
		}
}
