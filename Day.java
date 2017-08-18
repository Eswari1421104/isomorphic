import java.util.*;
public class Day
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a="";
        String day=s.next();
        if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")||day.equals("saturday"))
        {
           a="true" ;
        }
        if(a.equals("true"))
        {
            System.out.println("WorkingDay");
        }
        else
        {
            System.out.println("Holiday");
        }
    }
}
