class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        
        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
      
        //Arrays.sort() takes more time

        int squares[] = new int[nums.length];
        int x = 0; 
        int k = nums.length-1; 
        int track = nums.length-1; 

        while(x <= k){
            if(nums[x] > nums[k]){
                squares[track] = nums[x];
                x++;
            }
            else{
                squares[track] = nums[k];
                k--;
            }
            track--;
        }

        return squares; 
    }
}
