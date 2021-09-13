package Bai02;

public class Node {
	private Student std;
	Node next;
	Node(Student std){
		this.std = std;
		next = null;
	}
	public void printData() {
		std.printInfo();
	}
	public double getDtb() {
		return std.getDtb();
	}
	public int getAge() {
		return std.getAge();
	}
}
