import java.util.Scanner;
public class Utopian_tree {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
				display(N);
		}
	}
	public static void display(int N){
		long p=0;
		for(int i=0;i<=N;i++)
		{
			if(i%2==0){
				p+=1;
			}else{
				p*=2;
			}
		}
		System.out.println(p);
	}}
