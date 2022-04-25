import java.io.*;
import java.util.*;
public class Pg2_1{
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
 		
 		Integer arr[]=new Integer[]{10,12,1010,11,9};
 		
 		for(Integer i =0;i<arr.length-1;i++){
 			for (Integer j=0;j<arr.length-i-1;j++){
 				Integer temp;
 				if (arr[j]>arr[j+1]){
 					temp=arr[j];
 					arr[j]=arr[j+1];
 					arr[j+1]=temp;
 				}
 			}
 		}
 		
 		for(Integer x: arr){
 			System.out.println(x);
 		}
        
	}
}