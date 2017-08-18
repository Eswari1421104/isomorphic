import java.io.*;
import java.util.*;
public class Camelcase
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String res="";
        char f=str.charAt(0);
        res=res+Character.toUpperCase(f);
        for(int i=1;i<str.length();i++)
        {
           char curchar=str.charAt(i);
          char  prechar=str.charAt(i-1);
            if(prechar==' ')
            {
                res=res+Character.toUpperCase(curchar);
            }
            else
            {
                res=res+curchar;
            }
        }
        
        if(res.equals(str))
        {
            System.out.println("Camelcase");
        }
        else
        {
            System.out.println("Not a Camelcase");
        }
        
    }
}
