import java.util.Scanner;
public class String_grid {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		long R=in.nextInt();
		int C=in.nextInt();
		long sum=0,sum1=1;
		if(R%2==0){
			for(int i=1;i<(5*((int)R/2-1)+C);i++){
			sum1+=2;
			}
			System.out.println(sum1);
		}else if(R%2!=0){
			for(int i=1;i<(5*((int)R/2)+C);i++){
				sum+=2;
				}
			System.out.println(sum);
		}
		//System.out.println((int)1/2);
	}

}
