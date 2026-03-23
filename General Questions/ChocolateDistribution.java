
/*
Question 2: Chocolate Distribution

A teacher has n packets of chocolates, each containing different numbers of chocolates.
She wants to distribute chocolates to m students such that:

Each student gets exactly one packet
The difference between max and min chocolates is minimum

👉 Input:
arr = [7, 3, 2, 4, 9, 12, 56]
m = 3

👉 Output: ?
*/


import java.util.*;
import java.io.*;
public class ChocolateDistribution 
{
    
    static void merge(int a[],int low,int mid, int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        
        int left[]=new int[n1];
        int right[]=new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            left[i]=a[low+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=a[mid+1+i];
        }
        
        int l=0,r=0;
        int k=low;
        
        while(l<n1 && r<n2)
        {
            if(left[l]<=right[r])
            {
                a[k]=left[l];
                l++;
            }
            else
            {
                a[k]=right[r];
                r++;
            }
            k++;
        }
        while(l<n1)
        {
            a[k]=left[l];
            l++;k++;
        }
        while(r<n2)
        {
            a[k]=right[r];
            r++;k++;
        }
    }
    static void mergeSort(int a[],int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=low+(high-low)/2;
        
        mergeSort(a, low, mid);
        mergeSort(a,mid+1, high);
        
        merge(a, low, mid, high);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.print("Enter n: ");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("Enter m: ");
        int m=Integer.parseInt(br.readLine());
        mergeSort(a,0, n-1);
        int diff=Integer.MAX_VALUE;;
        for(int i=0;i<=n-m;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<=i+m-1;j++)
            {
                
                max=Math.max(max,a[j]);
                min=Math.min(min,a[j]);
            }
            if(max-min<diff)
            {
                diff=max-min;
            }
            
        }
        System.out.println(diff);
    }
}
