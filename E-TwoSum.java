class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i =0; i<nums.length; i++){
            for(int k =i+1; k<nums.length; k++){
                if(nums[i] + nums[k] == target){
                    answer[0] = i; 
                    answer[1] = k;
                    return new int[i,k]; 
                }
            }
        }
        return answer; 
    }
}
