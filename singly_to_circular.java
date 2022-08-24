package circular;
import java.util.*;
//To convert singly linked list to circular linked list
public class singly_to_circular {
	Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
		
	}
}


void insert(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	head=newnode;
}

void cir() {
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=head;
}

void printlist() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("NULL\n");
}

void printcir() {
	Node temp=head;
	do{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}while(temp!=head) ;
	System.out.print("NULL\n");
	System.out.print(temp.next.data);
}

public static void main(String args[]) {
	singly_to_circular s=new singly_to_circular();
	s.insert(0);
	s.insert(1);
	s.insert(2);
	s.insert(5);
	s.insert(4);
	s.insert(5);
	s.insert(4);
	s.insert(4);
	s.printlist();
	s.cir();
	s.printcir();
	
	
}
}
