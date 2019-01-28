import java.util.Scanner;
public class make_pallindrom {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				String str=in.next();
				check(str);
			}
		}
		static void check(String str){
			boolean flag=false;
			int l=str.length()/2;
			for(int i=0,j=str.length()-1;j>=l && i<l;j--,i++){
				if(str.charAt(i)==str.charAt(j)){
					flag=true;
				}
				else{
				if(str.charAt(i)==str.charAt(j-1)){
						flag=true;
				}
				else if(str.charAt(i+1)==str.charAt(j)){
					flag=true;
				}
			}}
			if(flag==true){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");}
		}
}
