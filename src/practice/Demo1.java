package practice;

public class Demo1 {
	void m() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		System.out.println(obj);
		obj.m();

	}

}
