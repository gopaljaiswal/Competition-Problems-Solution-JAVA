import java.util.Scanner;
public class yo_yo {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long a=in.nextLong();
			check(a);
		}
	}
	static void check(long a){
		int count=0;
		a=a-1;
		for(long i=1;i<=a;i++){
			if(a%i==0){
				count+=1;
			}
		}
		if(a%2==0){
		System.out.println(count);}
		else{System.out.println(count+1);}
	} 

}
