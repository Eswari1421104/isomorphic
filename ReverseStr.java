import java.util.Scanner;
public class ReverseStr
{
    public static void main(String args[])
    {
         
         Scanner s = new Scanner(System.in);
          String str=s.next();
          StringBuffer a=new StringBuffer(str);
          System.out.println(a.reverse());
          
         
    }
}



