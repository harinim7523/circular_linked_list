package circular;
import java.util.*;
public class insert {
Node last;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

void addEmpty(int data) {
	Node newnode=new Node(data);
	last=newnode;
	newnode.next=last;
}

void begin(int data) {
	Node newnode=new Node(data);
	newnode.next=last.next;
	last.next=newnode;
	
}

void lasti(int data) {
	Node newnode=new Node(data);
	newnode.next=last.next;
	last.next=newnode;
	last=newnode;
}

void after(int ele,int data) {
	Node newnode=new Node(data);
	Node temp=last.next;
	if(temp.data==ele) {
		begin(data);
		return;
	}
	if(last.data==ele) {
		lasti(data);
		return;
	}
	while(temp.data!=ele) {
		temp=temp.next;
	}
	newnode.next=temp.next;
	temp.next=newnode;
	
	
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
	insert i=new insert();
	i.addEmpty(1);
	i.printlist();
	i.begin(3);
	i.begin(4);
	i.printlist();
	i.after(3, 5);
	i.printlist();
	i.lasti(6);
	i.printlist();
}
}
