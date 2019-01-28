import java.util.*;
public class Leibniz{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			double s=0;
			for(int j=0;j<N;j++){
				s+=Math.pow(-1,j)/(2*j+1);
			}
			System.out.printf("%.15f",s);
		}
	}
}