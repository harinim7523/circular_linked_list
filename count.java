package circular;
import java.util.*;
//To count number of nodes in the list
public class count {
Node last;
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

void cnt()
{
	Node temp=last.next;
	int c=0;
	 do{
		c++;
		temp=temp.next;
	}while(temp!=last.next);
	System.out.print("The count is : "+c);
}

void printlist() {
	Node temp=last.next;
	 do{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}while(temp!=last.next);
	System.out.print("NULL\n");
}

public static void main(String args[]) {
	count i=new count();
	
	i.lasti(1);
	i.lasti(2);
	i.lasti(3);
	i.lasti(4);
	i.lasti(5);
	i.lasti(6);
	
	i.printlist();
	i.cnt();
}
}
