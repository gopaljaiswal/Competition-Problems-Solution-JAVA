import java.util.Scanner;
public class Little_Ashish_Huge_Problem {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long a=in.nextLong();
			get_no_of_child(a);
		}
	}
	public static void get_no_of_child(long a){
		long s=a;
		int p=0;
		int i=1;
		while(true){
			if(i*i>s){
				break;
			}
			s-=i*i;
			p++;
			i++;
		}
		System.out.println(p);
	}
}
