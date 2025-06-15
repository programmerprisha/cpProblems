class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int track = 0; 
        int count = 0; 

        if(nums.length < 3){
            return 0; 
        }

        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                track++;
                count+=track;
            }
            else{
                track = 0; 
            }
        }
        return count;
    }
}
