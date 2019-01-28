public class factorial_no {
	public static void main(String[] args){ 
	int a=50;
		System.out.println(fact(a));
	}
	public static long fact(int a){
		long f=1L;
		if(a>1){
			f*=a*fact(a-1);
		}
		return f;	
	}
}
