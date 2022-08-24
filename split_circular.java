package circular;
import java.util.*;
//To split a circular linked list
public class split_circular {
Node last;
Node l1;
Node l2;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

void lasti(int data) {
	Node newnode=new Node(data);
	if(last==null) {
		last=newnode;
		newnode.next=last;
	}
	newnode.next=last.next;
	last.next=newnode;
	last=newnode;
}

int cnt()
{
	Node temp=last.next;
	int c=0;
	 do{
		c++;
		temp=temp.next;
	}while(temp!=last.next);
	return c;
}

void split() {
	int c=cnt();
	int mid=(c%2==0)?(c/2+1):(c/2);
	Node temp=last.next;
	for(int i=0;i<mid;i++) {
		temp=temp.next;
	}
	Node f=last.next;
	Node l=temp.next;
	
	temp.next=f;
	temp.next=l1;
	
	
	last.next=l;
	l2=last;
	
	
	
}
void printlist(Node last) {
	Node temp=last.next;
	 do{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}while(temp!=last.next);
	System.out.print("NULL\n");
}

public static void main(String args[]) {
	split_circular i=new split_circular();
	
	i.lasti(1);
	i.lasti(2);
	i.lasti(3);
	i.lasti(4);
	i.lasti(5);
	i.lasti(6);
	
	i.printlist(i.last);
	i.split();
	i.printlist(i.l2);
	i.printlist(i.l1);
	
}
}
