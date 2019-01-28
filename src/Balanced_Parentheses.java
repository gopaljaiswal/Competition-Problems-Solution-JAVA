import java.util.Scanner;
public class Balanced_Parentheses {
	Node head;
	class Node{
		char data;
		Node next;
		Node(char ch){
			data=ch;
			next=null;
		}
	} 
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
public void push(char data){
	Node temp=new Node(data);
	temp.next=head;
	head=temp;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
public char pop(){
	char p=head.data;
	head=head.next;
	return p;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
public void display(){
	Node p=head;
	while(p!=null){
		System.out.print(p.data+" ");
		p=p.next;
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
public int isMatchingPair(char character1, char character2)
{
   if (character1 == '(' && character2 == ')')
     return 1;
   else if (character1 == '{' && character2 == '}')
     return 1;
   else if (character1 == '[' && character2 == ']')
     return 1;
   else
     return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args){		
		Balanced_Parentheses list=new Balanced_Parentheses(); 
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		for(int j=0;j<T;j++){
			
			boolean flag=true;			
			String str=in.next();			
			for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='('){
				list.push(str.charAt(i));
			}
			else if(str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')'){	
				if(list==null){
					flag=false;
				}
				else if(list.isMatchingPair(str.charAt(i),list.pop())==0){
					flag=false;
				}
			}}
			
			if(list!=null){
				flag=false;
			}else{
				flag=true;
			}
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}}
		in.close();
	}
}
