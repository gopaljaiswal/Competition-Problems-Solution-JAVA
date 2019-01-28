import java.util.Scanner;
public class pallidrom_string {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			System.out.println("enter string");
			String str=in.next();
			boolean flag=false;
			int l=(int)str.length()/2;
			for(int i=0,j=str.length()-1;j>i;i++,j--){
				if(str.charAt(i)==str.charAt(j)){
					flag=true;
				}
			}
			if(flag==true)
				{System.out.println("yes");}
			else{
			System.out.println("No");}
		}
}
