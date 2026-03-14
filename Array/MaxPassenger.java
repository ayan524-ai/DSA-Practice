/*
Q – Bus Passenger Tracking

Problem Statement:
A bus travels through several stations. At each station, some passengers get off the bus and some passengers get on the bus.

Your task is to determine the maximum number of passengers that were on the bus at any time during the journey.

Input Format:
First line: Integer N (number of stops).

Next N lines: Each line contains two integers:

* Number of passengers getting off the bus
* Number of passengers getting on the bus

Output Format:
Print the maximum number of passengers in the bus at any time.

Sample Input:
4
0 3
2 5
4 2
4 0

Sample Output:
6
*/

import java.util.*;
class MaxPassenger
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int bus[][]=new int[n][2];
        int max=0,maxpas=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                bus[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            
                max=max-bus[i][0];
                max=max+bus[i][1];
                if(max>maxpas)
                {
                    maxpas=max;
                }
            
        }
        System.out.println(maxpas);
        
    }
}