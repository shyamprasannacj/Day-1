import java.io.*;
import java.util.*;
public class Pg3_1{
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
 		fib(n);

	}

	public static void fib(Integer n){
		
		int a=1;
		int b=1;
		int newa;
		int newb;
		for (Integer i=0;i<n/2;i++){
			newa=a+b;
			newb=newa+b;
			a=newa;
			b=newb;
			System.out.println(a);
			System.out.println(b);

		}
	}
}