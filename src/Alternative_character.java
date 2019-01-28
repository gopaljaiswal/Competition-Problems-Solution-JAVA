import java.util.Scanner;
public class Alternative_character {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			for(int i=0;i<T;i++){
				String str=in.next();
				find_no_deletion(str);
			}
		}
		public static void find_no_deletion(String str){
			int no_del=0;
			for(int j=0;j<str.length()-1;j++){
				if(str.charAt(j)==str.charAt(j+1)){
					no_del++;
				}
			}
			System.out.println(no_del);
		}
}
