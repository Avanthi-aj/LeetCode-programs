class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       int count=0;
      for(int i=0;i<strs[0].length();i++)
       {
           if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
           {
               count++;
           }
           else
           {
               break;
           }
       }
        return strs[0].substring(0,count);
    }
}
