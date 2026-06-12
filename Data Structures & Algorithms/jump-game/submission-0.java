class Solution {
    public boolean canJump(int[] nums) {
        int goalIndex = nums.length-1;
        for(int i = nums.length-1; i>=0; i--){

            int farthestIndex = i+nums[i];
            if(farthestIndex >= goalIndex){
                goalIndex = i;
            }
        }
        
        if(goalIndex == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
