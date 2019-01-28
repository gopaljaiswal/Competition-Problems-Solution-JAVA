import java.util.Scanner;
public class prime_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}}
			if(isPrime)
			System.out.println(i);
		}
	}

}
