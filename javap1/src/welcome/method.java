package welcome;

public class method {

	public static void main(String[] args) {
		System.out.println("h_world_1");
		method k =new method();
		k.m2();
		m1();
	
	}
	static void m1(){
		System.out.println("h_world_2");
		method k=new method();
		k.m3();

	}
	void m2() {
		System.out.println("h_world_3");
		m1();
	}
	void m3() {
		System.out.println("h_world_4");

	}

}




