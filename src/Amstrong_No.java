//153====(1*1*1)+(5*5*5)+(3*3*3)
public class Amstrong_No {
	public static void main(String[] args){
		int n=372,a;
		int temp=n,c=0;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("Amstrong");
		else{
			System.out.println("Not Amstrong");
		}
	}
}