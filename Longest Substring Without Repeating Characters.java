class Solution 
{
    public int lengthOfLongestSubstring(String s)
    {
       int ans=0;
       for(int i=0;i<s.length();i++)
       {
           int[] freq=new int[256];
           for(int j=i;j<s.length();j++)
           {
               if(freq[s.charAt(j)]>0)
               {
                   break;
               }
               else
               {
                   freq[s.charAt(j)]++;
               }
               if(ans < j-i+1)
                {
                    ans=j-i+1;
                }
           }
       }
       return ans;
    }
}
