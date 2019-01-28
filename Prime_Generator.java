import java.util.Scanner;
public class Prime_Generator {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			for(int j=a;j<=b;j++){
				int M=(int)Math.sqrt(j);
				boolean flag=true;
				for(int k=2;k<=M;k++){
					if(j%k==0){
						flag=false;
					}
				}
				if(flag && j!=1){
					System.out.println(j);
				}
			}
		}
		in.close();
	}
}