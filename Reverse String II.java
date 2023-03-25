class Solution {
    public String reverseStr(String s, int k) {
       int n=s.length();
       char arr[] = s.toCharArray();
       if(n<k)
       {
           for(int i=0,j=n-1 ; i<=j ; i++,j--)
           {
               char temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       else
       {
           for(int i=0; i<n-1; i+=2*k)
            {
                if(i>n-k && i>=k)
                {
                    for(int l=i,j=n-1 ; l<=j ; l++,j--)
                    {
                        char temp = arr[l];
                        arr[l] = arr[j];
                        arr[j] = temp;
                    }
                }
                else
                {
                    for(int l=i,j=i+k-1 ; l<=j ; l++,j--)
                    {
                        char temp = arr[l];
                        arr[l] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
       }
       String ans = "";
       for(int i=0; i<n; i++)
       {
           ans+=arr[i];
       }
       return ans;
    }
}
