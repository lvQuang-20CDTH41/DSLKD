package Bai01;
import java.util.Scanner;
public class LinkedList {
	Scanner sc = new Scanner(System.in);
	Node first, tail;
	// Them 1 phan tu
	public void add(int x) {
		Node new_node = new Node(x);
		if(first == null) {
			first = tail = new_node;
		}else {
			tail.next = new_node;
			new_node.prev = tail;
			tail = new_node;
		}
	}
	// Them n phan tu
	public void addN() {
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap gia tri: ");
			int x = sc.nextInt();
			add(x);
		}
	}
	// Hien thi phan tu
		public void print() {
			Node p = first;
			while(p != null) {
				p.printNode();
				p = p.next;
			}
			System.out.println();
		}
	// Hien thi phan tu le
	public void printOdd() {
		Node p = first;
		System.out.print("Hien thi gia tri cac phan tu le: ");
		while(p != null) {
			if(p.data % 2 != 0) {
				p.printNode();
			}
			p = p.next;
		}
		System.out.println();
	}
	// Trung binh cong
	public void average() {
		Node node = first;
		int s = 0, i = 0;
		while(node != null) {
			s += node.data;
			i++;
			node = node.next;
		}
		System.out.println("Trung binh cong: " + s/i);
	}
	// Kiem tra x
	public boolean search(int x) {
		Node s = first;
		while(s != null) {
			if(s.data == x) {
				return true;
			}
			s = s.next;
		}
		return false;
	}
	// Chia het cho x ma k chia het cho y
	public void division(int x, int y) {
		Node d = first;
		int s = 0;
		while(d != null) {
			if(d.data % x == 0 && d.data % y != 0) {
				s++;
			}
			d = d.next;
		}
		System.out.printf("Tong phan tu chia het cho %d, khong chia het cho %d: %d",x,y,s);
	}
	// kiem tra sap xep tang dan khong
	public boolean checkSort() {
		Node c = first;
		while(c != null) {
			if(c.data > c.next.data) {
				return false;
			}
			c = c.next;
		}
		return true;
	}
	// sap xep tang dan
	public void sort() {
		System.out.println("Danh sach co sap xep tang dan ko: " + checkSort());
		Node a = first;
		if(checkSort() == false) {
			while(a != null) {
				Node b = a.next;
				while(b != null) {
					if(a.data > b.data) {
						int c = a.data;
						a.data = b.data;
						b.data = c;
					}
					b = b.next;
				}
				a = a.next;
			}
			System.out.print("Sap xep tang dan: ");
			print();
		}
	}
}
