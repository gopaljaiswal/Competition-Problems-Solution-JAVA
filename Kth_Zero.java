import java.util.*;
public class Kth_Zero {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int T=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<T;i++){
			int p1=in.nextInt();
			boolean flag=false;
			if(p1==1){
				int k=in.nextInt();
				int count=0;
				for(int s=0;s<N;s++){
					if(A[s]==0){
						count++;
					}
					if(count==k){
						flag=true;
						System.out.println(s);
						break;
					}
				}
				if(flag==false){
				System.out.println("NO");
				}
			}else if(p1==2){
				int p=in.nextInt();
				int x=in.nextInt();
				A[p]=x;
			}
		}
		in.close();
	}
}