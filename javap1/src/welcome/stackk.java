package welcome;

public class stackk {
//	*********************
	static {
		System.out.println("s_1");
		stackk k =new stackk();
	}
	
	static {
		System.out.println("s_2");
		stackk k =new stackk();
	}
	
//********************
	{
		System.out.println("i_1");
		
	}
	
	{
		System.out.println("i_2");
	}	

//*****************
	public static void main(String[] args) {
		System.out.println("main method start");
		stackk k =new stackk();
	}
	
//	{
//		System.out.println("i_1");
//	}
//	
//	{
//		System.out.println("i_2");
//	}
}

