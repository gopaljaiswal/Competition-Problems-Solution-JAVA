import java.util.*;

public class Gravity_Tree {
	Node root;
	class Node{
		int key;
		Node left,right;
		Node(int d){
			key=d;
			right=left=null;
		}
	}
    
	/////////////////////////////////////////////////////////////////////////////////////

	public void Preorder(Node root1){
		if(root1==null){
			return;
		}
		System.out.print(root1.key+" ");
		Preorder(root1.left);
		Preorder(root1.right);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args){
		Gravity_Tree tree=new Gravity_Tree();
		Node root=tree.new Node(1);
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] K=new int[N-1];
		for(int i=0;i<N-1;i++){
			K[i]=in.nextInt();
		}
		int i=0;
		while(i<N-1){
			System.out.println(K[i]+"  "+(i+2));
			i++;
		}
		in.close();
		
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////