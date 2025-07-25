class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int perimeter = 0; 

        for(int i = nums.length-1; i > 1; i--){
            if(nums[i] <  nums[i-1] + nums[i-2] && ((nums[i] + nums[i-1] + nums[i-2]) > perimeter)){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0; 
    }
}
