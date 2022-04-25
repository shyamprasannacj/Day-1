import java.io.*;
import java.util.*;
public class Pg1{
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
 		
 		Integer arr[]=new Integer[]{10,12,19,0,1212,313};
 		Integer maxv=Integer.MIN_VALUE;
 		for(Integer x:arr){
 			if (x>maxv){
 				maxv=x;
 			}
 		}
 		System.out.println("Biggest number in the given Number is "+maxv);
 		
        
	}
}