package Bai01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addN();
		list.printOdd();
		list.average();
		System.out.print("Nhap gia tri muon tim kiem: ");
		int s = sc.nextInt();
		System.out.printf("Co phan tu nao co gia tri %d ko: %b\n", s ,list.search(s));
		System.out.printf("Nhap x: ");
		int x = sc.nextInt();
		System.out.printf("Nhap y: ");
		int y = sc.nextInt();
		list.division(x, y);
		list.sort();
		
	}
}
