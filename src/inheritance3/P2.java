package inheritance3;

public class P2  {

		int i;
		String name;

		public P2() {
			this.M1();
			System.out.println("this is a contructor");
		}

		public P2(int i) {
			System.out.println("enter the value of i=" + i);
		} // o/p 10 sheetal 2. o/p default

		public P2(String name) {
			
			System.out.println("name=" + name);
		}

		public P2(int i, String name) {
			this();
			this.i=i;
			this.name=name;
			this.M1();
			System.out.println("name=" + name);
			System.out.println("int =" + i);            

		}

		public void M1() {
			System.out.println("calling method M1");
			int a = 30;
			int b = 20;
			int sub = a - b;
			System.out.println(sub);
			System.out.println("name=" + name);
			System.out.println("int =" + i); 
		}
		public void M2() {
			System.out.println("calling method M2");
			int m = 30;
			int n = 20;
			int mul = m * n;
			System.out.println(mul);
		}

		public static void main(String[] args) {
			P2 var = new P2(10,"simran");
		}
	}

