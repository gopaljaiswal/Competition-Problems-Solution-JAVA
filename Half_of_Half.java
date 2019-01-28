import java.util.Scanner;
public class Half_of_Half {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			String str=in.next();
			int p=str.length();
			if(p%2==0){
				for(int j=0;j<(int)p/2;j+=2){
					System.out.print(str.charAt(j));
				}
			}else{
				for(int j=0;j<=(int)p/2;j+=2){
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
