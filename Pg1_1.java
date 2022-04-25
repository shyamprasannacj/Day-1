import java.io.*;
import java.util.*;
public class Pg1_1{
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
 		

 		ArrayList<Integer> arr = new ArrayList<>();
 		Integer size=sc.nextInt();
 		for (int i =0;i<size;i++){
 				arr.add(sc.nextInt());
 		}

 		Integer maxv=Integer.MIN_VALUE;
 		for(Integer x:arr){
 			if (x>maxv){
 				maxv=x;
 			}
 		}
 		System.out.println("Biggest number in the given array is "+maxv);
 		
        
	}
}