import java.io.*;
import java.util.*;
public class Pg9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if ( System.getProperty("FileIO")!=null){
        try {
            sc=null;
            System.gc();
            sc=new Scanner(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        }catch(Exception ex){} 
        }
        
        String[] arr = {"Apple","Orange","Ant","Banana"};

        String temp;
        for(Integer i =0;i<arr.length-1;i++){
            for (Integer j=0;j<arr.length-i-1;j++){
                if (arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (Integer i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }

}
