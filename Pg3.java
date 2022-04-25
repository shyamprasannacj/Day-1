import java.io.*;
import java.util.*;
public class Pg3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		if ( System.getProperty("FileIO")!=null){
 		try	{
 		    sc=null;
 		    System.gc();
 			sc=new Scanner(new FileInputStream("input.txt"));
      		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
 		}catch(Exception ex){} 
 		}
 		
 		
 		Integer n=sc.nextInt();
 		fib(1,1,n-1);

	}

	public static void fib(int a,int b,int n){
		if (n==0) return;
		System.out.println(b );
		fib(b,b+a,--n);
	}

}
//1 1 2 