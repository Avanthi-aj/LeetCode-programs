class Solution {
    public int countSubstrings(String s) {
        int l = s.length();
        int count=0;
        for(int i=0 ; i<l ; i++){
            for(int j=i ; j<l ; j++){
                int flag=1;
                for(int m=i,n=j ; m<=n ; m++,n--){
                    if(s.charAt(m) != s.charAt(n)){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    count++;
                }
            }
        }
        return count;
    }
}
