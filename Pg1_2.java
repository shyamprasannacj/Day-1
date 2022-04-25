import java.io.*;
import java.util.*;


class Node{
	int data;
	Node next;

	public Node(int x){
		data=x;
		next=null;
	}
}


class ArrList{
	Node head=null;
	Node cur=null;
	void add(int x){
		Node newNode=new Node(x);
		if (head==null){
			head=newNode;
			cur=newNode;
		}
		else{
			cur.next=newNode;
			cur=newNode;
		}
	}
	int max(){
		Integer maxv=Integer.MIN_VALUE;
		Node temp=head;
		while(temp!=null){
			if (temp.data>maxv){
 				maxv=temp.data;
 			}
			temp=temp.next;
		}
		return maxv;
	}
}




public class Pg1_2{
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
 		ArrList arr=new ArrList();
 		while(true){
 				try{
 				arr.add(sc.nextInt());
 				}
 				catch(Exception ex){
 					//System.out.println(ex);
 					//NoSuchElementException
 					//It is the child class of RuntimeException and hence it is an unchecked exception. This exception is rise automatically by JVM
 					break;
 				}
 		}
 	    System.out.println("Biggest number in the given array is "+arr.max());   
	}
}