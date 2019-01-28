import java.util.Scanner;
public class Wobbly_No {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int K=in.nextInt();
			get_wobbly(N,K);
		}
	}
	public static void get_wobbly(int N,int K){
		int i=0;
		boolean flag=false;
		for(int j=1;j<=9;j++){
			for(int k=0;k<=9;k++){
				if(j!=k)
				i++;
				if(i==K){
					flag=true;
					for(int s=1;s<=N;s++){
						if(s%2!=0){
							System.out.print(j);
						}else{
							System.out.print(k);
						}
					}System.out.println();
					break;
				}
			}
		}
		if(flag==false){
			System.out.println("-1");
		}
	}
}