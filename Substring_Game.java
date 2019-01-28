import java.util.*;
public class Substring_Game {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int Q=in.nextInt();
		int W=in.nextInt();
		for(int i=0;i<Q;i++){
			int j=in.nextInt();
			String str1=str.substring(j-1,j+W-1);
			System.out.println(get_len(str1).size());
		}
		in.close();
	}
	
	public static Set<String> get_len(String str) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < str.length(); i++) {
    			for (int j = 0; j <= i; j++) {
    					set.add(str.substring(j, i + 1));
    			}
    		}
        return set;
    }
}