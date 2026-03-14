/*
Q – Library Fine Calculation

Problem Statement:
A library keeps track of books borrowed by students. Each element in an array represents the number of days a student kept a book.

If a book is kept for more than K days, the student must pay 1 unit fine for each extra day.

Find the total fine collected.

Input Format:
First line: Integer N (number of students)

Second line: N space-separated integers representing the number of days each student kept the book

Third line: Integer K (allowed number of days)

Output Format:
Print the total fine collected.

Sample Input:
5
3 8 6 10 4
5

Sample Output:
9

Explanation:
For books kept more than 5 days:
8 → 3 extra days
6 → 1 extra day
10 → 5 extra days

Total fine = 3 + 1 + 5 = 9

*/

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            
        }
        System.out.print("k: ");
        int k=in.nextInt();
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>k)
            {
                s=s+(1*(a[i]-k));
            }
        }
        System.out.print(s);
    }
}