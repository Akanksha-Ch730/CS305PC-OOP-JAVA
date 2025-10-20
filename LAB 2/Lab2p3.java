import java.util.Scanner;
class Lab2P3{
	public static void main(String...args){
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	String op=s.next();

	var str = switch(op){
		case "++" -> "HELLO";
		case "--", "+", "~" -> "NOT GOOD";
		case "Integer" -> 25;
		default -> "SORRY";
		};
		System.out.println("Result is :"+str);
	}
}