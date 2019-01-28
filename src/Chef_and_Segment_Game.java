import java.util.Scanner;
public class Chef_and_Segment_Game {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				int m=0;
				double q;
				long a=in.nextLong();
				int b=in.nextInt();
				double[] p=new double[(int)b]; 
				q=segment(a,b);
				p[m]=q;
				for(long j=1;j<=Math.pow(2,b-1);j++){
					p[(int)j]+=2*p[0];
				}
				System.out.println(p[b-1]);
			}
			
		}
		static double segment(long a,int b){
			double a1=a;
			for(int i=0;i<b;i++){
			a1=(double)a1/2;}
			return a1;
		} 
}
