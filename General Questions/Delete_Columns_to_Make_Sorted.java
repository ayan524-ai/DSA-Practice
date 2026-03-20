/*
Delete Columns to Make Sorted

You are given an array of n strings where each string has the same length.

Each string represents a row in a grid.
*/
import java.io.*;
class Delete_Columns_to_Make_Sorted
{
    
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        int n=Integer.parseInt(br.readLine());
        int count=0;
        String a[]=new String[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=br.readLine();
        }
        String s=a[0];
        
        for(int i=0;i<s.length();i++)
        {
            int flag=0;
            char c=s.charAt(i);
            char co=c;
            for(int j=0;j<a.length;j++)
            {
                String temp=a[j];
                char ct=temp.charAt(i);
                if(co<ct || co==ct)
                {
                    co=ct;
                    break;
                }else{
                    flag=1;
                    
                }
                
                
            }
            if(flag==1)
            {
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}