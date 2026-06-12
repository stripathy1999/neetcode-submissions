class Solution {
    public int jump(int[] nums) {
        int currFar = 0;
        int currEnd = 0;
        int jumps = 0;
        for(int i=0; i<nums.length-1; i++){
            currFar = Math.max(i+nums[i], currFar);

            if(i == currEnd){
                jumps++;
                currEnd = currFar;
            }
        }
        return jumps;
    }
}
