
public class LCM_Two_No {
	public static void main(String[] args){
		int a=8;
		int b=5;
		System.out.println(LCM(a,b));
	}
	
	public static int LCM(int a,int b){
		int x=(a>b)?a:b;
		while(true){
			if((x%a==0) && (x%b==0)){
				//System.out.println(x);
				//break;
				return x;
			}
			x++;
		}
	}
}
