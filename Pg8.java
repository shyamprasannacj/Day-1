import java.io.*;
import java.util.*;
public class Pg8{
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
        
        String str=sc.next();
        String copyStr="";
        for (Integer i=0;i<str.length();i++){
            copyStr+=str.charAt(i);
        }
        System.out.println(copyStr);
    }

}
