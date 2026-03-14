/*
Second Largest Element in an array
*/

import java.util.*;
class Solution {
    static int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max2 && arr[i]<max)
            {
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE)
        {
            return -1;
        }
        return max2;
    }
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int answer=getSecondLargest(a);
        System.out.println("2nd Largest: "+answer);
    }
}