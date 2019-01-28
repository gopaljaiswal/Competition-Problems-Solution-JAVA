import java.math.BigInteger;
import java.util.Scanner;
public class Cube_Change {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			BigInteger N=in.nextBigInteger();
			BigInteger res=new BigInteger("0");
			if(N.equals(new BigInteger("1"))==true){
				System.out.println("1");
			}else{
				//res=N*N*N-(N-2)*(N-2)*(N-2);
				//res=8+12*(N-2)+6*(N-2)*(N-2);
				BigInteger mul=N.pow(3);
				BigInteger mul1=N.subtract(new BigInteger("2")).pow(3);
				res=mul.subtract(mul1);
				System.out.println(res);
			}
		}
		in.close();
	} 
}
