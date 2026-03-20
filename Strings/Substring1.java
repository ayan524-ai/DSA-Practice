/*
Problem: Count Substrings with Only ‘1’s

You are given a binary string s (containing only '0' and '1').

📌 Task

Return the total number of substrings that contain only '1' characters.

📥 Input

A binary string s

📤 Output

An integer → number of substrings consisting only of '1'

🧪 Example
Input: 0110111
Output: 9
🔍 Explanation

Substrings with only '1':

"1" → 5 times

"11" → 3 times

"111" → 1 time

Total:

5 + 3 + 1 = 9
*/
import java.util.*;
class Main
{
    static int sum(String s)
    {
        char c='1';
        String st="";
        int count=0;
        int finalcount=0;
        int n=s.length();
        while(count<=n)
        {
             st=st+c;
            count++;
            for(int i=0;i<=n-count;i++)
            {
                String temp=s.substring(i,i+count);
                if(temp.equals(st))
                {
                    finalcount++;
                }
            }
            
        }
        return finalcount;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int answer=sum(s);
        System.out.println(answer);
        
        
    }
}