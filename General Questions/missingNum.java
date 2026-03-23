
/*
Question 4: The Missing Shipment

A warehouse tracks packages numbered from 1 to n.
However, one package is missing.

You are given an array of size n-1.

👉 Input:
n = 5
arr = [1, 2, 4, 5]

👉 Output: ?
*/


import java.util.*;
public class missingNum
{
    
    static int missingNum1(int arr[]) {
        // code here
        int k=0;
        for(int i=1;i<=arr.length+1;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                k=i;
                break;
            }
        }
        return k;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("n: ");
        int n=in.nextInt();
        int a[]=new int[n-1];
        int k=missingNum1(a);
        System.out.println(k);
    }
}
