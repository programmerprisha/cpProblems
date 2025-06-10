class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0; 
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        int leftSum = 0; 
        for(int k = 0; k < nums.length; k++){
            int rightSum = totalSum - leftSum - nums[k]; 
            if(leftSum == rightSum){
                return k; 
            }
            leftSum+=nums[k];
        }
        return -1; 
    }
}
