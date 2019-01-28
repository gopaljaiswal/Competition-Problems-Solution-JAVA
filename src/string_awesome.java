import java.util.Scanner;
public class string_awesome {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			String str=in.next();
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				int L=in.nextInt();
				int R=in.nextInt();
				awesome_string(L,R,str);
			}
		}
		static void awesome_string(int L,int R,String str){
			String str1=" ";
			int count=0;
			int j;
			int i=L;
			for(j=L+9;j<R;j++){
				long sum=0;
				str1=str.substring(i-1,j+1);
				i++;
				str1=str1.toLowerCase();
				for(int k=0;k<str1.length();k++){
					sum+=str1.charAt(k);
				}
				if(sum==1154)
					count++;
			}System.out.println(count);
		}
}
