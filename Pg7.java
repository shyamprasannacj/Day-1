import java.io.*;
import java.util.*;
public class Pg7{
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
        Integer upper=0,lower=0,specialchar=0,digits=0; 
        String str=sc.next();
        for(Integer i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if (temp>='a' && temp<='z'){
                lower++;continue;
            }
            else if (temp>='A' && temp<='Z'){
                upper++;continue;
            }
            else if (temp>='0' && temp<='9'){
                digits++;continue;
            }
            else{
                specialchar++;
            }
        }
        System.out.println("No of Lowercase   :"+lower);
        System.out.println("No of Uppercase   :"+upper);
        System.out.println("No of digits      :"+digits);
        System.out.println("No of specialchar :"+specialchar);
    }

}
