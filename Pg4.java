import java.io.*;
import java.util.*;
public class Pg4{
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
 		System.out.println(fact(n));

	}

	public static int fact(Integer n){
			if (n==0) return 1; 
			 return fact(n-1)*n;
	}
}