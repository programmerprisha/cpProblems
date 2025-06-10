class LargestNumberTwice {
    public int dominantIndex(int[] nums) {
        int largest = 0; 
        int largestIndex = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                largestIndex = i;
            }
        }

        for(int k = 0; k < nums.length; k++){
            if(k == largestIndex){
                continue;
            }
            else{
                if(nums[k] * 2 > largest){
                    return -1; 
                }
            }
        }

        return largestIndex;
    }
}
