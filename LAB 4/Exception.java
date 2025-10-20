import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exception {

    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        
        try{
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x/y);
        }catch(InputMismatchException ie){
            System.out.println(ie.getClass().getName());
        }catch(ArithmeticException ae){
            System.out.println(ae.getClass().getName()+": "+ae.getMessage());
            
        }
        
    }
}