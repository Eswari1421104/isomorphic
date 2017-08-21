import java.util.*;
public class StringRvrs
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuffer str1=new StringBuffer(str);
        StringBuffer a=new StringBuffer();
        a=str1.reverse();
        String b=a.toString();
            System.out.println(b.replaceAll("[aeiouAEIOU]",""));
        
   }
}

