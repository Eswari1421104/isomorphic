import java.io.*;
import java.util.*;
public class Swapping
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       int i=0;
       
                String str1=s.next();
        
        char ch[]=str1.toCharArray();
        
        for(i=0;i<str1.length()-1;i=i+2)
        {
            char temp= ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            
        }
        System.out.println(ch);
    }
}


