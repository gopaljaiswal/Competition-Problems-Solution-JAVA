import java.util.Scanner;
public class Posible_path {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long a=in.nextLong();
			long b=in.nextLong();
			long x=in.nextLong();
			long y=in.nextLong();
			get_out(a,b,x,y);
		}
	}
	public static void get_out(long a,long b,long x,long y){
		boolean flag=false;
		if(a<x){
			long p=a;
			while(p<=x+1){
				if(p==x){
					if(b<y){
					long q=b;
					while(q<=y+1){
						if(q==y){
							flag=true;
						}
						q+=p;
					}
				}else{
					long q=b;
					while(q>=y-1){
						if(q==y){
							flag=true;
						}
						q=p-q;
					}
				}
			}
				p=p+b;
			}
		}
		if(flag==true){
			System.out.println("YES");
		}
	}
}
