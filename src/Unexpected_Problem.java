import java.util.*;
public class Unexpected_Problem {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int N=in.nextInt();	
		check(str,N);
		in.close();
	}
	////////////////////////////////////////////////////////////////////////////
	public static void check(String str,int N){
		int count1=0;
		int M=1000000007;
		for(int i=1;i<=str.length();i++){
			int count=0;
			String[] p=split(str,i);
				String s=p[0];
				for(int k=0;k<p.length;k++){
					if(s.equalsIgnoreCase(p[k])){
						count++;
					}
				}
			if(count==p.length){
				count1=(N/s.length())%M;
				System.out.println(count1);
				break;
			}
		}
}
	
	/////////////////////////////////////////////////////////////////////////////
	public static String[] split(String src, int len) {
	    String[] result = new String[(int)Math.ceil((double)src.length()/(double)len)];
	    for (int i=0; i<result.length; i++)	
	    	result[i]=src.substring(i*len, Math.min(src.length(), (i+1)*len));
	    return result;
	}
}

/*String s=null;
for(int j=1;j<p.length;j++){
System.out.print(p[j-1]+"  ");
if(p[j-1]!=p[j]){
	flag=false;
	continue;
}
s=p[j];
//System.out.println(s);
System.out.println();
}

if(flag){
int len=0;
int t=0;
while(t<N){
	count++;
	t+=len%1000000007;
	t=t%1000000007;
}
System.out.println(count);
break;
}
*/