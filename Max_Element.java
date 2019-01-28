import java.util.Scanner;
public class Max_Element {
	Node head;
	Node maxhead;
	class Node{
		int data;
		Node next;
		Node maxnext;
		Node maxpre; 
		Node(int d){
			data=d;
			next=null;
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void push(int data){
		Node temp=new Node(data);
		
		if(head==null){
			head=temp;
			//head=head.next;
			maxhead=temp;
		}else{
			temp.next=head;
			head=temp;
		/*Node p=head;
		while(p.next!=null){
			p=p.next;
		}
		p.next=temp;*/
			if(maxhead.data<data)
			{	temp.maxnext=maxhead;
				maxhead=temp;
			}else{
			Node x=maxhead;
			while(x.maxnext!=null && x.maxnext.data>data)
			{
				x=x.maxnext;
			}
			if(x.maxnext==null)
			{
				x.maxnext=temp;
				temp.maxpre=x.maxnext;
				temp.maxnext=null;
			}else
			{
				temp.maxnext=x.maxnext;
				x.maxnext.maxpre=temp;
				x.maxnext=temp;
				temp.maxpre=x;
			}
			}
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void pop(){
		/*if(head.next==null){
			head=head.next;
		}else{
		Node q=head,r =head;
		while(q.next!=null){
			r=q;
			q=q.next;
		}
		r.next=null;
		}*/
		Node temp=head;
		if(temp.maxnext!=null && temp.maxpre!=null)
		{
			temp.maxpre.maxnext=temp.maxnext;
			temp.maxnext.maxpre=temp.maxpre;
			temp=null;
		}
		temp=null;
		head=head.next;
		maxhead=maxhead.maxnext;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////

public void max(){
	Node p=head;
	int max=head.data;
	while(p!=null){
		if(p.data>max){
			max=p.data;
		}
		p=p.next;
	}
	System.out.println(max);
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
public void display(){
	Node p=head;
	while(p!=null){
		System.out.print(p.data+" ");
		p=p.next;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args){
		Max_Element list=new Max_Element();
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			
			int K=in.nextInt();
			if(K==1){
				int d=in.nextInt();
				list.push(d);
			//list.display();
				//System.out.println();
				//System.out.println();
			}else if(K==2){
				list.pop();
				//list.display();
				//System.out.println();
				//System.out.println();
			}else if(K==3){
				//list.max();
				System.out.println(list.maxhead.data);
				//list.display();
			}
			//System.out.println(K);
		}
		in.close();
		
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////