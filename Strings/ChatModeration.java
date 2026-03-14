/*
Q – Chat Moderation System

Problem Statement:
A chat platform wants to detect spam. If a message contains three consecutive identical characters, it is considered spam.

Given a message string, determine whether it is Spam or Safe.

Input Format:
A single string S

Output Format:
Print "Spam" if the string contains three consecutive identical characters.
Otherwise print "Safe".

Sample Input:
Heyyy

Sample Output:
Spam

Explanation:
The string contains "yyy", which are three consecutive identical characters.

*/

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        int flag=0;
        for(int i=0;i<st.length()-2;i++)
        {
            char c=st.charAt(i);
            if(st.charAt(i+1)==c && st.charAt(i+2)==c)
            {
                System.out.println("Spam");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Safe");
        }
        
    }
}