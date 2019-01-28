import java.util.Scanner;
public class The_Grid_Search {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){ 
			int R=in.nextInt();
			int C=in.nextInt();
			String[] G=new String[R];
			for(int j=0;j<R;j++){
				G[j]=in.next();
			}
			int r=in.nextInt();
			int c=in.nextInt();
			String[] P=new String[r];
			for(int j=0;j<r;j++){
				P[j]=in.next();
			}
			if(contains(G,P,R,C,r,c)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		in.close();
	}
	
	public static boolean contains(String[] G, String[] P, int R, int C, int r, int c) {
	    boolean flag;
	    for(int i=0; i <= R-r; i++) {
	        for(int j=0; j <= C-c; j++) {
	            flag = false;
	            for(int k=0; k < r; k++) {
	                for(int l=0; l < c; l++) {
	                    if(G[i+k].charAt(j+l) != P[k].charAt(l)) {
	                        flag = true;
	                        break;
	                    	}
	                }
	                if(flag) 
	                	break;
	            }
	            if(!flag) 
	            	return true;
	        }       
	    }
	    return false;
	}
}