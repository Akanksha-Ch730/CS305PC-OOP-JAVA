import java.util.Scanner;
class Lab3P3{
	public static void main(String...args){
		Lab3P3 l = new Lab3P3();
		l.show(); l.show(10); l.show("String"); l.show(10,"String");
	}
	public void show(){
		System.out.println("Method without params:");
	}
	public void show(int x){
		System.out.println("Method without params:"+x);
	}
	public void show(String s){
		System.out.println("Method without params:"+s);
	}
	public void show(int x , String s){
		System.out.println("Method without params:"+ x +" "+s);
	}
}