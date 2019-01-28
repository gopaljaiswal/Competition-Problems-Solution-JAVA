import java.util.Scanner;
import java.lang.String;
public class Quries_on_String{
	public static void main(String[] args){
		Scanner in=new  Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		String str=in.next();
		for(int i=0;i<M;i++){
			int p=in.nextInt();
			if(p==1){
			char C=in.next().charAt(0);
			char D=in.next().charAt(0);
			str=type_1(str,C,D);
			}else{
				int C=in.nextInt();
				int D=in.nextInt();
				type_2(str,C,D);
			}
			}
	}
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static String type_1(String str,char X,char Y){
	String p=str.replace(X,Y);
		return p;
	   }
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void type_2(String str,int C,int D){
		long p=0;
		for(int i=C-1;i<D;i++){
			for(int j=i+1;j<=D;j++){
					String a=str.substring(i,j);
					int M=Integer.parseInt(a);
					if(M%3==0){
						p++;
					}
					
				}
			}
		System.out.println(p);
	}
}
