import java.util.*;
public class length_Without_BuildinFun {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int i=0;
		while(true){
			try{
			char p=str.charAt(i);
			}catch(Exception e){
				System.out.println(i);
				break;
			}
			i++;
		}
		//System.out.println(i);
	}
}
