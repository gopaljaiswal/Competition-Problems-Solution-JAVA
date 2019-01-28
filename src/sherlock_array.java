import java.util.Scanner;
public class sherlock_array {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] a=new int[N];
			for(int j=0;j<N;j++){
			a[j]=in.nextInt();}
			find_element(a);
		}
	}
	public static void find_element(int[] a){
		boolean flag=false;
		int i=1;
		while(i<a.length-1){
		long sum=0,sum1=0;
		for(int j=0;j<i;j++){
			sum+=a[j];
		}
		for(int k=i+1;k<a.length;k++){
			sum1+=a[k];
		}
		if(sum==sum1){
			flag=true;
			break;
		}
		//System.out.println(sum+" "+sum1);
		i++;}
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		}
}
