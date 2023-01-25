
public class SS2 {

	public static void M1() {
//		PRE DECREMENT
		int a=10;  // 1 value update
		int b=0;   // 2 value use
		b=--a;
		System.out.println("PRE DECREMENT OPRATOR");
		System.out.println(a);//9
		System.out.println(b);//9

	}
	public static void M2() {
		int a=10;  // 1 value use
		int b=0;   // 2 value update
		b=a--;
		
		System.out.println("POST DECREMENT OPRATOR");
		System.out.println(a); // 9 
		System.out.println(b);  //10

	}
	public static void main(String[] args) {
		M1();
		M2();
		
		
		
		
		
		
	}
}