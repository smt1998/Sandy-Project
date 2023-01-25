package inheritance3;

public class TENGG extends T12, extends T10 {
	public  void M5() {
		System.out.println("calling 10th class");
	}
	
	public  void M6() {
		System.out.println("10th class information");
	}
public static void main(String[] args) {
	
	TENGG NEW=new TENGG();
	NEW.M1();
	NEW.M2();
	NEW.M3();
	NEW.M4();
	NEW.M5();
	NEW.M6();
}

}
