import java.util.LinkedList;
import java.util.Scanner;
public class Find_Student {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<N;i++){
			ll.add(in.nextInt());
		}
		Object[] mm=ll.toArray();
		System.out.println(mm);
		in.close();
	}

}
