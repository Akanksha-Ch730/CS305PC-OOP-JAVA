import java.util.Scanner;
class Lab2P2{
	public static void main(String...args){
	Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=x;
			System.out.println("Output is: "+ x++ + ++x);
			x=y;
 			System.out.println("Output is: "+ (x++ + ++x));
			x=y;
			System.out.println( x++ + ++x +"Output is: ");
}
}