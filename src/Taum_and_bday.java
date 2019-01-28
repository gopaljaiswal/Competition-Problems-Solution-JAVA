import java.math.BigInteger;
import java.util.Scanner;
public class Taum_and_bday {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			for(int i=0;i<T;i++){
				    long b = in.nextLong();
		            long w = in.nextLong();
		            long x = in.nextLong();
		            long y = in.nextLong();
		            long z = in.nextLong();
		            min_cost(b,w,x,y,z);
			}
			in.close();
		}
		
		public static void min_cost(long B1,long W1,long X1,long Y1,long Z1){
	
			BigInteger B = BigInteger.valueOf(B1);
			BigInteger W = BigInteger.valueOf(W1);
			BigInteger X = BigInteger.valueOf(X1);
			BigInteger Y = BigInteger.valueOf(Y1);
			BigInteger Z = BigInteger.valueOf(Z1);
			BigInteger sum=BigInteger.valueOf(0);
			boolean d=Y.compareTo(X)==1;
			
			//System.out.print(d);
			
			
			//System.out.println(bi);
			int M=1000000000;
			if((X==Y) && (Y==Z)){
				sum=sum.add((B.multiply(X)).add(W.multiply(Y)));
				
			}else if((Z.compareTo(X))==1 & Z.compareTo(Y)==1){
				sum=sum.add((B.multiply(X)).add(W.multiply(Y)));
				
			}else if((X.compareTo(Y)==-1 && (X.add(Z)).compareTo(Y)==-1)){
				//sum=sum+((B*X)+(W*(X+Z)))%M;
				sum=sum.add((B.multiply(X)).add(W.multiply(X.add(Z))));
				
			}else if((Y.compareTo(X)==-1 && (Y.add(Z)).compareTo(X)==-1)){
				//sum=sum+((W*Y)+(B*(Y+Z)))%M;
				sum=sum.add((W.multiply(Y)).add(B.multiply(Y.add(Z))));
			}else{
				sum=sum.add((B.multiply(X)).add(W.multiply(Y)));
			}
			System.out.println(sum);
		}
}