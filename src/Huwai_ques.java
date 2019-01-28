import java.util.Scanner;
public class Huwai_ques {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int sum=0;
		int j=N;
		while(j>9){
			sum+=j%10;
			j=j/10;
		}
		sum+=j;
		System.out.println(sum);
		System.out.println(get(sum));
		in.close();
	}
	
	public static int get(int sum){
		if(sum<10){
			return sum;
		}
			int p=0;
			int j=sum;
			while(j>9){
				p+=j%10;
				j=j/10;
			p+=j;
			}
			return get(p);
	}
}