import java.util.Scanner;
public class Game_of_string {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		findLongest(str1,str2);
		//System.out.println(str);
	}
	
	public static void findLongest(String s1, String s2) {
		   if (s1.equals(s2)) { // this part is optional and will 
		      System.out.println(s1);        // speed things up if s1 is equal to s2
		   }                    //
		   int max = 0;
		   for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
		      if (s2.endsWith(s1.substring(0, i))) {
		         max = i;
		      }
		   }
		   System.out.println(s1.substring(0, max));
		}

}
