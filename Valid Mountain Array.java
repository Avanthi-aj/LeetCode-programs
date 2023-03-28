class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE,j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                j=i;
            }
        }
        if(j==0 || j==arr.length-1)
        {
            return false;
        }
        for(int i=0;i<j;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        for(int i=j;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
