import java.io.*;
import java.util.*;
public class Pg5{
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
 		String str=sc.next();
 		System.out.println("The given String is "+isPalindrome(str));
	}

	public static String isPalindrome(String str){
		Integer left=0;
 		Integer right=str.length()-1;
 		while(left<right){
 			if (str.charAt(left)!=str.charAt(right)){
 				return "Not Palindrome";
 				}
 			left++;
 			right--;
 			}
 		return "Palindrome";
		}

}