import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
         int s1, s2, s3, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
           s1 = s.nextInt();
          
         s2 = s.nextInt();
         for(i = s1; i <= s2; i++)
         {
             flag=1;
             for( j = 2; j <= i/2; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                                 }
             
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}


