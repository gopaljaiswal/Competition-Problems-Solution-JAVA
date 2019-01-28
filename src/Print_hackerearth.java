import java.util.*;
public class Print_hackerearth {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String str=in.next();
		int h=0,a=0,c=0,k=0,e=0,r=0,t=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='h'){
				h++;
			}else if(str.charAt(i)=='a'){
				a++;
			}else if(str.charAt(i)=='c'){
				c++;
			}else if(str.charAt(i)=='k'){
				k++;
			}else if(str.charAt(i)=='e'){
				e++;
			}else if(str.charAt(i)=='r'){
				r++;
			}else if(str.charAt(i)=='t'){
				t++;
			}
		}
		h=h/2;
		a=a/2;
		e=e/2;
		r=r/2;
		int[] A={h,a,c,k,e,r,t};
		Arrays.sort(A);
		System.out.println(A[0]);
	}
}