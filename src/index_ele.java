import java.util.Scanner;
public class index_ele{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int ele=in.nextInt();
		int size=in.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
			if(ele==a[i]){
				System.out.println(i);
			}
		}
	}
}
