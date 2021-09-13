package Bai02;

import java.util.Scanner;

public class LinkedList {
	Scanner sc = new Scanner(System.in);
	Node first;
	LinkedList(){
		this.first = null;
	}
	// Them 1 sinh vien
	public void add(Node node) {
		node.next = first;
		first = node;
	}
	// Them nhieu sinh vien
	public void insertAt() {
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap ten sv: ");
			String name = sc.next();
			System.out.print("Nhap tuoi: ");
			int age = sc.nextInt();
			System.out.print("Nhap dtb: ");
			double dtb = sc.nextDouble();
			add(new Node(new Student(name, age, dtb)));
		}
	}
	// Hien thi sinh vien
	public void printList() {
		Node p = first;
		System.out.println("Danh sach sinh vien: ");
		while(p != null) {
			p.printData();
			p = p.next;
		}
	}
	// Sinh vien co dtb > 5
	public void checkDtb() {
		Node c = first;
		int s = 0;
		while(c != null) {
			if(c.getDtb() > 5) {
				s++;
			}
			c = c.next;
		}
		System.out.println("Sv co DTB lon hon 5: " + s);
	}
	// age > 25 && dtb > 8
	public void ageDtb() {
		Node a = first;
		System.out.print("Cac sv co dtb > 8 va age > 25: ");
		while(a != null) {
			if(a.getDtb() > 8 && a.getAge() > 25) {
				a.printData();
			}
			a = a.next;
		}
	}
}
