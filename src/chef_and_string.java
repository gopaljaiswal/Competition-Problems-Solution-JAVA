import java.util.Scanner;
public class chef_and_string {
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int T=in.nextInt();
	for(int i=0;i<T;i++){
		char a=in.next().charAt(0);
		char b=in.next().charAt(0);
		int l=in.nextInt();
		int m=in.nextInt();
		display(str,a,b,l,m);
		}
	}
public static void display(String str,char a,char b,int l,int m){
	int v=0;
	for(int i=l-1;i<m;i++){
		if(str.charAt(i)==a){
			for(int j=i+1;j<m;j++){
				if(str.charAt(j)==b){
					v++;
				}
			}
		}
	}
	System.out.println(v);
}
}
