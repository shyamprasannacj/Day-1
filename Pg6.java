import java.io.*;
import java.util.*;
public class Pg6{
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
 		
 		System.out.print(findSize(sc));
	}
	static int findSize(Scanner sc){
		int count=0;
		char[] chrarr= sc.next().toCharArray();;
		for (Character x:chrarr) count++; 
		return count;
	}
}