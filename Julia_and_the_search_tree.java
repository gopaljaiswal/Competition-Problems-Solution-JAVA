import  java.util.*;

class Julia_and_the_search_tree 
{
	Node root;
	class Node 
	{
		int data;
		Node left, right;

		Node(int item) 
		{
			data = item;
			left = right = null;
		}
	}
	
    static int count=0;
	public static void printKDistant(Node node, int k){
		if (node == null)
			return;
		if (k == 0) 
		{
		    count++;
			//System.out.print(node.data + " "+" "+count);
			return;
		} 
		else
		{
			printKDistant(node.left, k - 1);
			printKDistant(node.right, k - 1);
		}
	}
	
	public void Preorder(Node root1){
		if(root1==null){
			return;
		}
		System.out.print(root1.data+" ");
		Preorder(root1.left);
		Preorder(root1.right);
	}
	
	
	public Node insert(Node root1,int d){
		Node temp=new Node(d);
		if(root1==null){
			return temp;
		}
		if(d<root1.data){
			root1.left=insert(root1.left,d);
		}else if(d>root1.data){
			root1.right=insert(root1.right,d);
		}
		return root1;
	}
	
	public static int height(Node root){
		if(root==null){
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.left);
		int p=0;
		if(lh>=rh){
			p=(lh+1);
		}else if(lh<rh){
			p=(rh+1);
		}
		return p;
	}
	/* Driver program to test above functions */
	public static void main(String args[]) {
		Julia_and_the_search_tree tree = new Julia_and_the_search_tree();
		
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			tree.root=tree.insert(tree.root,in.nextInt());
		}
		int dist=tree.height(tree.root);
		//tree.Preorder(tree.root);
	//	System.out.println();
		int sum=0;
		for(int i=0;i<=dist;i++){
			//tree.printKDistant(tree.root, i);
			System.out.println(tree.levelCount(tree.root,i));
			//sum+=(i*tree.count);
			tree.count=0;
		}
		//System.out.println(sum);
	}
	
	public  int levelCount(Node root,int level){
		  if (level == 0) {return 1;}
		  else {
		    return levelCount(root.right,level-1) + levelCount(root.left,level-1);
		  } 
		}
}