import java.util.*;
public class Sherlock_and_Numbers {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int K=in.nextInt();
			int P=in.nextInt();
			List<Integer> B=new ArrayList<Integer>();
			for(int j=0;j<K;j++){
				B.add(in.nextInt());
			}
			List<Integer> A=new ArrayList<Integer>();
			for(int k=1;k<=N;k++){
				A.add(k);
			}
			A.removeAll(B);
			Object[] C=A.toArray();
			
			if((P-1)<C.length){
				System.out.println(C[P-1]);
			}else{
				System.out.println("-1");
			}
		}
		in.close();
	}

}
