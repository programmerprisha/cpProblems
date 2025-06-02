class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int firstNum = first(nums, target); 
        int lastNum = last(nums, target);
        int[] ans = new int[2];
        ans[0] = firstNum; 
        ans[1] = lastNum; 

        return ans; 
    }
     public int last (int[] nums, int target){
            int low = 0; 
            int high = nums.length-1; 
            int answer = -1; 

            while(low <= high){
                int mid = low + (high - low) / 2; 
                if(nums[mid] == target){
                    answer = mid; 
                    low = mid + 1; 
                }
                else if(nums[mid] < target){
                    low = mid + 1; 
                }
                else{
                    high = mid - 1; 
                }
            }
            return answer; 

        }

        public int first(int nums[], int target){
            int low = 0; 
            int high = nums.length - 1; 
            int answer = -1; 

            while(low <= high){
                int mid = low + (high - low) / 2; 
                if(nums[mid] == target){
                    answer = mid; 
                    high = mid - 1; 
                }
                else if(nums[mid] < target){
                    low = mid + 1; 
                }
                else{
                    high = mid - 1; 
                }
            }
            return answer; 
        }
}
