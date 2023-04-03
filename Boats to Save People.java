class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int bCount = 0 , l = 0;
        Arrays.sort(people); 
        int r = people.length - 1; 
        while(l <= r){
            int sum = people[l] + people[r];
            if(sum <= limit){
                l++;
            } 
            bCount++;
            r--;  
        }
        return bCount;
    }
}
