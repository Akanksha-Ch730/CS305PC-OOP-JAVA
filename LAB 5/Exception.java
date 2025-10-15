import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exception {

    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       try{
        int x=scan.nextInt();
       int y=scan.nextInt();
        System.out.println(x/y);
       }
       catch(InputMismatchException ae){
        System.out.println(ae.getClass().getName());}
        
        catch(ArithmeticException ae){
             System.out.println(ae.getClass().getName()+ ": "+ ae.getMessage());}
        
            
        }
        
            
        }
