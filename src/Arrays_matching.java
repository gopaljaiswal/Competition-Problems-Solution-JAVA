import java.util.Scanner;
public class Arrays_matching {
		public static void main(String[] args)throws Exception{
			Scanner in=new Scanner(System.in);
			String str=in.next();
			String str1=in.next();
			boolean flag=false;
			int j=str1.length();
			for(int i=0;i<str.length()-str1.length()+1;i++){
				if(str1.equals(str.substring(i,j))){
					System.out.println("yes");
				}
				j++;
			}
		}
}
