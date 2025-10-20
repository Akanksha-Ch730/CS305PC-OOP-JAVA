import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		Lab3P4 l = new Lab3P4();
		Lab3P4 l2 = new Lab3P4(a);
		Lab3P4 l3 = new Lab3P4(b);
		Lab3P4 l4 = new Lab3P4(a,b);
		l.display(); l2.display(10); l3.display("String"); l4.display(10,"String");
	}

		Lab3P4()
		{
			System.out.println("Constructor Without Params:");
		}
		Lab3P4(int a)
		{
			System.out.println("Constructor With int Params:"+a);
		}
		Lab3P4(String b)
		{
			System.out.println("Constructor With string Params:"+b);
		}
		Lab3P4(int a,String b)
		{
			System.out.println("Constructor int and String Params:"+a+" "+b);
		}
		void display()
		{
			System.out.println("Display Without Params:");
		}
		void display(int a)
		{
			System.out.println("Display With int Params:"+a);
		}
		void display(String b)
		{
			System.out.println("Display With string Params:"+b);
		}
		void display(int a,String b)
		{
			System.out.println("Display int and String Params:"+a+" "+b);
		}
}