package inheritance3;

public class T12 extends T10 {       
	
	public  void M3() {
		System.out.println("calling 12th class");
	}
	
	public  void M4() {
		System.out.println("12th class information");
	}
public static void main(String[] args) {
	T12 dio=new T12();
dio.M1();
dio.M2();
dio.M3();dio.M4();
}
}


