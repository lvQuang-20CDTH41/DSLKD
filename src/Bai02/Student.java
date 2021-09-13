package Bai02;

public class Student {
	private String name;
	private int age;
	private double dtb;
	public Student(String name, int age, double dtb) {
		this.name = name;
		this.age = age;
		this.dtb = dtb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public void printInfo() {
		System.out.println("Ten sv: " + name + "\ttuoi: " + age + "\tdtb: " + dtb); 
	}
	
}
