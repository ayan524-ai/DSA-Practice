/*
Detect Capital Usage

We define the usage of capital letters in a word to be correct when one of the following conditions is true:

All letters in the word are uppercase

Example: "USA"

All letters in the word are lowercase

Example: "leetcode"

Only the first letter in the word is uppercase

Example: "Google"
*/
import java.util.*;
public class DetectCapitalUsage
{
    static boolean check(String s)
    {
        int n=s.length();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c)==true)
            {
                count++;
            }
        }
        if(count==1 && Character.isUpperCase(s.charAt(0))==true)
        {
            return true;
        }
        if(count==n || count==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=in.nextLine();
        boolean answer=check(s);
        System.out.println(answer);
        
    }
}