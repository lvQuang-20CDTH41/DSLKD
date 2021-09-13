package Bai01;

public class Node {
	Node next, prev;
	int data;
	Node(int data){
		this.data = data;
		next = null;
	}
	public void printNode() {
		System.out.print(data + " ");
	}
}
