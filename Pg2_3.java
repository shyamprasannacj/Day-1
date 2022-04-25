import java.io.*;
import java.util.*;
public class Pg2_3{
	public static void merge(Integer arr[],int left,int right,int mid){
		
		Integer size1=mid-left+1;
		Integer size2=right-mid;
		Integer i=0,j=0,k=left,temp;
		 
		Integer leftarr[]=new Integer[size1];
		Integer rightarr[]=new Integer[size2];

		for (Integer x=0;x<size1;x++) leftarr[x]=arr[left+x];
		for (Integer x=0;x<size2;x++) rightarr[x]=arr[mid+1+x];
	
		while (i<size1 && j<size2){
			if (leftarr[i]<=rightarr[j]){
				arr[k]=leftarr[i];
				i++;
			}
			else{
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
		while(i<size1){
			arr[k]=leftarr[i];
			k++;i++;
		}
		while(j<size2){
			arr[k]=rightarr[j];
			k++;j++;
		}
	}
	public static void sort(Integer arr[],int start,int end){
		
		if(start<end){
			int mid=(start+end)/2;
			sort(arr,start,mid);
			sort(arr,mid+1,end);
			merge(arr,start,end,mid);
		}
	}
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
 		
 		Integer arr[]=new Integer[]{918,922,75,310,491,630,263,826};
 		Integer index=0,temp;
 		
 		sort(arr,0,arr.length-1);
 		for (Integer x: arr) System.out.println(x);
	}


}