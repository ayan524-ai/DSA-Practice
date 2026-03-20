    /*
Count Non-Sorted Strings

You are given n strings. For each string, check whether its characters are in non-decreasing (lexicographically sorted) order.

Return the number of strings that are NOT sorted.
*/
import java.io.*;
public class CountUnsortedString 
{
    static boolean check(String s)
    {
        if(s.length()==1)
        {
            return true;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)>s.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        int n=Integer.parseInt(br.readLine());
        int c=0;
        String a[]=new String[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=br.readLine();
        }
        for(int i=0;i<a.length;i++)
        {
            if(check(a[i])==false)
            {
                c++;
            }
        }
        System.out.println(c);
        
        
    }
}
    

