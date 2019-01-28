import java.util.Scanner;
public class Library_Fine {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int rd=in.nextInt();
		int rm=in.nextInt();
		int ry=in.nextInt();
		
		int ed=in.nextInt();
		int em=in.nextInt();
		int ey=in.nextInt();
		long fine=0L;
		int d=rd-ed;
		int m=em-rm;
		int y=ey-ry;
		
		if(m==0 && y==0){
			if(d>0){
				fine+=(d*15);
			}else{
				fine=0;
			}
		}else if(m>0 && y==0){
			fine+=(m*500);
		}
		else if(m<0 && y==0){
			fine=0;
		}else if(y>0){
			fine=0;
		}else if(y<0){
			fine=10000;
		}
		System.out.println(fine);
		in.close();
	}
}
