import java.io.*;
import java.util.*;
public class Pg2_2{
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
 		
 		int arr[]=new int[]{10,12,19,11,11,9};
 		Integer index=0,temp;
 		for(Integer i=0;i<arr.length-1;i++){
 			index=arr.length-i-1;
 			for (Integer j=0;j<arr.length-i-1;j++){
 			
 				if (arr[j]>arr[index]){
 					index=j;
 				}
 			}
 			temp=arr[arr.length-i-1];
 			arr[arr.length-i-1]=arr[index];
 			arr[index]=temp;
 		}
 		for(Integer x: arr){
 			System.out.println(x);
 		}
	}
}