class SingleNumber {
    // my original solution
    public int singleNumber(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>(); 
        for(int i =0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                numbers.remove(Integer.valueOf(nums[i])); 
            }
            else{
                numbers.add(nums[i]);
            }
        }
        return numbers.get(0);
    }

    // more efficient solution
    public int singleNumberEfficient(int[] nums) {
        int answer = 0; 
        for(int k = 0; k< nums.length; k++){
            answer ^= nums[k];
        }
        return answer; 
    }
}
