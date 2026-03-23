/*
Question 3: The Staircase Problem

A person wants to reach the top of a staircase with n steps.

He can climb either 1 step or 2 steps at a time

Find the total number of distinct ways to reach the top.

👉 Input: n = 5
👉 Output: ?
*/


import java.util.*;
public class StaircaseProblem
{
    static int ways(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 1;
        }
        return ways(n-1)+ways(n-2);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("n= ");
        int n=in.nextInt();
        int k=ways(n);
        System.out.println(k);
    }
}