class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int n: nums){
            map.put(n, false);
        }

        int maxLength = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            
            int currentLength = 1;
            int prevElement = nums[i]-1;
            while(map.containsKey(prevElement)){
                currentLength++;
                map.put(prevElement, true);
                prevElement -= 1;
            }

            int nextElement = nums[i]+1;
            while(map.containsKey(nextElement)){
                currentLength++;
                map.put(nextElement, true);
                nextElement += 1;
            }

            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }
}
