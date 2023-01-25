import java.util.Scanner;
public class SS3 {
public static void M1(String i) {
	switch(i) {
	case "sumit": System.out.println("GO TO MUMABAI");
	break;
	case "sheetal": System.out.println("GO TO DUBAI");
	break;
	case "kalynai": System.out.println("GO TO SINGAPUR");
	break;
	case "disha": System.out.println("GO TO MALESIA");
	break;
	case "prachi": System.out.println("GO TO IRAK");
	break;
	default: System.out.println("GO TO HOME");
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of i = ");
String i=sc.next();
M1(i);
	
}
















}
