import java.util.*;
public class Quilifier{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			check(str);
		}
		in.close();
	}
	
	public static void check(String str){
		boolean flag=true;
		for(int i=1;i<str.length();i++){
			int p=(int)str.charAt(i);
			int q=(int)str.charAt(i-1);
			int r=Math.abs(p-q);
			if(p==(int)'z' && q==(int)'a'){
				flag=true;
			}else if(q==(int)'z' && p==(int)'a'){
				flag=true;
			}
			else if(r>1){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}